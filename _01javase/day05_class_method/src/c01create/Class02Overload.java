package c01create;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/2 20:47
 * @Description 重载使用
 */
public class Class02Overload {
    public static void main(String[] args) {
        Class01Create cla = new Class01Create();
        cla.open1();

        Class01Create.open(1, 2);
        Class01Create.open(1);
        Class01Create.open();
    }

}
