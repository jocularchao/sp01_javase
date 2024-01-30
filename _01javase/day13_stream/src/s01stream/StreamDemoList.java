package s01stream;

import java.util.ArrayList;
import java.util.Arrays;
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


        // 普通的List只需要一步就可以直接转换成IntStream
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.stream()
                .mapToInt(i->i) //将每一个元素映射为Integer类型（这里因为本来就是Integer）
                .summaryStatistics();
        System.out.println(list1);

        //通过Stream来完成所有数字的和，使用`reduce`方法：
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        int sum = list3
                .stream()
                .reduce((a,b)->a+b) //a是上一次计算的值，b是当前要计算的参数，这里是求和
                .get();//我们发现得到的是一个Optional类实例，通过get方法返回得到的值
        System.out.println(sum);

        // 通过`flat`来对整个流进行进一步细分
        List<String> list2 = new ArrayList<>();
        list2.add("A,B");
        list2.add("C,D");
        list2.add("E,F");   //我们想让每一个元素通过,进行分割，变成独立的6个元素
        list2 = list2
                .stream()
                .flatMap(e-> Arrays.stream(e.split(","))) ////分割字符串并生成新的流
                .collect(Collectors.toList());  ////汇成新的List
        System.out.println(list2);


    }
}
