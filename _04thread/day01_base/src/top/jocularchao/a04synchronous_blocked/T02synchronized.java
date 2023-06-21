package top.jocularchao.a04synchronous_blocked;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/5 20:47
 * @description: synchronized关键字
 *
 * T01出现的问题 因为多个线程对index变量同时操作引起的
 *
 * synchronized 提供了一种排他机制，在同一时间只能有一个线程执行某些操作
 *
 * synchronized关键字可以实现一个简单的策略来防止线程干扰和内存一致性错误，
 * 如果一个对象对多个线程是可见的，
 * 那么对该对象的所有读或者写都将通过同步的方式来进行
 *
 * <br/>
 * 用法：
 * 对代码块或方法进行修饰
 * 不能对class以及变量进行修饰
 */
public class T02synchronized {
    public synchronized void sync(){}
    public synchronized static void staticSync(){}

    private final Object MUTEX= new Object();
    public void test(){
        synchronized (MUTEX){

        }
    }
}
