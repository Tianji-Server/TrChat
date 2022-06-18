---
description: 插件设置配置文件。
---

# 设置

### settings.yml

```yaml
# 选项
Options:
  # 记录Normal聊天格式到plugins/TrChat/logs目录下
  Log-Normal: '[{0}] {1}: {2}'
  # 记录私聊聊天格式到plugins/TrChat/logs目录下
  Log-Private: '[{0}] {1} -> {2}: {3}'
  # 强制变量扩展
  Depend-Expansions: ['player', 'server', 'vault']
  # 玩家是否可以用tab补全,默认false,true即禁止
  Prevent-Tab-Complete: false

# 数据库
Database:
  # 数据库类型(SQLite,SQL,Mongodb)
  Method: SQLite
  SQLite:
    # 储存数据文件目录
    file: '{plugin_folder}/data/data.db'
    # 数据库表名
    table: trchat
  SQL:
    # 数据库地址
    host: localhost
    # 数据库端口
    port: 3306
    # 数据库用户名
    user: root
    # 数据库密码
    password: root
    # 数据库名
    database: trchat
    # 数据库表名
    table: trchat
  Mongodb:
    # 数据库地址,mongodb://IP地址:端口
    client: 'mongodb://localhost:27017'
    # 数据库名
    database: trchat
    # 数据库表名
    collection: chat

# 聊天功能
Chat:
  # 内容相似度
  Anti-Repeat: 0.75
  # 聊天间隔冷却
  Cooldown: '2s'
  # 最大聊天长度
  Length-Limit: 100

# 开启颜色转换
Color:
  # 聊天颜色
  Chat: false
  # 牌子颜色
  Sign: false
  # 铁砧颜色
  Anvil: false
  # 书本颜色
  Book: false

# 默认频道
Channel:
  Default: 'Normal'
```
