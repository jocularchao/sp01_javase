package m01hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/22 18:44
 * @Description Map中定义的哪些杂七杂八的方法
 */
public class HashMapDemoMethod {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.remove(1);
        System.out.println(map);
        //1 compute
        map.compute(1, (k,v) -> {//compute会将指定Key的值进行重新计算，若Key不存在，v会返回null
            return v+"M";

        });

        //computeIfPresent
        map.computeIfPresent(1,(k,v) -> {//当Key存在时存在则计算并赋予新的值
            return v+"M";
        });
        System.out.println(map);

        //computeIfAbsent
        map.remove(2);
        map.computeIfAbsent(2, (k) -> {//若不存在则计算并插入新的值
            return "M";

        });
        System.out.println(map);

        //2 merge方法用于处理数据
        List<Student> students = Arrays.asList(
                new Student("yoni", "English", 80),
                new Student("yoni", "Chiness", 98),
                new Student("yoni", "Math", 95),
                new Student("taohai.wang", "English", 50),
                new Student("taohai.wang", "Chiness", 72),
                new Student("taohai.wang", "Math", 41),
                new Student("Seely", "English", 88),
                new Student("Seely", "Chiness", 89),
                new Student("Seely", "Math", 92)
        );
        Map<String,Integer> scoreMap = new HashMap<>();
        //merge方法可以对重复键的值进行特殊操作，比如我们想计算某个学生的所有科目分数之后，那么就可以像这样：

        students.forEach(student ->
                scoreMap.merge(student.getName(), student.getScore(), Integer::sum));

        scoreMap.forEach((k,v) ->
                System.out.println("key:"+k+"总分："+v));

        //3 replace 可以快速替换某个映射的值
        map.replace(1, "A");
        System.out.println(map);

        //4 remove 可以键值同时匹配

    }
}
class Student {
    private final String name;
    private final String type;
    private final int score;

    public Student(String name, String type, int score) {
        this.name = name;
        this.type = type;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getType() {
        return type;
    }
}