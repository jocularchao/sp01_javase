package top.jocularchao;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/20 11:15
 * @Description
 */
public class StatusTest {
    public static void main(String[] args) {
        Student student = new Student("xx", 1, "男");

        student.setStatus(Status.RUNNING);

        System.out.println(student.getStatus());
        System.out.println(student.getStatus().getName());


        Status[] values = Status.values();
        System.out.println(values);

        //返回枚举常量
        System.out.println(Enum.valueOf(Status.class, "SLEEP"));

        //位置
        System.out.println(Status.RUNNING.ordinal());

        //在后者以前--负数
        System.out.println(Status.RUNNING.compareTo(Status.SLEEP));
    }

}
