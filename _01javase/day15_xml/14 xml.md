# 14 xml

​	**xml**同html一样是SGML的衍生语言

> ​	==SGML== 	Standard Generalized Markup Language	标准通用标记语言

​	在一些情况下，可以用properties**属性文件**保存一些键值对让Properties类调用，**但这还不够**。

​	很多情况下，想要描述的信息结构比较复杂，属性文件不大方便处理，如：对字体描述的解析

font = Times Roman 12

当用**属性文件**时：

title.fontname = Times Roman

title.fontsize = 12

xml很好解决了这些问题：

```xml
<config>
	<entry id="title">
    	<font>
        	<name>Times Roman</name>
            <size>12</size>
        </font>
    </entry>
    <entry id="background">
    	<color>
        	<red>0</red>
            <green>50</green>
            <blue>100</blue>
        </color>
    </entry>
</config>
```

注意事项：

- 大小写敏感
- 结束标签不能省略
- 只有单个标签 没有结束标签 必须用/结尾
- 属性值必须用**引号**括起来
- 所有属性必须有属性值



### 14.1 xml文档的结构

​	· xml应当以一个文档头开始

```xml
<?xml version="1.0"?>
或者
<?xml version="1.0" encoding="UTF-8"?>
```

​	· 文档头之后通常是文档类型定义

```xml
<!DOCTYPE web-app PUBLIC
	"-//Sun Microsystems,Inc.//DTD Web Application 2.2//EN"
	"http://java.sun.com/j2ee/dtds/web-app_2_2.dtd">
```

​	· 正文包含根元素，根元素包含其他元素

```xml
<
```

