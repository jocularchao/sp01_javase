package top.jocularchao.a03api;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/5 15:48
 * @description: public long getId（）获取线程的唯一ID
 * 从0开始逐次递增
 * <br/>
 * public static Thread currentThread（）用于返回当前执行线程的引用
 *
 * public ClassLoader getContextClassLoader（）获取线程上下文的类加载器
 * public void setContextClassLoader（ClassLoader cl）设置该线程的类加载器
 *
 *
 */
public class D04Id {
    public static void main(String[] args) {
        Thread thread = new Thread()
        {
            @Override
            public void run()
            {
                //always true
                System.out.println(Thread.currentThread() == this);
            }
        };
        thread.start();

        System.out.println(thread.getId());
        System.out.println(thread);
        String name = Thread.currentThread().getName();
        System.out.println("main".equals(name));
    }

}
