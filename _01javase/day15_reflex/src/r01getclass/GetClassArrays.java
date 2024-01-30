package r01getclass;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/26 18:29
 * @Description 数组类型也是一种类型，只是编程不可见
 */
public class GetClassArrays {
    public static void main(String[] args) {
        Class<String[]> clazz = String[].class;

        System.out.println(clazz.getName());

        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getTypeName());
        System.out.println(clazz.getClassLoader());
        System.out.println(clazz.cast(new Integer("10")));
    }
}
