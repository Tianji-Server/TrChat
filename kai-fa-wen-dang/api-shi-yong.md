---
description: 插件开发者文档。
---

# API 使用

{% hint style="warning" %}
#### <mark style="color:orange;">此页面可能含有过时以及不确定因素</mark>
{% endhint %}

```
public class Demo implements Listener {
    
    @EventHandler
    private void e(TrChatEvent e) {
        e.getChannel(); // 获取聊天频道
        e.setCanceled(true); // 取消发送聊天
        e.setMessage("..."); // 改变聊天内容
    }   
}
```
