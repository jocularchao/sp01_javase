package top.jocularchao.a04synchronous_blocked;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/5 21:32
 * @description: 交叉锁导致程序出现死锁
 */
public class T05DeadLock01 {

    private final static Object READ = new Object();
    private final static Object WRITE = new Object();

    public void read(){
        synchronized (READ){
            System.out.println(Thread.currentThread().getName()+"locked");
            synchronized (WRITE){
                System.out.println(Thread.currentThread().getName()+"locked");
            }
            System.out.println(Thread.currentThread().getName()+"release");
        }
        System.out.println(Thread.currentThread().getName()+"release");
    }

    public void write(){
        synchronized (WRITE){
            System.out.println(Thread.currentThread().getName()+"locked");
            synchronized (READ){
                System.out.println(Thread.currentThread().getName()+"locked");
            }
            System.out.println(Thread.currentThread().getName()+"release");
        }
        System.out.println(Thread.currentThread().getName()+"release");
    }

    public static void main(String[] args) {
        final T05DeadLock01 t05DeadLock01 = new T05DeadLock01();
        new Thread(()->{
            while (true){
                t05DeadLock01.read();
            }
        },"READ-THREAD").start();
        new Thread(()->{
            t05DeadLock01.write();
        },"WRITE-THREAD").start();
    }

}
