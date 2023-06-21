package top.jocularchao.a02thread_cont;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/4 11:21
 * @description: 父子关系
 *
 * Thread的所有构造函数，最终都会去调用一个静态方法init
 *
 */
public class T04Parents {

    //init
    /*private void init(ThreadGroup g, Runnable target, String name,
                      long stackSize, AccessControlContext acc) {
        if (name == null) {
            throw new NullPointerException("name cannot be null");
        }

        this.name = name.toCharArray();

        Thread parent = currentThread();  //获取当前线程
        SecurityManager security = System.getSecurityManager();
    }*/

    //一个线程的创建肯定是由另一个线程完成的
    //被创建线程的父线程是创建它的线程


    //**我们都知道main函数所在的线程是由JVM创建的，也就是main线程，那就意味着我们前面创建的所有线程，其父线程都是main线程
}
