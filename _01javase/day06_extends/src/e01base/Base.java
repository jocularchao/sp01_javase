package e01base;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/3 21:02
 * @Description Base类 了解子类能从父类继承哪些访问权限的变量和方法
 * • Sub 类和 Base 类位于同个包中时Sub类继承 Base类中 public、protected
 * 和默认访问级别的成员变昂和成员方法<br />
 * • Sub 类和 Base 类位千不同的包中时Sub类继承Base类中public、protected
 * 访问级别的成员变址和成员方法
 */
public class Base extends Object{
    public int publicVarOfBase = 1;
    private int privateVarOfBase = 1;
    int defaultVarOfBase =  1;
    protected void methodOfBase() throws ExceptionBase{}

    public class ExceptionBase extends Exception {
    }
}
