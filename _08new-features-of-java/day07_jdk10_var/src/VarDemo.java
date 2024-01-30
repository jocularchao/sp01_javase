/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/4 12:01
 * @Description
 */
public class VarDemo {
    public static void main(String[] args) {
        var a = "Hello World!";   //现在我们使用var关键字来自动进行类型推断，因为完全可以从后面的值来判断是什么类型
        System.out.println(a.getClass());
    }
}
