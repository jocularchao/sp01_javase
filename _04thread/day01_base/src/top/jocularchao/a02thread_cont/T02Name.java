package top.jocularchao.a02thread_cont;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/4 11:08
 * @description: 线程命名
 */
public class T02Name {
    private final static String PREFIX = "ALEX-";

    public static void main(String[] args) {
    //    IntStream.range(0, 5).mapToObj(ThreadConstruction::createThread)
    //            .forEach(Thread::start);
    }

    private static Thread createThread(final int intName){
        return new Thread(
                ()-> System.out.println(Thread.currentThread().getName()),PREFIX+intName
        );
    }
}
