## JCF源码分析与实现

​	Java集合框架（Java Collection Framework，JCF）是Java标准平台（J2SE）的重要组成部分，也是java程序员**必须**掌握的关键知识。

​	根据操作特性划分：List（线性集合）、Set（去重集合）、Queue（队列集合）、Map（K-V键值对集合）

​	根据工作场景特性划分：支持高并发场景的集合、不支持高并发场景的集合

​	根据提供者划分：原生集合、由第三方组织提供的集合

![image-20231027133338896](./jcf%E6%BA%90%E7%A0%81%E5%88%86%E6%9E%90%E4%B8%8E%E5%AE%9E%E7%8E%B0/image-20231027133338896.png)

四类集合的特点：

- List：集合内部使用一种线性表结构进行数据的实际存储，程序员可以按照指定的数据存入顺序获取数据，也可以按照需要操作集合的任意有效执行位置执行数据的存取操作
- Set：





### List

List集合设计的部分重要接口、抽象类和具体实现类：

java.util.ArrayList

java.util.LinkedList

java.util.Vector

java.util.Stack



![image-20231027133456691](./jcf%E6%BA%90%E7%A0%81%E5%88%86%E6%9E%90%E4%B8%8E%E5%AE%9E%E7%8E%B0/image-20231027133456691.png)



### Queue



![image-20231027134539153](./jcf%E6%BA%90%E7%A0%81%E5%88%86%E6%9E%90%E4%B8%8E%E5%AE%9E%E7%8E%B0/image-20231027134539153.png)





### Map



![image-20231027134611374](./jcf%E6%BA%90%E7%A0%81%E5%88%86%E6%9E%90%E4%B8%8E%E5%AE%9E%E7%8E%B0/image-20231027134611374.png)







### Set



![image-20231027134632098](./jcf%E6%BA%90%E7%A0%81%E5%88%86%E6%9E%90%E4%B8%8E%E5%AE%9E%E7%8E%B0/image-20231027134632098.png)



