package j01lambda;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/29 22:02
 * @Description
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1  = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });

        t1.start();
        /*new Thread(()->{
            System.out.println("hello");
        }).start();*/
        Test test0 = i->{return ""+i;};

        Test test = (int i)-> ""+i;

        //简化
        Test t2 = i-> ""+i;

        Test t3 = (i)->impl(i);

        Test t4 = ThreadDemo::impl;
    }

    public static String impl(int i) {
        return ""+i;
    }
}
