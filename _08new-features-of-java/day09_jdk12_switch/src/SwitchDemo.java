/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/4 20:10
 * @Description
 */
public class SwitchDemo {

    public static String grade(int score) {
        score /= 10;
        String res = null;

        switch (score) {
            case 10:
            case 9:
                res="优秀";
                break;
            case 8:
            case 7:
                res="良好";
                break;
            case 6:
                res="及格";
                break;
            default:
                res="不及格";
                break;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(SwitchDemo.grade(60));
    }
}
