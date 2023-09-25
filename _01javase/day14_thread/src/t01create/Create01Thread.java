package t01create;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/24 21:59
 * @Description 通过Thread类创建
 *
 *
 */
public class Create01Thread extends Thread{
    //1 继承Thread类，重写run方法，调用start方法运行

    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 50; i++) {
            System.out.println("我是0号线程：" + i);
        }
    }

    //main线程，主线程
    public static void main(String[] args) {
        //2 创建一个线程对象 , 并调用start方法开启线程
        Create01Thread t0 = new Create01Thread();
        t0.start();
        System.out.println("我是主线程");
    }
}
