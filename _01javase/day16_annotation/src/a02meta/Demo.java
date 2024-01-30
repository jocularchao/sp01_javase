package a02meta;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/27 21:22
 * @Description
 */
public class Demo {
    @MyAnnotation
    public static void test() {

    }


    @MyAnnotation1(value = ElementDemo.TEXT)
    public static void test1() {

    }
    @MyAnnotation1(value = {ElementDemo.TEXT,ElementDemo.TEST1})
    public static void main(String[] args) {
        Demo.test();
    }
}
