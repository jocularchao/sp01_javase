package i04anonymous_inner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/25 17:59
 * @Description 匿名内部类
 */
public class Out {
    //在抽象类和接口中都会含有某些抽象方法需要子类去实现
    //我们已经明确不能直接通过new的方式创建一个抽象类或接口对象，这时就用到匿名内部类了
    public static void main(String[] args) {
        Student student = new Student() {
            @Override
            public void test() {
                System.out.println("anonymous inner class");
            }
        };
    }
}

abstract class Student {
    public abstract void test();
}
