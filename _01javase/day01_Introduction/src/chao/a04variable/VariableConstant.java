package chao.a04variable;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/1 18:00
 * @Description 常量
 * 用关键字final指示常量，只能被赋值一次，一旦赋值，不能更改，常量一般习惯用全大写。
 * 类常量：可以在一个类的多个方法中使用
 * 使用static final定义一个类常量
 */
public class VariableConstant {
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args) {

        //常量
        final double CM_PER_INCH1 = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println(paperWidth*CM_PER_INCH);
    }
}
