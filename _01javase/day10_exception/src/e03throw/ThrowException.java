package e03throw;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/18 18:14
 * @Description 抛出异常
 * 我们可以手动抛出一个异常来终止程序继续运行下去，同时告知上一级方法执行出现了问题
 */
public class ThrowException {
    public static int test(int a , int b ){
        if (b==0)
            throw new RuntimeException("被除数不为0");
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println(ThrowException.test(1, 0));
    }
}
