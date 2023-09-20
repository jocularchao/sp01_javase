package top.jocularchao;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/20 11:11
 * @Description
 * 枚举类型其实是普通的类，继承自`Enum`类
 * 定义的每一个状态其实就是一个`public static final`的Status类型成员变量
 *  可以通过class文件查看
 */
public enum Status { //enum表示这是一个枚举类，枚举类的语法稍微有一些不一样

    //直接写每个状态的名字即可，最后面分号可以不打，但是推荐打上
    RUNNING("睡觉"),
    STUDY("学习"),
    SLEEP("睡觉"),
    SLEEP1("睡觉");
    //以上的三个状态就是枚举类的三个实例，不可能构造新的对象
    //所以在比较两个枚举类型的值时，并不需要equals，==就可以
    public static void main(String[] args) {
        System.out.println(RUNNING==STUDY);
        System.out.println(SLEEP);
    }

    private final String name;

    //枚举的构造器总是私有的，可以省略，不能声明public、protected
    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    // 继承自父类，返回的时枚举常量名
    @Override
    public String toString() {
        return super.toString();
    }

}
