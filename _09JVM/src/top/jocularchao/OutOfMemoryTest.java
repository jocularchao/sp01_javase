package top.jocularchao;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/14 12:00
 * @Description
 */
public class OutOfMemoryTest {
    /*public static void main(String[] args) {
        int a[] = new int[Integer.MAX_VALUE];
    }*/
    /*public static void main(String[] args) {
        List<Test> list = new ArrayList<>();
        while (true){
            list.add(new Test());    //无限创建Test对象并丢进List中
        }
    }

    static class Test{ }*/

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        test();
    }
}
