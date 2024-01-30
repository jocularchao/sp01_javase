package t03priority;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/25 18:50
 * @Description 线程优先级
 *
 * - MIN_PRIORITY  最低优先级
 * - MAX_PRIORITY  最高优先级
 * - NOM_PRIORITY  常规优先级
 */
public class ThreadPriority {
    public static void main(String[] args) {
        Thread t = new Thread(() ->{
            System.out.println("thread start");
        });

        t.start();
        t.setPriority(Thread.MIN_PRIORITY);//通过使用setPriority方法来设定优先级
    }
}
