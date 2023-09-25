package i03local_inner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/25 17:53
 * @Description 局部内部类
 */
public class Out {
    public void test() {
        class Inner { //直接在方法中创建局部内部类
            //既然是在方法中声明的类，那作用范围也就只能在方法中了
            public void test1() {
                System.out.println("local inner class");
            }
        }

        Inner inner = new Inner();
        inner.test1();
    }

    public static void main(String[] args) {

    }
}
