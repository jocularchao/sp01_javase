package e01base;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/3 21:01
 * @Description 子类测试
 */
public class Sub extends Base{

    static void methodStatic(){}

    public void methodOfSub () throws ExceptionBase {
        publicVarOfBase = 2;
        defaultVarOfBase = 2;
        //privateVarOfBase =2 ;
        methodOfBase();
    }

    public static void main(String[] args) throws ExceptionBase {
        Sub sub = new Sub();

        sub.publicVarOfBase = 3;
        sub.defaultVarOfBase = 3;
        //sub.privateVarOfBase = 3;
        sub.methodOfBase();
        sub.methodOfSub();
    }

}
