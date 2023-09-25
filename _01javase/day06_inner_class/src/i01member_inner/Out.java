package i01member_inner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/25 12:57
 * @Description 成员内部类
 */
public class Out {

    private final String name;

    public Out(String name) {
        this.name = name;
    }

    //内部类也是类，所以说里面也可以有成员变量、方法等，甚至还可以继续套娃一个成员内部类
    //当权限改成private后，我们在外部类就无法访问内部类
    public class inner {
        String name = "1";
        public void test(){
            System.out.println("test");
        }

        public void getName(){
            System.out.println(this.name);
            System.out.println(Out.this.name);
        }
    }

    public static void main(String[] args) {
        Out out = new Out("11");

        //外层.内部类名称
        Out.inner inner = out.new inner();

        inner.test();

        //成员内部类中，是可以访问到外层的变量的
        inner.getName();

    }


}
