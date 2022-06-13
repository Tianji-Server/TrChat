---
description: 插件命令列表。
---

# 命令 Command

### 主命令

> 插件主命令

* 名称: `trchat` `trc`
*   权限: `trchat.access`



    * **reload**

    > 手动重载插件配置 权限: `trchat.command.reload`

    * **controlPanel**

    > 打开玩家控制面板 权限: `trchat.command.controlpanel`

    * **chatFilter**

    > 打开过滤器界面 权限: `trchat.command.chatFilter`

    * **mirror**

    > 查看性能消耗 权限: `trchat.command.mirror`

### 私聊

> 向玩家发送私聊

* 名称: `msg` `message` `tell` `talk` `m` `whisper` `w`
* 权限: `trchat.private`

### 回复

> 回复刚刚向你发送私聊的玩家

* 名称: `reply` `r`
* 权限: `trchat.private`

### 喊话

> 向跨服端发送全服消息

* 名称: `shout` `all` `global`
* 权限: `trchat.global`

### 禁言/全员禁言

> 禁止玩家发言

* 名称: 单人:`mute` 全员:`muteall` `globalmute`
* 权限: `trchat.mute`

### 频道

> 切换聊天频道

* 名称: `channel` `chatchannel` `trchannel`
* 权限: `trchat.channel`

### 撤回消息

> 撤回玩家消息

* 名称: `removemessage`
* 权限: `trchat.removemessage`

### 监听

> 切换监听玩家私聊模式

* 名称: `spy`
* 权限: `trchat.admin`

### 隐身

> 开启后玩家无法用命令补全, 也无法被@

* 名称: `vanish`
* 权限: `trchat.admin`

