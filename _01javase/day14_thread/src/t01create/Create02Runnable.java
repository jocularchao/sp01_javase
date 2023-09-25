package t01create;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/24 22:10
 * @Description 通过Runnable接口创建
 *
 * 我们发现运行是在交替进行的，并且有一定的优先级
 */
public class Create02Runnable implements Runnable {
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我是线程0" + i);
        }
    }

    public static void main(String[] args) {
        //Create02Runnable runnable = new Create02Runnable();

        //创建Thread对象，通过线程对象启动我们的线程,即代理
        //Thread t0 = new Thread(runnable);
        //t0.start();

        //简写
        new Thread(new Create02Runnable()).start();


        //3 其实内部实现还可以用lambda表达式这样简写
        /*
        new Thread(new Runnable() {
            @Override
            public void run() {
            }
        }).start();*/

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("我是一号线程：" + i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("我是二号线程：" + i);
            }
        });

        t1.start();
        t2.start();
    }
}
