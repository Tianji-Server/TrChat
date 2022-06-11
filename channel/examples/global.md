---
description: 全局聊天，别名跨服聊天。
---

# 全局 Global

```yaml
# 聊天选项
Options:
  # 玩家需要 trchat.global 权限才能使用全局频道
  Speak-Condition: 'perm *trchat.global'
  # 聊天范围，ALL表示所有地方都可以看到
  Target: ALL
  # 依旧是那个BungeeCord
  Proxy: true
  # 自动加入频道
  Auto-Join: true

# 绑定全局聊天指令
Bindings:
  # 聊天前缀
  Prefix: ['!all']
  # 自定义命令
  Command: ['global', 'all', 'shout']

# 全局聊天格式
Formats:
  # 条件，和 Normal 一样
  - condition: null
    prefix:
      # 最左边的聊天格式
      server:
        text: '&8[&3%server_name%&8] '
        hover: |-
          &7Server &3%server_name%
          &r
          &7Version: &6%server_version%
          &7Online: &a%server_online%&7/&2%server_max_players%
          &7TPS: &b%server_tps%
      # 聊天左边的内容
      player:
        text: '&e%player_name%&8: '
    # 聊天信息格式
    msg:
      # 默认聊天颜色
      default-color: 'f'
      # 聊天悬浮框
      hover: '&7Date: %server_time_HH:mm:ss%'
```
