package me.arasple.mc.trchat.module.internal.proxy

import me.arasple.mc.trchat.module.internal.redis.RedisManager
import org.bukkit.Bukkit
import taboolib.common.platform.Platform
import taboolib.common.platform.PlatformSide
import taboolib.common.platform.function.onlinePlayers
import taboolib.module.chat.uncolored

/**
 * @author Arasple
 * @date 2019/8/4 21:28
 */
@PlatformSide([Platform.BUKKIT])
object BukkitPlayers {

    private var players = listOf<String>()

    fun isPlayerOnline(target: String): Boolean {
        val player = Bukkit.getPlayerExact(target)
        return player != null && player.isOnline || players.any { p -> p.equals(target, ignoreCase = true) }
    }

    fun getPlayerFullName(target: String): String? {
        var player = Bukkit.getPlayerExact(target)
        if (player == null) {
            player = Bukkit.getOnlinePlayers().firstOrNull { it.displayName == target }
        }
        return if (player != null && player.isOnline) {
            player.name
        } else if (!RedisManager.enabled) {
            players.firstOrNull { it.equals(target, ignoreCase = true) }
        } else {
            target
        }
    }

    fun getPlayers(): List<String> {
        val result = mutableSetOf<String>()
        result += players
        result += onlinePlayers().mapNotNull { it.displayName?.uncolored() }
        result += onlinePlayers().map { it.name }
        return result.filter { it.isNotBlank() }
    }

    fun setPlayers(players: List<String>) {
        BukkitPlayers.players = players
    }

}