package e01base;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/3 21:01
 * @Description 子类测试
 *
 * sub类重写了base的methodOfSub方法并可以继续重载该方法
 */
public class Sub extends Base{

    static void methodStatic(){
        System.out.println("父类static");
    }

    public void methodOfSub () throws ExceptionBase {
        publicVarOfBase = 2;
        defaultVarOfBase = 2;
        //privateVarOfBase =2 ;
        methodOfBase();
    }

    public int methodOfSub(String s){
        return 0;
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
