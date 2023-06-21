package top.jocularchao.a03api;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/4 15:45
 * @description: 设置线程优先级
 * public final void setPriority（int newPriority）为线程设定优先级。
 * public final int getPriority（）获取线程的优先级。
 */
public class D03Priority {

    /*public final void setPriority(int newPriority) {
        ThreadGroup g;
        checkAccess();
        // 若新设置的priority>10或<1 则抛出异常
        if (newPriority > MAX_PRIORITY || newPriority < MIN_PRIORITY) {
            throw new IllegalArgumentException();
        }
        //若指定的线程优先级大于线程所在group的优先级
        //那么指定的优先级将会失效，并改为group的优先级
        if((g = getThreadGroup()) != null) {
            if (newPriority > g.getMaxPriority()) {
                newPriority = g.getMaxPriority();
            }
            setPriority0(priority = newPriority);
        }
    }*/

    /*public final int getPriority() {
        return priority;
    }*/
    public static void main(String[] args) {
        //1、定义一个线程组
        ThreadGroup group = new ThreadGroup("test");

        //2、设置线程组优先级
        group.setMaxPriority(6);
        //3、创建线程加入线程组
        Thread thread = new Thread(group, "thread-test");
        //4、企图设置线程优先级为10
        thread.setPriority(10);
        System.out.println(thread.getPriority());   //6
        //*****main方法的线程优先级为

        Thread thread1 = new Thread();
        ThreadGroup threadGroup = thread1.getThreadGroup();
        System.out.println(threadGroup);
        System.out.println(threadGroup.getMaxPriority());
        System.out.println(thread1.getPriority());  //5



        //一般情况下，不会对线程设定优先级别，更不会让某些业务严重地依赖线程的优先级别
        //线程默认的优先级和它的父类保持一致 5
        Thread t2 = new Thread(() ->
        {
            Thread t3 = new Thread();
            System.out.println("t3 priority " + t3.getPriority());
        });

        t2.setPriority(6);
        t2.start();
        System.out.println("t2 priority " + t2.getPriority());


    }
}
