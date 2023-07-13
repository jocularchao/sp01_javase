package top.jocularchao.o03initialization;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/7/13 18:44
 * @Description 默认初始化值
 */
public class Initialization {
    private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private boolean bl;
    private char c;
    private String str;

    public static void main(String[] args) {
        Initialization init = new Initialization();
        System.out.println("比特"+init.b);        //0
        System.out.println("短整型"+init.s);       //0
        System.out.println("整型"+init.i);        //0
        System.out.println("长整型"+init.l);       //0
        System.out.println("单精度"+init.f);       //0.0
        System.out.println("双精度"+init.d);       //0.0
        System.out.println("布尔"+init.bl);       //false
        System.out.println("字符"+init.c);        //‘’
        System.out.println("字符串"+init.str);     //null
    }
}
