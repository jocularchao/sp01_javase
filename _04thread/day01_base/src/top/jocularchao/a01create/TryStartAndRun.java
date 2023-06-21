package top.jocularchao.a01create;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/2 23:08
 * @description: 02start和 run 方法 以及生命周期
 */
public class TryStartAndRun {
    //start 方法剖析
    /*public synchronized void start() {
        *//**
         * This method is not invoked for the main method thread or "system"
         * group threads created/set up by the VM. Any new functionality added
         * to this method in the future may have to also be added to the VM.
         *
         * A zero status value corresponds to state "NEW".
         *//*
        if (threadStatus != 0)
            throw new IllegalThreadStateException();

        *//* Notify the group that this thread is about to be started
         * so that it can be added to the group's list of threads
         * and the group's unstarted count can be decremented. *//*
        group.add(this);

        boolean started = false;
        try {
            start0();
            started = true;
        } finally {
            try {
                if (!started) {
                    group.threadStartFailed(this);
                }
            } catch (Throwable ignore) {
                *//* do nothing. If start0 threw a Throwable then
                  it will be passed up the call stack *//*
            }
        }
    }*/

    //最核心部分是start0()  private native void start0();
    //start方法中调用start0方法
    //在开始执行这个线程时，JVM将会调用该线程的run方法即
    //run方法是被JNI方法start0()调用的
    /*
    *Thread被构造后的NEW状态，事实上threadStatus这个内部属性为0
    *不能两次启动Thread，否则就会出现IllegalThreadStateException异常
    *线程启动后将会被加入到一个ThreadGroup中，后文中我们将详细介绍ThreadGroup
    *一个线程生命周期结束，也就是到了TERMINATED状态，再次调用start方法是不允许的，也就是说TERMINATED状态是没有办法回到RUNNABLE/RUNNING状态的
    * */

}
