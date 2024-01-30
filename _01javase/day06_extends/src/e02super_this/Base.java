package e02super_this;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/5 10:34
 * @Description super和this关键字都可以用来覆盖java语言的默认作用域，使其屏蔽的方法或变量变为可见。<br />
 *
 * 那么如何会出现方法或变量屏蔽的现象呢：<br />
 * 1、在一个方法内，当局部变量和类的成员变量同名；或者局部变量和父类的成员变量同名时，按照变量的作用域规则，只有局部变量在方法内可见<br />
 * 2、当子类的某个方法重写了父类的一个方法时，在子类的范围内，父类的方法不可见<br />
 * 3、当子类定义了和父类同名的成员变量，在子类的范围内父类的成员变量不可见<br />
 *
 */
public class Base {

    public Base(String var) {
        this.var = var;
    }

    String var = "BaseVar";

    void BaseMethod(){
        System.out.println("BaseMethod");
    }
}
