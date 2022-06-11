---
description: 每个聊天频道的选项
---

# 选项 Options

可以自己新建一个频道

```
Options:
  # bc需要trchat.admin才可以使用
  Join-Permission: 'trchat.admin'
  # 需要权限才能使用
  Speak-Condition: 'perm *trchat.admin'
  # 自动加入
  Auto-Join: true/false
  # 是否跨服
  Proxy: true/false
  # 是否强制跨服
  Force-Proxy: true/false
  # 哪些子服可以接收,写端口名,~代表所有
  Ports: 1;2;3/~
  # 禁用Function.yml的模块
  Disabled-Functions: Mention
  # 设置为true内容有脏话就会禁止发送
  Filter-Before-Sending: true/false
  # 私聊功能
  Private: true/false
  # 范围
  Target: 'all/single_world/distance;10/self'
```
