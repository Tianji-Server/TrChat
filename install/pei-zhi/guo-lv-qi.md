---
description: 插件过滤器配置文件。
---

# 过滤器

### filter.yml

```yaml
# 是否启用敏感词
Enable: 
  # 聊天是否检测
  Chat: true 
  # 牌子是否检测
  Sign: true 
  # 铁砧是否检测
  Anvil: true 
  # 物品是否检测
  Item: false
# 云词库
Cloud-Thesaurus:
  # 是否启用 
  Enabled: true
  # 忽略内容
  Ignored: [] 
  # 第三方词库 （感谢南城提供的词库）
  Urls: 
    - 'https://raw.githubusercontent.com/Yurinann/Filter-Thesaurus-Cloud/main/database.json'
#本地词库
Local:
  - 'NMSL'
  - 'fuck'
  - 'shit'
# 敏感词白名单
WhiteList: ['has been']
# 替换成的内容
Replacement: '*'
```
