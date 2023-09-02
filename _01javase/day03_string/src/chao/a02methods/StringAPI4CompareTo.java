package chao.a02methods;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/4/24 18:26
 * @description: compareTo方法
 * int compareTo(String anotherString)
 * 按字典顺序比较两个字符串。
 */
public class StringAPI4CompareTo {
    public static void main(String[] args) {
        String a = "1";
        String b = "1";


        if (a.compareTo(b)==0){
            System.out.println("相等");
        }else if (a.compareTo(b)==-1){
            System.out.println("no");
        }
    }
}
