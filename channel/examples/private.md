---
description: 私聊频道，可以不需要频繁使用指令私聊。
---

# 私聊 Private

```yaml
# 聊天选项
Options:
  # 私聊权限
  Join-Permission: 'trchat.private'
  # 是否可以跨服
  Proxy: true
  # 禁止使用
  Disabled-Functions: ['Mention']
  # 是否直接私聊，设置为false，私聊功能即变成私聊频道
  Private: true

# 绑定私聊指令
Bindings:
  # 自定义命令
  Command: ['msg', 'message', 'tell', 'talk', 'm', 'whisper', 'w']

# 发送者的信息
Sender:
  - prefix:
      # 发送者返回的私聊信息
      sender:
        text: '&8[&a%player_name% &7➦ %trchat_toplayer%&3&8] '
    # 信息格式
    msg:
      # 默认聊天信息颜色
      default-color: 'f'
      # 聊天悬浮框
      hover: '&7日期: %server_time_HH:mm:ss%'

# 接收者的信息
Receiver:
  - prefix:
      # 接收者接收到的信息
      receiver:
        text: '&8[&6%player_name% &7➥ &2%trchat_toplayer%&8] '
    # 信息格式
    msg:
      # 默认聊天信息颜色
      default-color: 'f'
      # 聊天悬浮框
      hover: '&7日期: %server_time_HH:mm:ss%'
```
