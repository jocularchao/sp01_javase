package c01create;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/2 20:47
 * @Description 重载使用
 * • 方法名相同
 * • 方法的参数类型 个数、顺序至少有 项不相同
 * • 方法的返回类型可以不相同
 * • 方法的修饰符可以不相同
 * ---若方法名和参数列表都相同，java虚拟机在运行时就无法决定到底执行哪个方法---
 */
public class Class02Overload {
    public static void main(String[] args) {
        Class01Create cla = new Class01Create();
        cla.open1();

        Class01Create.open(1, 2);
        Class01Create.open(1);
        Class01Create.open();
    }

    //那作为程序入口的main方法呢？
    //也可以被重载
    private void main(String s){}

}
