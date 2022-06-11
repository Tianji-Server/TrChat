---
description: 自定义频道功能，Staff示例。
---

# 频道 Staff

{% hint style="info" %}
Double-Transfer关闭时
此功能需要从 BungeeCord 给 Join-Permission 设置的权限才可跨服并且让子服频道接收

这里推荐权限插件 [LuckPerms-Bungee](https://luckperms.net/download)
{% endhint %}

```yaml
# 聊天选项
Options:
  # 所需权限
  Join-Permission: 'trchat.admin'
  # 聊天接送范围
  Target: ALL
  # 是否启用 BungeeCord 模式
  Proxy: true
  # 自动加入频道
  Auto-Join: true

# 绑定频道命令
Bindings:
  # 自定义命令
  Command: ['staff']

# 聊天格式
Formats:
  - prefix:
      staff:
        # 聊天最左边的信息
        text: '&8[&cSTAFF&8] '
        # 聊天最左边的悬浮框
        hover: |-
          &7Server &3%server_name%
          &r
          &7Version: &6%server_version%
          &7Online: &a%server_online%&7/&2%server_max_players%
          &7TPS: &b%server_tps%
          &7
          &a▶ &2Click to connect to this server
        # 点击执行指令
        command: '/server %server_name%'
      # 聊天信息左边的内容
      player:
        text: '&e%player_name%&8: '
    # 聊天信息内容格式
    msg:
      # 聊天默认颜色
      default-color: 'a'
      # 聊天悬浮框
      hover: '&7Date: %server_time_HH:mm:ss%'
```
