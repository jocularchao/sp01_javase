package i01basic;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/18 17:39
 * @Description 接口的实现
 */
public interface Test1 {

    //1 的成员变 默认都是 public tatic final 类型的，必须被显式初始化
    public int var1 = 0;
    static String var2 = null;
    final double var3 = 0;

    //2 的方法默认都是 public abstract 类型
    public void test1();
    abstract void test2();

    //3 允许 中定义默认方法和静态方法
    default void test3(){

    }

    static void test4(){

    }

    //4 接口没有构造方法，不能被实例化

    //5 一个接口不能实现另一个接口，但它可以继承多个其他接口。

    //6 与子类继承抽象父类相似，当类实现了某个接口时，它必须实现接口中所有
    //的抽象方法，否则这个类必须被定义为抽象类

    //7 不允许创建接口的实例，但允许定义接口类型的引用变量，该变撒引用实现
    //了这个接口的类的实例，

    //8 1个类只能继承 个直接的父类，但能实现多个接口。

    //9 接口中的成员变量只能是public、static、final，而抽象类中可以定义各种类型的实例变量和静态变量

    //10 一个类只能继承一个直接的父类，这个父类有可能是抽象类；但一个类可以实现多个接口

}
