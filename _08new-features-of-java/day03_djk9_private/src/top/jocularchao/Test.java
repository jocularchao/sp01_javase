package top.jocularchao;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/30 23:35
 * @Description
 */
public interface Test {

    default void test() {
        System.out.println("默认的方法实现");
    }

    private static void run() {
        System.out.println("111");
    }

    static void xxx() {
        run();
    }
}
