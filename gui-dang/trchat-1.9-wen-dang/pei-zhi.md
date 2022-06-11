# 配置

{% hint style="danger" %}
您正在插件已过时插件版本的文档，将不再提供支持

请您升级您的 TrChat 版本至最新版
{% endhint %}

### settings.yml

```yaml
# 基础设置
GENERAL:
  # 是否检测更新
  CHECK-UPDATE: true
  DEBUG: false
  # 禁用聊天的世界
  DISABLED-WORLDS: [PUT_YOUR_WORLD_NAME_HERE, ANOTHER_WORLD]
  # 日志格式
  LOG-NORMAL: '[{0}] {1}: {2}'
  LOG-PRIVATE: '[{0}] {1} -> {2}: {3}'
  # 几天后自动删除日志 0 = 禁用
  LOG-DELETE-TIME: 0
  # 自动下载的PlaceholderAPI拓展
  DEPEND-EXPANSIONS:
    - 'player'
    - 'server'
    - 'vault'
  # 阻止TAB补全 (绕过: trchat.bypass.tabcomplete)
  PREVENT-TAB-COMPLETE: false
  # NONE, BUNGEE, VELOCITY
  PROXY: NONE

# 聊天颜色
# 权限节点: trchat.color.<CODE>
# 十六进制颜色和渐变色需要 trchat.color.*
#
# 在哪些地方启用颜色
CHAT-COLOR:
  CHAT: true
  SIGN: true
  ANVIL: true
  BOOK: true

# 聊天控制
CHAT-CONTROL:
  # 反相似聊天刷屏 (相似度 0-1)
  ANTI-REPEAT: 0.85
  # 聊天冷却
  COOLDOWN: 2.0
  # 聊天长度限制
  LENGTH-LIMIT: 100
```

### formats.yml

```yaml
# JSON格式示例
#   example-part: # id
#     text: 'ABC' # 显示的文字
#     hover: '%player_name%' # 鼠标悬浮显示
#     command: '/tpa %player_name%' # 点击执行命令
#     suggest: '/msg %player_name%' # 点击输入到聊天栏
#     url: 'https://github.com' # 点击打开网页
#     copy: '123' # 点击复制
#     requirement: 'perm *"vip1"' # 使用格式的条件
#
NORMAL:
    # 使用这个格式的条件
    # 当以'js:'或'$ '开头时, 使用 javascript
    # player = 发送者
    # bukkitServer = 服务器实例
    # utils = assist utils
    # 否则使用 kether
  - requirement: null
    # (可选) 格式优先级 (默认: 2147483647)
    priority: 2147483647
    # 聊天消息部分
    msg:
      # 默认聊天颜色
      # (当玩家没有任何 trchat.color.force-defaultcolor.<CODE> 的权限)
      default-color: '7'
      hover: '&7Date: %server_time_h:mm:ss a%'

    # 自定义Json格式部分 (在聊天消息前)
    parts:
      - text: '&8[&3%player_world%&8]'
        hover: |-
          &r
          &8▪ &7位置: &3%player_world%&7, &2%player_x%/%player_y%/%player_z%
          &r
          &6▶ &e点击发送传送请求
          &r
        command: '/tpa %player_name%'
        # (Optional) Requirement to display this JSON part for the player
        requirement: null
      - text: ' '
      - text: '&7%player_name%'
        hover: |-
          &r
          &8▪ &7Ping: &3%player_ping% Ms
          &8▪ &7生命值: &c%player_health_rounded% ❤
          &r
          &6▶ &e点击发送私聊
          &r
        suggest: '/msg %player_name% '
      - text: '&7: '

    # (可选) 聊天消息后缀
    suffix:
      - text: ''

######################################################################
#
# 私聊发送
#
######################################################################
PRIVATE_SEND:
  - requirement: null
    parts:
      - text: '&8[&a%player_name% &7➦ %toplayer_name%&3&8] '
    msg:
      default-color: 'f'
      hover: '&7日期: %server_time_HH:mm:ss%'

######################################################################
#
# 私聊接受
#
######################################################################
PRIVATE_RECEIVE:
  - requirement: null
    parts:
      receive:
        text: '&8[&6%player_name% &7➥ &2%toplayer_name%&8] '
    msg:
      default-color: 'f'
      hover: '&7日期: %server_time_HH:mm:ss%'

######################################################################
#
# 全局
#
######################################################################
GLOBAL:
  - requirement: null
    parts:
      - text: '&8[&3%server_name%&8] '
        hover: |-
          &7服务器 &3%server_name%
          &r
          &7版本: &6%server_version%
          &7在线人数: &a%server_online%&7/&2%server_max_players%
          &7TPS: &b%server_tps%
      - text: '&e%player_name%&8: '
    msg:
      default-color: 'f'
      hover: '&7日期: %server_time_HH:mm:ss%'

######################################################################
#
# 管理员频道
#
######################################################################
STAFF:
  - requirement: null
    parts:
      - text: '&8[&cSTAFF&8] '
        hover: |-
          &7服务器 &3%server_name%
          &r
          &7版本: &6%server_version%
          &7在线人数: &a%server_online%&7/&2%server_max_players%
          &7TPS: &b%server_tps%
          &7
          &a▶ &2点击进入这个服务器
        command: '/server %server_name%'
      - text: '&e%player_name%&8: '
    msg:
      default-color: 'a'
      hover: '&7日期: %server_time_HH:mm:ss%'
```

### function.yml

```yaml
# 基础 (插件内置功能)
GENERAL:
  # 命令控制器
  COMMAND-CONTROLLER:
    ENABLE: true
    # WHITELIST(白名单) or BLACKLIST(黑名单)
    TYPE: BLACKLIST
    # 绕过权限
    BYPASS: 'trchat.admin'
    # 你想控制的命令列表
    # 支持正则表达式, 不需要 '/'
    #
    # 使用<exact>标签使得命令(包括参数)需要完全匹配
    #
    # 例子 (blackList):
    # - 'help'  玩家不能执行任何以"help"开头的命令
    # - 'help<exact>'  玩家不能执行 "help", 但是能执行 "help 1", "help 2"
    LIST:
      - 'ver(sion)?(s)?'
      - 'help(s)?'
      - 'arasple<exact>'
  # 聊天展示物品
  ITEM-SHOW:
    ENABLE: true
    COOLDOWNS: 30
    FORMAT: '&8[&3{0} &bx{1}&8]'
    # 展示物品关键词 key-0..8 = 展示特定物品
    KEYS:
      - '%i'
      - '%item'
      - '%i%'
      - '%item%'
      - '[i]'
      - '[item]'
    # 展示物品原本的名字（无视改名）
    ORIGIN-NAME: false
    # Set to true if occur bug
    COMPATIBLE: false
  # 聊天中提及 (@At) 某人
  MENTION:
    ENABLE: true
    # 提及自己
    SELF-MENTION: false
    FORMAT: '&r &a@&2{0}&r '
    COOLDOWNS: 30
    # 发送声音和actionbar
    NOTIFY: true

# 自定义功能
# 匹配聊天文本, 格式化为JSON
CUSTOM:
  # 示例 —— QQ 分享
  shareQQ:
    # 满足条件表达式才能使用这个功能
    # 当以'js:'或'$ '开头时, 使用 javascript
    # player = 发送者
    # bukkitServer = 服务器实例
    # utils = assist utils
    # 否则使用 kether
    requirement: null
    # (可选) 替换优先级 (默认: 2147483647)
    priority: 2147483647
    # 匹配表达式
    # 示例模块的表达式部分来自互联网
    pattern: 'QQ( )?[1-9]([0-9]{5,11})'
    # 变量 {0} 是按下方表达式提取后的内容, 可以不配置此项
    text-filter: '[1-9]([0-9]{5,11})'
    # 自定义显示 JSON 组件
    display:
      text: '&8[&3&lQQ&8]'
      hover:
        - ''
        - '&3QQ: &b{0}'
        - ''
        - '&7这是一个 QQ 账号,'
        - '&7你可以点击此项快速打开聊天'
        - ''
        - '&8[&c!&8] &7请勿进行任何金钱交易'
        - '&8[&c!&8] &7交友需谨慎'
      url: 'https://wpa.qq.com/msgrd?v=3&uin={0}&site=qq&menu=yes'

  # 示例 —— B站视频 分享
  shareBilibili:
    pattern: 'BV( )?.{10}'
    text-filter: '.{12}'
    # 自定义显示 JSON 组件
    display:
      text: '&8[&f&lBilibili&8]'
      hover:
        - ''
        - '&7这可能是一个 Bilibili 视频,'
        - '&7点击即可访问'
        - ''
        - '&3BV号: &b{0}'
      url: 'https://www.bilibili.com/video/BV{0}'

  # 示例 —— 防止玩家暴露、分享真实手机号
  hidePhoneNumber:
    pattern: '((13[0-9])|(14[0-9])|(15[0-9])|(17[0-9])|(18[0-9]))\d{8}'
    display:
      text: '&8[&c&m-&8]'
      hover:
        - '&7该内容疑似为手机号码,'
        - '&7已自动屏蔽隐藏.'
        - ''
        - '&8[&c!&8] &7请勿分享任何隐私信息'

  # 示例 —— 隐藏身份证
  hideIDCardNumber:
    pattern: '([1-9]\d{5}[12]\d{3}(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])\d{3}[0-9xX])'
    display:
      text: '&8[&c&m-&8]'
      hover:
        - '&7该内容疑似为身份证号,'
        - '&7已自动屏蔽隐藏.'
        - ''
        - '&8[&c!&8] &7请勿分享任何隐私信息'
        - '&7严重者可能处于禁言/封禁'

  # 示例 —— 高亮 IP
  glowIP:
    pattern: '(25[0-5]|2[0-4]\d|[0-1]\d{2}|[1-9]?\d)\.(25[0-5]|2[0-4]\d|[0-1]\d{2}|[1-9]?\d)\.(25[0-5]|2[0-4]\d|[0-1]\d{2}|[1-9]?\d)\.(25[0-5]|2[0-4]\d|[0-1]\d{2}|[1-9]?\d)'
    display:
      text: '&e&n{0}'
      hover:
        - '&7这是一个 IP地址'
        - '&7点击复制!'
      copy: '{0}'

  # 示例 —— 高亮邮箱
  glowEmail:
    pattern: '\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}'
    display:
      text: '&e&n{0}'
      hover:
        - '&7这是一个邮箱'
        - '&7点击复制!'
      copy: '{0}'

  # 示例 —— 网站分享
  shareUrl:
    pattern: '^((https|http|ftp|rtsp|mms)?:\/\/)[^\s]+'
    display:
      text: '&8[&f&l网站&8]'
      hover:
        - ''
        - '&3网站: {0}'
        - ''
        - '&7点击进入!'
        - ''
        - '&8[&c!&8] &7谨防任何诈骗'
      url: '{0}'
```

### filter.yml

```yaml
# 云端词库
CLOUD-THESAURUS:
  # 启用
  ENABLE: false
  # 敏感词白名单
  WHITELIST: []
  # 云端词库地址
  URL:
    - 'https://gitee.com/yurinann/Filter-Thesaurus-Cloud/raw/main/database.json' # 感谢南城提供的词库
    - 'https://raw.githubusercontent.com/Yurinann/Filter-Thesaurus-Cloud/main/database.json'

# 本地屏蔽词
LOCAL:
  - 'NMSL'
  - 'fuck'
  - 'shit'

# 忽略的符号
IGNORED-PUNCTUATIONS: ['!','.',',','#','$','%','&','*','(',')','|','?','/','@','"','\',';','[',']','{','}','+','~','-','_','=','^','<','>',' ','　','！','。','，','￥','（','）','？','、','“','‘','；','【','】','——','……','《','》','\\', '`']
REPLACEMENT: '*'
```

### channels.yml

```yaml
# 启用时, 每个聊天都会转发到全局
FORCE-GLOBAL: false

# 以这个开头的消息将会转发到全局
FORCE-GLOBAL-PREFIX: '!all'

# 如果不为null, 不在自定义频道的玩家将会自动加入这个频道 (需要权限)
DEFAULT-CUSTOM-CHANNEL: null

# 自定义聊天频道
CUSTOM:
  STAFF:
    # 使用formats.yml里的哪个格式
    FORMAT: STAFF
    # 加入权限
    PERMISSION: 'trchat.channel.staff'
    # 发送范围 (ALL, SINGLE_WORLD, DISTANCE, SELF) 注意: 当ALWAYS-RECEIVE为true时无效
    RANGE: ALL;0
    # 只要有权限, 即使离开也会接收到消息 (支持跨服)
    ALWAYS-RECEIVE: true
    # 是否发送消息到控制台
    SEND-TO-CONSOLE: false
    # 是否能使用AT功能
    PRIVATE: false
    # 是否转发到Dynmap
    FORWARD-TO-DYNMAP: false
    # 加入或退出时是否提示(发送lang)
    HINT: true
    # 玩家退出时是否自动退出频道
    AUTO-QUIT: false
```
