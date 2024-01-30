package top.jocularchao;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/12 20:35
 * @Description
 */
public class JNITest {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
    }

    public static native int sum(int a,int b);

}
