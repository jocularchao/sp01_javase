package t02method;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/25 12:18
 * @Description interrupt中断
 * 都有一个 interrupt() 方法,
 * 调用此方法后，会给指定线程添加一个中断标记以告知线程需要立即停止运行或是进行其他操作，
 * 由线程来响应此中断并进行相应的处理
 *
 */
public class Thread03Interrupt {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("thread start");
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    // isInterrupted 判断是否存在中断标志
                    System.out.println("发现中断信号，复位，继续运行");
                    Thread.interrupted(); //复位中断标记
                    //break; //中断
                }
            }
            //System.out.println("thread interrupt");
        });

        t1.start();
        try {
            Thread.sleep(3000); //休眠3秒，一定比线程t先醒来
            t1.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
