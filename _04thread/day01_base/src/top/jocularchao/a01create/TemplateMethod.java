package top.jocularchao.a01create;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/3 16:31
 * @description: 04模板设计模式理解
 */
public class TemplateMethod {
    public final void print(String message){
        System.out.println("#########");
        wrapPrint(message);
        System.out.println("############");
    }

    protected void wrapPrint(String message){

    }

    public static void main(String[] args) {
        TemplateMethod t1 = new TemplateMethod(){
            @Override
            protected void wrapPrint(String message) {
                System.out.println("*"+message+"*");
            }
        };

        t1.print("hello");
    }
}
