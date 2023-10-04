package d01lambda;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/4 12:04
 * @Description
 */
public class LambdaDemo {
    public static void main(String[] args) {
        Test test = (var i)->{
            System.out.println(i);
        };

    }
}
