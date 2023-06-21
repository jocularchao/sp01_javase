package top.jocularchao.a04synchronous_blocked;

import java.util.concurrent.TimeUnit;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/5 21:07
 * @description: synchronized（mutex）也称为锁
 *
 * 某线程获取了与mutex关联的monitor锁
 *
 * 注意的问题：
 * 与monitor关联的对象不能为空
 * synchronized作用域太大
 * 不同的monitor企图锁相同的方法
 * 多个锁的交叉导致死锁
 */
public class T03Mutex {
    private final static Object MUTEX = new Object();

    ///使用同步代码块的方式对accessResource进行了同步
    public void accessResource()
    {
        synchronized (MUTEX)
        {
            try
            {
                TimeUnit.MINUTES.sleep(10);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args)
    {
        final T03Mutex mutex = new T03Mutex();
        for (int i = 0; i < 5; i++)
        {
            new Thread(mutex::accessResource).start();
        }
    }
}
