---
description: 插件权限列表。
---

# 权限 Permission

{% hint style="warning" %}
#### <mark style="color:orange;">此页面可能含有过时以及不确定因素</mark>
{% endhint %}

> ### 绕过

|          **权限节点**         |                     **权限作用**                     |
| :-----------------------: | :----------------------------------------------: |
|  trchat.bypass.chatlength |                     绕过聊天长度限制                     |
|    trchat.bypass.chatcd   |                      绕过聊天冷却                      |
|    trchat.bypass.itemcd   |                     绕过物品展示冷却                     |
|    trchat.bypass.filter   |                       绕过过滤器                      |
|    trchat.bypass.repeat   |                       绕过反复读                      |
| trchat.bypass.tabcomplete | <p>绕过阻止TAB补全</p><p>(PREVENT-TAB-COMPLETE开启时)</p> |

> ### 颜色

{% hint style="success" %}
强制使用其他颜色格式均是后面的格式

示例:&#x20;

trchat.color.force-defaultcolor.\<g#5:#00FF00:#53868B>

trchat.color.force-defaultcolor.e
{% endhint %}

|                                         |                                               |
| :-------------------------------------: | :-------------------------------------------: |
|                 **权限节点**                |                    **权限作用**                   |
|           trchat.color.\<CODE>          |              使用指定颜色代码的权限(\&CODE)              |
|             trchat.color.HEX            |            使用HEX颜色代码的权限({#FFFFFF})            |
|           trchat.color.RAINBOW          | <p>使用彩虹颜色代码的权限</p><p>(&#x3C;r#速度:饱和度:亮度>)</p> |
|          trchat.color.GRADIENTS         | <p>使用渐变色代码的权限</p><p>(&#x3C;g#速度:HEX:HEX>)</p> |
| trchat.color.force-defaultcolor.\<CODE> |                  强制使用该聊天代码颜色                  |
