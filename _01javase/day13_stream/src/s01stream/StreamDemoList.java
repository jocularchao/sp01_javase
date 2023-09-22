package s01stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/22 18:58
 * @Description Stream与list
 * Java 8 API添加了一个新的抽象称为流Stream，可以让你以一种声明的方式处理数据。
 *
 */
public class StreamDemoList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // 移除为B的元素
        //1 迭代器操作
/*        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals("B")) iterator.remove();
        }*/

        //2 Stream操作
        list = list//链式调用
                .stream()//获取流
                .filter(e -> !e.equals("B"))//只允许所有不是B的元素通过流水线
                .collect(Collectors.toList());//将流水线中的元素重新收集起来，变回List

        System.out.println(list);

        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");

        list = list
                .stream()
                    .distinct() //去重（equals）
                .map(e -> e+"J")
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(list);



    }
}
