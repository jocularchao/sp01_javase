package chao.a04variable;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: zwking
 * @E-mail: zwyc16@163.com
 * @Date: 2022-01-05 18:19
 * @Description: 定义变量需要注意几个问题
 */
public class VariableDemo2 {
    public static void main(String[] args) {
        //1.什么类型的变量一定存放什么类型的数据
//        int age="很大";
        int age=12;

        //2.同一个范围内不能定义重名的变量
//        int age=25;
        age=25;//赋值
        //3.变量定义的时候可以不给初始化值，但是使用的时候必须要有初始化值
        double money;
//        System.out.println(money);
        money=1000;
        System.out.println(money);

    }

}
