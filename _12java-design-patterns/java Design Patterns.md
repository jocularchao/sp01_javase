## java Design Patterns



#### 单一职责原则

单一职责原则（Simple Responsibility Pinciple，SRP）是最简单的面向对象设计原则，它用于控制类的粒度大小。

> 一个对象应该只包含单一的职责，并且该职责被完整地封装在一个类中。

所谓闻道有先后，术业有专攻，会编程的就应该是程序员，会打螺丝的就应该是工人，会送外卖的应该是骑手，显然这个People太过臃肿（我们需要修改任意一种行为都需要修改People类，它拥有不止一个引起它变化的原因），所以根据单一职责原则，我们下需要进行更明确的划分，同种类型的操作我们一般才放在一起：

```java
class Coder{
    /**
     * 程序员会编程
     */
    public void coding(){
        System.out.println("int mian() {");
        System.out.println("   printf(\"Hello World!\")");
        System.out.println("}");
        System.out.println("啊嘞，怎么运行不起？明明照着老师敲的啊");
    }
}

class Worker{
    /**
     * 工人会打螺丝
     */
    public void work(){
        System.out.println("真开心，能进到富土康打螺丝");
        System.out.println("诶，怎么工友都提桶跑路了");
    }
}

class Rider {
    /**
     * 骑手会送外卖
     */
    public void ride(){
        System.out.println("今天终于通过美团最终面，加入了梦寐以求的大厂");
        System.out.println("感觉面试挺简单的，就是不知道为啥我同学是现场做一道力扣接雨水，我是现场问会不会骑车");
        System.out.println("（迫不及待穿上外卖服装）");
    }
}
```

我们将类的粒度进行更近一步的划分，这样就很清晰了，包括我们以后在设计Mapper、Service、Controller等等，根据不同的业务进行划分，都可以采用单一职责原则，以它作为我们实现高内聚低耦合的指导方针。实际上我们的微服务也是参考了单一职责原则，每个微服务只应担负一个职责。



#### 开闭原则

开闭原则（Open Close Principle）也是重要的面向对象设计原则。

> 软件实体应当对扩展开放，对修改关闭。

对扩展开放是针对提供方来说的，对修改关闭是针对调用方来说的。

比如我们的程序员分为Java程序员、C#程序员、C艹程序员、PHP程序员、前端程序员等，而他们要做的都是去打代码，而具体如何打代码是根据不同语言的程序员来决定的，我们可以将程序员打代码这一个行为抽象成一个统一的接口或是抽象类，这样我们就满足了开闭原则的第一个要求：对扩展开放，不同的程序员可以自由地决定他们该如何进行编程。而具体哪个程序员使用什么语言怎么编程，是自己在负责，不需要其他程序员干涉，所以满足第二个要求：对修改关闭，比如：

```java
public abstract class Coder {

    public abstract void coding();

    class JavaCoder extends Coder{
        @Override
        public void coding() {
            System.out.println("Java太卷了T_T，快去学Go吧！");
        }
    }

    class PHPCoder extends Coder{
        @Override
        public void coding() {
            System.out.println("PHP是世界上最好的语言");
        }
    }

    class C艹Coder extends Coder{
        @Override
        public void coding() {
            System.out.println("笑死，Java再牛逼底层不还得找我？");
        }
    }
}
```

通过提供一个Coder抽象类，定义出编程的行为，但是不进行实现，而是开放给其他具体类型的程序员来实现，这样就可以根据不同的业务进行灵活扩展了，具有较好的延续性。



#### 里氏替换原则

里氏替换原则（Liskov Substitution Principle）是对子类型的特别定义。

> 所有引用基类的地方必须能透明地使用其子类的对象。

简单的说就是，子类可以扩展父类的功能，但不能改变父类原有的功能：

1. 子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法。
2. 子类可以增加自己特有的方法。
3. 当子类的方法重载父类的方法时，方法的前置条件（即方法的输入/入参）要比父类方法的输入参数更宽松。
4. 当子类的方法实现父类的方法时（重写/重载或实现抽象方法），方法的后置条件（即方法的输出/返回值）要比父类更严格或与父类一样。



