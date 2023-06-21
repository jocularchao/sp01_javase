package top.jocularchao.a02thread_cont;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/4 11:40
 * @description: Thread的构造函数中，
 * 可发现有一个特殊的参数stackSize
 *
 * 新线程所需的堆栈大小
 *
 *
 *
 * 一般情况下，创建线程的时候不会手动指定栈内存的地址空间字节数组，统一通过xss参数进行设置即可
 * stacksize越大则代表着正在线程内方法调用递归的深度就越深，stacksize越小则代表着创建的线程数量越多
 * 这个参数对平台的依赖性比较高，比如不同的操作系统、不同的硬件
 *
 */
public class T06Stacksize {
    public static void main(String[] args) {
        if (args.length<1){
            System.out.println("please enter the stack size");
            System.exit(1);
        }

        ThreadGroup group = new ThreadGroup("TestGroup");

        Runnable runnable = new Runnable() {
            final int MAX = Integer.MAX_VALUE;

            @Override
            public void run() {
                int i = 0;
                recurse(i);
            }

            private void recurse(int i){
                System.out.println(i);
                if (i<MAX){
                    recurse(i+1);
                }
            }
        };

        Thread thread = new Thread(group, runnable, "Test", Integer.parseInt(args[0]));
        thread.start();


    }


}
