package t06timer;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/26 11:38
 * @Description 定时器
 * 我们通过sleep来实现
 */
public class TimerDemo {
    public static void main(String[] args) {
        new TimerTask(()-> System.out.println("i m timer task") ,3000).start();
    }
}

class TimerTask{
    Runnable task;
    long time;

    public TimerTask(Runnable task, long time) {
        this.task = task;
        this.time = time;
    }

    public void start() {
        new Thread(()->{
            try {
                Thread.sleep(time);
                task.run();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}
