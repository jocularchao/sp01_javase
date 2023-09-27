package r01getclass;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/26 18:10
 * @Description 基本数据类型也有class对象
 * 本质上是定义在包装类中
 */
public class GetClassPrimitiveType {
    public static void main(String[] args) {
        Class<Integer> clazz = int.class;

        System.out.println(clazz);

        //每个包装类中（包括Void），都有一个获取原始类型Class方法，
        // 注意，getPrimitiveClass获取的是原始类型，并不是包装类型，只是可以使用包装类来表示
        System.out.println(Integer.TYPE == clazz);


    }
}
