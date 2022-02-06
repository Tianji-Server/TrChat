package me.arasple.mc.trchat.module.internal.menu

import me.arasple.mc.trchat.common.chat.ChatMessage
import me.arasple.mc.trchat.internal.data.Users
import org.bukkit.entity.Player
import taboolib.common.platform.function.onlinePlayers
import taboolib.common5.Coerce
import taboolib.library.xseries.XMaterial
import taboolib.module.ui.openMenu
import taboolib.module.ui.type.Basic
import taboolib.module.ui.type.Linked
import taboolib.platform.util.buildItem
import taboolib.platform.util.inventoryCenterSlots
import taboolib.platform.util.nextChat
import taboolib.platform.util.sendLang

/**
 * MenuControlPanel
 * me.arasple.mc.trchat.internal.menus
 *
 * @author wlys
 * @since 2021/8/20 20:47
 */
object MenuControlPanel {

    fun displayFor(player: Player) {
        player.openMenu<Linked<Player>>("TrChat Control Panel") {
            rows(6)
            slots(inventoryCenterSlots)
            elements { onlinePlayers().map { it.cast() } }
            setPreviousPage(47) { _, hasPreviousPage ->
                if (hasPreviousPage) {
                    buildItem(XMaterial.SPECTRAL_ARROW) { name = "§fPrevious page" }
                } else {
                    buildItem(XMaterial.ARROW) { name = "§8Previous page" }
                }
            }
            setPreviousPage(51) { _, hasPreviousPage ->
                if (hasPreviousPage) {
                    buildItem(XMaterial.SPECTRAL_ARROW) { name = "§fNext page" }
                } else {
                    buildItem(XMaterial.ARROW) { name = "§8Next page" }
                }
            }
            onGenerate { _, element, _, _ ->
                buildItem(XMaterial.PLAYER_HEAD) {
                    skullOwner = element.name
                    name = "&e${element.name}"
                    lore += listOf(
                        "",
                        "&a➦ Click to view",
                        ""
                    )
                    colored()
                }
            }
            onClick { event, element ->
                each(event.clicker, element)
            }
        }
    }

    private fun each(player: Player, target: Player) {
        player.openMenu<Basic> {
            rows(3)
            map("", "P#M#R####")
            set('P', XMaterial.PLAYER_HEAD) {
                skullOwner = target.name
                name = "&e${target.name}"
                lore += listOf(
                    "",
                    "&aLast message: &7${Users.getLastMessage(target.uniqueId)}",
                    ""
                )
                colored()
            }
            set('M', XMaterial.REDSTONE) {
                name = "&cMute"
                colored()
            }
            set('R', XMaterial.STRING) {
                name = "&bRemove last message"
                colored()
            }
            onClick(lock = true) { clickEvent ->
                when (clickEvent.slot) {
                    'M' -> {
                        player.closeInventory()
                        player.sendMessage("Type the time of muting(in minute), 0 = remove mute")
                        player.nextChat {
                            if (Coerce.asInteger(it).isPresent) {
                                Users.updateMuteTime(target, Coerce.toLong(it) * 60)
                                player.sendLang("Plugin-Done")
                            } else {
                                player.sendLang("Plugin-Failed")
                            }
                        }
                    }
                    'R' -> {
                        Users.formattedMessages[target.uniqueId]?.removeLastOrNull()?.let {
                            if (it.isNotEmpty()) {
                                ChatMessage.removeMessage(it.replace("\\s".toRegex(), "").takeLast(32))
                                ChatMessage.releaseMessage()
                                Users.setLastMessage(target.uniqueId, "")
                                player.sendLang("Plugin-Done")
                            }
                        }
                    }
                }
            }
        }
    }
}