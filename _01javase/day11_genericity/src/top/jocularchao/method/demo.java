package top.jocularchao.method;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/28 11:11
 * @Description 泛型方法、界限
 */
public class demo {
    public static void main(String[] args) {
        System.out.println(test(5.0));
    }

    private static <T extends Number> T test(T t){
        //在返回值类型前添加<>并填写泛型变量表示这个是一个泛型方法
        return t;
    }

}
