package chao.b02loop;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/2 11:59
 * @Description
 */
public class Loop01For {
    public static void main(String[] args) {

        //循环定义一个变量用于记录水仙花的个数
        int count=0;
        //定义一个for循环找出全部三位数
        for (int i = 100; i <=999 ; i++) {
            //个位
            int ge = i%10;
            //十位
            int shi= i/10%10;
            //百位
            int bai=i/100;
            if ((ge*ge*ge+shi*shi*shi+bai*bai*bai)==i){
                System.out.print(i + "\t");
                count++;
            }

        }
        System.out.println(count);
    }
}
