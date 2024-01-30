package d02string;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/4 18:22
 * @Description
 */
public class StringDemo {

    public static void main(String[] args) {
        var str = "4\n5\n6";

        System.out.println(str.isBlank());

        str.strip();    //去除首位空格
        str.stripLeading();     //首位空格
        str.stripTrailing();    //尾部空格

        str
                .lines()  //根据\n换行符 切割
                .forEach(System.out::println);

        System.out.println(str.repeat(2));       //重复拼接


    }
}
