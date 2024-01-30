package top.jocularchao.l04collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/22 23:28
 * @Description Collections工具类
 *
 * JDK为我们准备的Collocations类就是专用于集合的工具类
 */
public class CollectionsDemo1 {
    public static void main(String[] args) {
        //0 max min 最大值和最小值
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        //1 binarySearch 二分搜索 集合的具体类型，必须是实现Comparable接口的类
        List<Integer> list1 = Arrays.asList(2, 3, 8, 9, 10, 13);
        System.out.println(Collections.binarySearch(list1, 8));

        //2 fill 对集合的元素进行快速填充，注意这个填充是对集合中已有的元素进行覆盖
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Collections.fill(list2, 6);
        System.out.println(list2);

        //3 emptyList 有些时候我们可能需要生成一个空的集合类返回
        List<Integer> list3 = Collections.emptyList();
        //Collections.singletonList() 会生成一个只有一个元素的List
        //list3.add(10);   //不支持，会直接抛出异常

        //4 unmodifiableList 将一个可修改的集合变成只读的集合
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> newList = Collections.unmodifiableList(list4);
        //newList.add(10);   //不支持，会直接抛出异常

        //5 indexOfSubList 寻找子集合的位置
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(Collections.indexOfSubList(list5, Arrays.asList(4, 5)));

        //6 得益于泛型的类型擦除机制，实际上最后只要是Object的实现类都可以保存到集合类中
        //使用原始类型接收一个Integer类型的ArrayList
        List list6 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list6.add("aaa");   //我们惊奇地发现，这玩意居然能存字符串进去
        System.out.println(list6);

        //7 checkedList 为了避免6的情况，我们要做运行时的类型检查
        List list7 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list7 = Collections.checkedList(list7, Integer.class);   //这里的.class关键字我们会在后面反射中介绍，表示Integer这个类型
        //list7.add("aaa");//抛出类型转换异常
        System.out.println(list7);
    }
}
