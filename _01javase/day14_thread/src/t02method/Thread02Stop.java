package t02method;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/25 12:11
 * @Description stop 终止
 *
 *  stop() 方法来强行终止此线程
 *  不推荐使用
 *  虽然简单粗暴，但是很有可能导致资源不能完全释放,可以使用interrupt
 */
public class Thread02Stop {
    public static void main(String[] args) {
        new Thread(()->{
            for (int i = 0; i < 50; i++) {
                System.out.print(i+" ");
                if (i==20)  Thread.currentThread().stop();
            }
        }).start();
    }
}
