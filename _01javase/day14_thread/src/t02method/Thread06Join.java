package t02method;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/25 18:57
 * @Description join 加入
 * 一个线程等待另一个线程执行完成后再继续进行
 */
public class Thread06Join {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("thread 1 start");
            for (int i = 0; i < 50; i++) {
                System.out.println("1 print" + i);
            }

            System.out.println("thread 1 end");
        });

        Thread t2 = new Thread(()->{
            System.out.println("thread 2 start");
            for (int i = 0; i < 50; i++) {
                System.out.println("2 print" + i);
                if (i==10) {
                    try {
                        t1.join(); //t1加入到线程，t2等t1完成再继续
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            System.out.println("thread 2 end");
        });

        t1.start();
        t2.start();


    }
}
