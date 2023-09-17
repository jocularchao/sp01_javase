package e03polymorphic;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/5 11:13
 * @Description
 */
public class Fish extends Food{
    double weight;

    static String name = "鲤鱼";

    void sleep(){
        System.out.println("鱼在睡觉");
    }

    static void eat(){
        System.out.println(name+"在吃");
    }
}
