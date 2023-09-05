package e01base;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/4 21:55
 * @Description 抽象方法如何重写
 */
public abstract class Sub02Abstract extends SubAbstract{

    //1、实现methodAbstract方法并扩大访问权限
    @Override
    public void methodAbstract() {

    }

    //2、改变子类为抽象类以 重新声明父类的抽象方法
    public abstract void methodAbstract1();



}
