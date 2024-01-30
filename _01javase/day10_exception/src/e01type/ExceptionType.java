package e01type;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/18 18:02
 * @Description 异常的类型
 *
 * 数组越界异常，空指针异常，算术异常等，他们其实都是异常类型，我们的每一个异常也是一个类，他们都继承自`Exception`类！
 *
 * 1 异常的第一种类型是运行时异常
 * 在编译阶段无法感知代码是否会出现问题，只有在运行的时候才知道会不会出错（正常情况下是不会出错的），这样的异常称为运行时异常，异常也是由类定义的，所有的运行时异常都继承自`RuntimeException`。
 * 2 编译时异常 需要抛出异常
 *
 * 3 错误 一般出现错误可能JVM就无法继续正常运行了
 *
 */
public class ExceptionType {

    public static void main(String[] args) {
        Object object = null;
        object.toString();  //NullPointerException


    }

}
