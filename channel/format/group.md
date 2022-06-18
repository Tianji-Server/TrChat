---
description: 聊天格式组
coverY: 0
---

# 分组

## 组并列

Formats(Sender/Receiver)下的并列

适用于大范围显示控制

```
# 即整个格式的改变
Formats:
  # 条件: 金币大于等于100即显示,不写优先级(priority)即从上到下顺序走
  - condition: check papi %vault_eco_balance% >= 100
    priority: 99
    suffix:
      example:
        text: ''
  # 部分内容省略,因不是该板块索要说明的内容,只需要知道这里是讲condition的
  - condition: ~
    priority: 100
    suffix:
      example:
        text: ''
```

***

## 块并列

每个JSON块又可以分成多块，便于通过条件控制中范围显示

条件检测时从上到下，所以应把无条件的放到最后

示例: 检测玩家是否有op，改变显示的文字和悬浮字

```yaml
player:
    - condition: 'player op'
      text: '&4%player_name%'
      hover: |-
        &r
        &8▪ &7Ping: &3%player_ping% Ms
        &8▪ &7Health: &c%player_health_rounded% ❤
        &r
        &6▶ &eClick to contact with op
        &r
    - text: '&7%player_name%'
      hover: |-
        &r
        &8▪ &7Ping: &3%player_ping% Ms
        &8▪ &7Health: &c%player_health_rounded% ❤
        &r
        &6▶ &eClick to chat with me
        &r
```

***

## 条并列

每个JSON构成部分又可以分成多条，便于通过条件控制小范围显示

条件检测时从上到下，所以应把无条件的放到最后

示例: 通过权限控制玩家名称颜色

```yaml
player:
  text:
    - '&6%player_name%{condition: perm "group.mvp"}'
    - '&3%player_name%{condition: perm "group.vip"}'
    - '&a%player_name%'
```
