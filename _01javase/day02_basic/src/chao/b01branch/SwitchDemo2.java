package chao.b01branch;

/**
 * Create with IntelliJ IDEA.
 *
 * @Author: zwking
 * @E-mail: zwyc16@163.com
 * @Date: 2022-01-10 11:50
 * @Description:  学会使用switch分支结构
 *
 * 1、表达式类型只能是 byte short int char JDK5开始支持枚举 ，JDK7开始支持String、不支持double 、float、long
 * 2、case给出的值不允许重复，且只能是字面量，不能是变量。
 * 3、不能忘记写break，否则会出现穿透现象
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        String weekday = "周二";
        switch (weekday){
            case "周一":
                System.out.println("埋头苦干，解决bug ");
                break;
            case "周二":
                System.out.println("请求大量程序员帮忙");
                break;
            case "周三":
                System.out.println("今晚啤酒龙虾小烧烤");
                break;
            case "周四":
                System.out.println("主动帮新来的女程序员解决bug");
                break;
            case "周五":
                System.out.println("今晚吃鸡");
                break;
            default:
                System.out.println("数据有误");

        }
    }
}
