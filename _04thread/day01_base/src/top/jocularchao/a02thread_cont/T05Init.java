package top.jocularchao.a02thread_cont;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/4 11:26
 * @description: 继续init 源码
 */
public class T05Init {
    /*SecurityManager security = System.getSecurityManager();
    if (g == null) {
        *//* Determine if it's an applet or not *//*
    *//* If there is a security manager, ask the security manager
        what to do. *//*
        if (security != null) {
            g = security.getThreadGroup();
        }
    *//* If the security doesn't have a strong opinion of the matter
        use the parent thread group. *//*
        if (g == null) {
            g = parent.getThreadGroup();
        }
    }*/

    //如果在构造Thread的时候没有显示地指定一个ThreadGroup，那么子线程将会被加入父线程所在的线程组
    //测试
    public static void main(String[] args) {
        //1、
        Thread t1 = new Thread("t1");

        //2、
        ThreadGroup group = new ThreadGroup("TestGroup");


        //3、
        Thread t2 = new Thread(group, "t2");
        ThreadGroup mainThreadGroup = Thread.currentThread().getThreadGroup();

        System.out.println("Main thread belong group:" + mainThreadGroup.getName());
        System.out.println("t1 and main belong the same group:" + (mainThreadGroup == t1.getThreadGroup()));
        System.out.println("t2 thread group not belong main group:" + (mainThreadGroup == t2.getThreadGroup()));
        System.out.println("t2 thread group belong main TestGroup:" + (group == t2.getThreadGroup()));


    }

}
