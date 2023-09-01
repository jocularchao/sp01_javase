package chao.a06operator;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/1 17:33
 * @Description 三元运算符
 *
 * 条件表达式？值1：值2
 */
public class Operator02Ternary {
    public static void main(String[] args) {
        double score = 98;
        String rs = score >= 60 ? "考试通过" : "挂科";
        System.out.println(rs);

        //需要从两个整数中找出较大值
        int a= 10;
        int b=2000;
        int max=a>b?a:b;
        System.out.println(max);


        System.out.println("----------------------");
        int i = 10;
        int j =30;
        int k=50;
        //1.找出2个整数的较大值
        int temp = i>j?i:j;
        //2 那临时变量与第三个变量的值比较
        int rsMax= temp>k?temp:k;
        System.out.println(rsMax);
        System.out.println("-----扩展-----");
        int rsMax1=i>j ? i>k ?i:k: j>k?j:k;
        System.out.println(rsMax1);

    }
}