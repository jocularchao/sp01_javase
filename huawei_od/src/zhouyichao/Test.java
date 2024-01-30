package zhouyichao;

/**
 * @author jocularchao
 * @date 2023-12-21 12:23
 * @description
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(getSum(10));
    }
    public static int getSum(int oldBottle){
        int sum = 0;
        while(oldBottle/3>0){
            sum+=oldBottle/3;
            getSum(oldBottle/3);
        }
        return sum;

    }
}
