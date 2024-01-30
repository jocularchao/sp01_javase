package c01create;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/2 20:47
 * @Description 理解引用类型的参数传递机制，值传递，区分不同点
 */
public class Class03Param {
    public static void main(String[] args) {
        int[] arrs = {12, 20, 30};
        change(arrs);
        System.out.println(arrs[1]);
    }
    public static void change(int []arrs){
        System.out.println(arrs[1]);
        arrs[1]=222;
        System.out.println(arrs[1]);
    }
}
