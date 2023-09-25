package t02method;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/25 18:56
 * @Description yield 礼让
 *
 * 在当前线程的工作不重要时，将CPU资源让位给其他线程
 *  将当前资源让位给其他同优先级线程
 */
public class Thread05Yield {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("thread 1 start");
            for (int i = 0; i < 50; i++) {
                if (i%5 == 0){

                System.out.println("yield");
                Thread.yield();
                }
                System.out.println("1 print"+i);
            }
            System.out.println("thread end");
        });

        Thread t2 = new Thread(()->{
            System.out.println("thread 2 start");
            for (int i = 0; i < 50; i++) {

                System.out.println("2 print"+i);
            }
            System.out.println("thread 2 end");
        });

        t1.start();
        t2.start();
    }
}
