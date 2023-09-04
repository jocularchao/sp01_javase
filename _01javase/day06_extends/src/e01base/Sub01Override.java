package e01base;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/4 13:38
 * @Description 方法重写<br />
 *  重写 覆盖继承来的方法的实现<br />
 * 1、这个子类不仅能重写父类的方法还能重写父类的父类的方法<br />
 * 2、重写必须保证子类方法的名称、参数列表、返回类型、静态类型与父类的保持一致<br />
 * why? 因为java编译器会判断两个方法的参数列表是否一致，两者一致后，java编译器就会认为Sub01Override类的method方法试图覆盖父类同名方法
 * 所以两个方法的返回类型也要一致<br />
 * 3、子类方法不允许缩小父类方法的访问权限<br />
 * why? 如果没有这个限制，将会与java语言的多态机制发生冲突<br />
 * 4、子类方法不能抛出比父类方法更多的异常！！！ 还是会与java语言的多态机制发生冲突<br />
 * 5、子类可以定义与父类同名的静态方法，以便于隐藏父类的静态方法 <br />
 * 子类隐藏父类的静态方法和子类覆盖父类的方法有区别：<br />
 * 运行时，java虚拟机把静态方法和所属的类绑定，而把实例方法和所属的实例绑定。<br />
 * 6、私有类型不能被重写<br />
 * 7、抽象方法被覆盖的途径：见Sub02Abstract<br />
 * 1 子类实现父类的抽象方法；2 子类重新声明父类的抽象方法
 */
public class Sub01Override extends Sub{
    @Override
    public void methodOfSub() {
        publicVarOfBase = 3;
    }



    @Override
    protected void methodOfBase() throws ExceptionBase {
        super.methodOfBase();
    }

    static void methodStatic(){
        System.out.println("子类static");
    }

    public static void main(String[] args) {
        //3  根据动态绑定规则，java虚拟机会调用sub1变量所引用的Sub01Override实例的method方法
        //如果重写的方法变成私有的java虚拟机就无法访问它。
        Sub sub1 = new Sub01Override();
        //sub1.methodOfSub();
        System.out.println(sub1.publicVarOfBase);  // 3

        //4
        //此时系统只捕获了ExceptionBase异常
        Sub sub2 = new Sub01Override();
        try {
            sub2.methodOfSub();
        } catch (ExceptionBase e) {
            throw new RuntimeException(e);
        }

        //5
        // 这就导致了若是对象声明为Sub类型却引用本类的实例 调用重写的方法，结果为重写后的；但静态方法用的是Sub的
        // 若是 创建本类对象，调用重写，就是重写；调用静态还是本类静态
        Sub01Override sub3 = new Sub01Override();
        sub3.methodOfSub();
        sub3.methodStatic();

        sub2.methodStatic();

    }
}
