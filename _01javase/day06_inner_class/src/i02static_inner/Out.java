package i02static_inner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/25 13:19
 * @Description 静态内部类
 */
public class Out {


    public static class Inner {
        public void test() {
            System.out.println("static inner class");
        }
    }

    public static void main(String[] args) {
        //静态内部类的类名同样是之前的格式，但是可以直接new了
        Out.Inner inner = new Out.Inner();

        inner.test();

        //无法访问到外部类的非静态内容


    }
}
