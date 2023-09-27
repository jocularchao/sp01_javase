package r02polymorphic;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/26 18:34
 * @Description 用.class代替instanceof
 */
public class InstanceOfDemo {
    public static void main(String[] args) {
        String str ="";
        //判断是否为该类型
        System.out.println(str instanceof String);
        //用.class方法代替
        System.out.println(str.getClass() == String.class);

        //asSubclass 判断子类或接口/抽象类的实现
        //当不是括号内类的 子类或接口/抽象类的实现 时会报错
        Integer i = 0;
        i.getClass().asSubclass(Number.class);

        //getSuperclass 可以获得父类的Class对象
        System.out.println(i.getClass().getSuperclass() == Number.class);

        //getGenericSuperclass 获取父类的原始类型的Type
        System.out.println(i.getClass().getGenericSuperclass() instanceof Class);
    }
}
