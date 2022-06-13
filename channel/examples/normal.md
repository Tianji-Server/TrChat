---
description: 默认聊天格式。
---

# 默认 Normal

```yaml
# 聊天选项
Options:
  # 聊天范围，ALL表示所有地方都可以看到
  Target: ALL
  # 自动加入频道 
  Auto-Join: true

# 聊天格式
Formats:
  # 条件,可用Kether或者js，默认优先使用Kether，如想用js，即js：player.hasPermission("xxx")即可
  - condition: ~ 
    # 优先级,越大越优先
    priority: 100 
    # 聊天格式选项
    msg: 
      # 默认字体颜色
      default-color: '&7'
      # 发送的信息的展示框 
      hover: '&7Date: %server_time_h:mm:ss a%'
    # 聊天前缀格式 
    prefix: 
      world: 
        # 前面部分的格式，就是从最左边开始的格式
        text: '&8[&3%player_world%&8]' 
        # 悬浮框内容
        hover: |- 
          &r 
          &8▪ &7Location: &3%player_world%&7, &2%player_x%/%player_y%/%player_z% 
          &r &6▶ &eClick here to send a teleport request &r
        # 点击执行指令 
        command: '/tpa %player_name%'
      # 聊天信息前缀，即发送的消息左边一格的内容 
      part-before-player: 
        text: ' ' 
      # 聊天消息左边的内容
      player: 
          # 这里是条件，和上方是一样的，并且可以套娃
          # 不会出现一起显示的问题
        - condition: 'player op' 
          text: '&4%player_name%' 
          hover: |- 
            &r 
            &8▪ &7Ping: &3%player_ping% Ms 
            &8▪ &7Health: &c%player_health_rounded% ❤ 
            &r 
            &6▶ &eClick to contact with op 
            &r 
          suggest: '/msg %player_name% ' 
        - text: '&7%player_name%' 
          hover: |- 
            &r 
            &8▪ &7Ping: &3%player_ping% Ms 
            &8▪ &7Health: &c%player_health_rounded% ❤ 
            &r 
            &6▶ &eClick to chat with me &r 
          suggest: '/msg %player_name% ' 
        # 聊天信息和玩家格式中间的内容
          part-before-msg: 
            text: '&7: '
    # 聊天后缀格式
    suffix:
      example:
        text: ''
```
