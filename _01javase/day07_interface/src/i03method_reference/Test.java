package i03method_reference;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/25 18:13
 * @Description
 */
public class Test {


    public static void main(String[] args) {
        // 1
        Study study = (a,b)->a+b;

        //2 Integer
        Study study1 = (a,b)->Integer.sum(a, b);

        //3 使用双冒号来进行方法引用，静态方法使用 类名：：方法名
        Study study2 = Integer::sum;

        //4
        Test test = new Test();
        Study study3 = test::lbwnb;

        //5
        //Study study4 = String::new;

    }

    private int lbwnb(int i, int i1) {
        return 1;
    }
}
