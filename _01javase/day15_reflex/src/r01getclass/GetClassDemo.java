package r01getclass;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/26 12:13
 * @Description  获取class类的三种方式
 * 我们了解了类的加载，同时会提取一个类的信息生成Class对象存放在内存中.
 * 而反射机制其实就是利用这些存放的类信息，来获取类的信息和操作类。
 */
public class GetClassDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //1 使用class关键字，通过类名获取
        Class<String> clazz = String.class;

        //2 使用Class类静态方法forName()，通过包名.类名获取，注意返回值是Class<?>
        Class<?> clazz2 = Class.forName("java.lang.String");

        //3 通过实例对象获取
        Class<?> clazz3 = new String("name").getClass();

        //虽然class只有第一种方式直接获取，但最终返回的都是同一个对象
        //说明：再JVM中每个类始终只存在一个Class对象
        System.out.println(clazz2 == clazz);

        System.out.println(clazz3 == clazz);


    }
}
