package t05threadlocal;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/26 11:29
 * @Description 使用ThreadLocal类，来创建工作内存中的变量
 * 不同的线程访问到ThreadLocal对象时，都只能获取到当前线程所属的变量
 */
public class ThreadLocalDemo {
    public static void main(String[] args) throws InterruptedException {
        //ThreadLocal是一个泛型类,存储类型为我们要存放的变量类型
        ThreadLocal<String> local = new ThreadLocal<>();

        Thread t1 = new Thread(()->{
            local.set("lbwnb");
            System.out.println("变量已设定");
            //get 获取ThreadLocal中存放的变量
            System.out.println(local.get());
        });

        //1 即使t2存放了值，取出来的值也不会影响t1存放的值
        //可以说，不同的线程存放的数据，只会存放到线程自己的工作空间，不会直接存放到主内存中
        //因此，互不打扰
        Thread t2 = new Thread(()->{
            System.out.println(local.get());
        });

        t1.start();
        Thread.sleep(3000);
        t2.start();

        //2 当线程中子线程，无法获得父线程工作内存中的变量
        //可以用InheritableThreadLocal解决
        //在InheritableThreadLocal存放的内容，会自动向子线程传递
        ThreadLocal<String> local1 =new InheritableThreadLocal<String>();
        Thread t3 = new Thread(()->{
            local1.set("lbwnb");
            new Thread(()->{
                System.out.println(local1.get());
            }).start();
        });

        t3.start();
    }
}
