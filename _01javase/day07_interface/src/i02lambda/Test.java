package i02lambda;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/25 18:03
 * @Description 如果一个接口中有且只有一个待实现的抽象方法
 * 那么我们就可以将匿名内部类简写为lambda表达式
 */
public class Test {
    public static void main(String[] args) {
        /*Study study = new Study() {
            @Override
            public void study() {
                System.out.println("学习");
            }
        };*/

        Study study = () -> {
            System.out.println("study");
        };

        Study study1 = () -> System.out.println("xx");
        study.study();
    }
}
