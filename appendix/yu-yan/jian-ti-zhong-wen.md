---
description: 简体中文语言支持。
---

# 🇨🇳 简体中文

> ### zh\_CN.yml

{% tabs %}
{% tab title="巴斯宾" %}
[https://pastebin.com/xK8dHG7Q](https://pastebin.com/xK8dHG7Q)
{% endtab %}

{% tab title="下载文件" %}
[https://pastebin.com/dl/xK8dHG7Q](https://pastebin.com/dl/xK8dHG7Q)
{% endtab %}

{% tab title="在线查看" %}
[https://pastebin.com/raw/xK8dHG7Q](https://pastebin.com/raw/xK8dHG7Q)
{% endtab %}

{% tab title="打印文件" %}
[https://pastebin.com/print/xK8dHG7Q](https://pastebin.com/print/xK8dHG7Q)
{% endtab %}
{% endtabs %}

```yaml
Plugin-Loading:
  - '&r'
  - '&7正在加载 &3Tr&bChat&7... &8{0}'
  - '&r'
Plugin-Enabled: '&8[&3Tr&bChat&8] &b信息 &8| &3加载完毕. TrChat &av{0} &3现已启用, 敬请使用.'
Plugin-Loaded-Functions: '&8[&3Tr&bChat&8] &b聊天 &8| &3成功载入 &b{0} &3个聊天功能... &8[{1} Ms]'
Plugin-Loaded-Channels: '&8[&3Tr&bChat&8] &b聊天 &8| &3成功载入 &b{0} &3个聊天频道... &8[{1} Ms]'
Plugin-Loaded-Filter-Local: '&8[&3Tr&bChat&8] &a过滤器 &8| &3已载入本地敏感词库总计 &b{0} &3个.'
Plugin-Loaded-Filter-Cloud: '&8[&3Tr&bChat&8] &a过滤器 &8| &3成功从云端更新敏感词汇总计 &a{0} &3个. &8[{1} - {2}]'
Plugin-Reloaded: '&8[&3Tr&bChat&8] &7监听到配置文件改动, 已自动载入相关配置等...'
Plugin-Failed-Load-Filter-Cloud: '&8[&3Tr&bChat&8] &8无法从云端更新敏感词库......'
Plugin-Proxy-Supported: '&8[&3Tr&bChat&8] &6已支持 &e{0} &6通讯.'
Plugin-Proxy-None: '&8[&3Tr&bChat&8] &7当前无跨服支持.'
Plugin-Dependency-Hooked: '&8[&3Tr&bChat&8] &6挂钩 &8| &7软依赖 &f{0} &7已兼容.'
Plugin-Updater-Latest: '&8[&3Tr&bChat&8] &8你正在运行最新版的 TrChat.'
Plugin-Updater-Dev: '&8[&3Tr&bChat&8] &7你正在运行开发版本的 TrChat, 请及时反馈漏洞!'
Plugin-Updater-Header:
  - ''
  - '&3--------------------------------------------------'
  - '&7▪ &3TrChat &a更新通知 &8{0} &7➦ &8{1}'
  - ''
  - '&7▪ &e内容: '
Plugin-Updater-Footer:
  - ''
  - '&7▪ &2前往 Github 下载: &a&nhttps://github.com/FlickerProjects/TrChat/releases'
  - '&3--------------------------------------------------'
Plugin-Debug-On:
  - type: title
    title: '&7&l调试模式'
    subtitle: '&3&l当前已 &a&l开启&3&l.'
  - type: sound
    sound: 'BLOCK_ANVIL_LAND'
    volume: 1
    pitch: 2
Plugin-Debug-Off:
  - type: title
    title: '&7&l调试模式'
    subtitle: '&3&l当前已 &c&l关闭&3&l.'
  - type: sound
    sound: 'BLOCK_ANVIL_LAND'
    volume: 1
    pitch: 0
Plugin-Done: '&8[&3Tr&bChat&8] &f操作成功.'
Plugin-Failed: '&8[&3Tr&bChat&8] &c操作失败.'

Error-Version: '&8[&3Tr&bChat&8] &c错误 &8| &7检测版本号时发生异常... 请重新下载插件!'

General-Too-Long: '&8[&3Tr&bChat&8] &7你的聊天内容过长. &8[&6{0}&8/&2{1}&8]'
General-Too-Similar: '&8[&3Tr&bChat&8] &7你的两次聊天内容过于相似, 请勿复读.'
General-No-Permission: '&8[&3Tr&bChat&8] &7你没有足够的权限执行此操作.'
General-Muted: '&8[&3Tr&bChat&8] &c你被禁言了!解除时间: {0}'
General-Global-Muting: '&8[&3Tr&bChat&8] &c全员禁言中.'

Cooldowns-Chat:
  - type: actionbar
    text: '&7&l您需要等待聊天冷却 &6{0}s &7&l后才能聊天, 请勿频繁刷屏.'
  - type: sound
    sound: 'ENTITY_ITEM_BREAK'
    volume: 1
    pitch: 2
Cooldowns-Item-Show:
  - type: actionbar
    text: '&3&l您需要等待冷却 &a{0}s &3&l后才能再次展示物品.'
  - type: sound
    sound: 'ENTITY_ITEM_BREAK'
    volume: 1
    pitch: 0
Cooldowns-Inventory-Show:
  - type: actionbar
    text: '&3&l您需要等待冷却 &a{0}s &3&l后才能再次展示背包.'
  - type: sound
    sound: 'ENTITY_ITEM_BREAK'
    volume: 1
    pitch: 0

Command-Controller-Deny: '&c&l你不能使用该命令...'
Command-Controller-Cooldown: '&c&l该命令冷却中...({0})'
Command-Not-Player: '&8[&3Tr&bChat&8] &c你必须是一个玩家才能执行此操作.'
Command-Player-Not-Exist: '&8[&3Tr&bChat&8] &7目标玩家未在线或不存在.'

Mentions-Notify:
  - type: actionbar
    text: '&d&l&k|&r &3&l玩家 &a&l{0} &3&l在聊天中At了你 &d&l&k|'
  - type: sound
    sound: 'BLOCK_ANVIL_LAND'
    volume: 1
    pitch: 2

Inventory-Show-Unavailable: '&c&l该背包已过期或不存在...'

Private-Message-Spy-Format: '&8[&3监听&8] &6{0} &2-> &3{1}&f: &7{2}'
Private-Message-Spy-On:
  - type: actionbar
    text: '&c&l&k|&r &a&l开启监听私聊模式 &c&l&k|'
  - type: sound
    sound: 'BLOCK_ANVIL_LAND'
    volume: 1
    pitch: 2
Private-Message-Spy-Off:
  - type: actionbar
    text: '&c&l&k|&r &c&l关闭监听私聊模式 &c&l&k|'
  - type: sound
    sound: 'BLOCK_ANVIL_LAND'
    volume: 1
    pitch: 0
Private-Message-No-Player:
  - type: actionbar
    text: '&3&l请提供一名私聊的对象'
  - type: sound
    sound: 'ENTITY_ITEM_BREAK'
    volume: 1
    pitch: 0
Private-Message-No-Message:
  - type: actionbar
    text: '&7&l请提供私聊内容'
  - type: sound
    sound: 'ENTITY_ITEM_BREAK'
    volume: 1
    pitch: 0
Private-Message-Receive:
  - type: actionbar
    text: '&8[ &a! &8] &3你收到来自 &a{0} &3的一条私聊消息'
  - type: sound
    sound: 'BLOCK_ANVIL_LAND'
    volume: 1
    pitch: 2

Channel-Proxy-Not-Enable: '&8[&3Tr&bChat&8] &7未启用跨服支持, 暂不支持喊话.'
Channel-Join:
  - type: actionbar
    text: '&a&l已加入到{0}频道聊天'
  - type: text
    text: '&8[&3Tr&bChat&8] &3你已经加入到{0}频道'
  - type: sound
    sound: 'BLOCK_ANVIL_LAND'
    volume: 1
    pitch: 2
Channel-Quit:
  - type: actionbar
    text: '&3&l已离开{0}聊天频道'
  - type: text
    text: '&8[&3Tr&bChat&8] &7你已离开{0}频道'
  - type: sound
    sound: 'BLOCK_ANVIL_LAND'
    volume: 1
    pitch: 0
Channel-No-Speak-Permission:
  - type: actionbar
    text: '&c&l你没有这个频道的说话权限'
  - type: sound
    sound: 'ENTITY_ITEM_BREAK'
    volume: 1
    pitch: 0

Mute-Muted-Player: '&8[&3Tr&bChat&8] &7你已禁言 {0} {1}.'
Mute-Muted-All: '&8[&3Tr&bChat&8] &7全员禁言已开启.'
Mute-Cancel-Muted-All: '&8[&3Tr&bChat&8] &7全员禁言已关闭.'
```
