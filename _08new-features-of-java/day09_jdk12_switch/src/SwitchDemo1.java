/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/4 20:14
 * @Description jdk14 才正式发布
 */
public class SwitchDemo1 {
    public static String grade(int score) {
        score /= 10;  //既然分数段都是整数，那就直接整除10
        return switch (score) {   //增强版switch语法
            case 10, 9 -> "优秀";   //语法那是相当的简洁，而且也不需要我们自己考虑break或是return来结束switch了（有时候就容易忘记，这样的话就算忘记也没事了）
            case 8, 7 -> "良好";
            case 6 -> "及格";
            default -> "不及格";
        };

    }
    public static void main(String[] args) {
        System.out.println(SwitchDemo.grade(100));
    }
}
