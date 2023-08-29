package top.jocularchao.l02iterator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/29 12:39
 * @Description
 */
public class IteratorDemo1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        /*Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        for (String s : list) {
            System.out.println(s);
        }
    }

}
