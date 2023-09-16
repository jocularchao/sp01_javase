package e02super_this;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/5 10:34
 * @Description 子类
 *
 * super、this的使用
 * 1、2、3以期使其屏蔽的方法或变量变为可见
 * 4 在构造方法中，调用父类的构造方法
 */
public class Sub extends Base{

    public Sub(String var) {
        super(var);
    }

    //4 在构造方法中，调用父类的构造方法
    public Sub(String varBase, String var) {
        super(varBase);
        this.var = var;
    }

    //3 子类定义了和父类同名的成员变量
    String var = "SubVar";


    //2 子类的某个方法重写了父类的一个方法
    @Override
    void BaseMethod() {
        System.out.println("SubMethod");
    }

    void test(){
        //1 一个方法内，当局部变量和类的成员变量同名
        String var = "testVar";

        //使用super、this
        System.out.println(var);
        System.out.println(this.var);
        System.out.println(super.var);

        BaseMethod();
        this.BaseMethod();
        super.BaseMethod();
    }


    public static void main(String[] args) {
        Sub sub = new Sub("baseVar");

        sub.test();
    }
}
