package top.jocularchao.a08pool;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/6 15:02
 * @description: 线程池创建
 *
 *
 * 参数：
 * corePoolSize 线程池基本大小：
 *      当提交一个任务到线程池时，线程池会创建一个线程来执行任务，
 *      即使其他空闲的基本线程能够执行新任务也会创建线程，等到需要执行的任务数大于线程池基本大小时
 *      就不再创建。  若调用线程池的prestartAllCoreThreads()方法，线程池会提前创建并启动所有基本线程。
 *
 * runnableTaskQueue 任务队列：
 *      保存等待执行的任务的阻塞队列。选择几个阻塞队列
 *      ArrayBlockingQueue
 *      基于数组结构的有界阻塞队列 按FIFO（先进先出）原则对元素进行排序
 *      LinkedBlockingQueue
 *      基于链表结构的阻塞队列按FIFO排序元素，吞吐量通常要高于ArrayBlockingQueue
 *      静态工厂方法Executors.newFixedThreadPool()使用了这个队列
 *      SynchronousQueue
 *      一个不存储元素的阻塞队列。
 *      每个插入操作必须等到另一个线程调用移除操作，
 *      否则插入操作一直处于阻塞状态，
 *      吞吐量通常要高于Linked-BlockingQueue，
 *      静态工厂方法Executors.newCachedThreadPool使用了这个队列。
 *      PriorityBlockingQueue
 *      一个具有优先级的无限阻塞队列
 *
 * maximumPoolSize 线程池最大数量
 *
 *  ThreadFactory 用于设置创建线程的工厂
 *
 */
public class P01ThreadPoolExecutorCreate {
    public static void main(String[] args) {
        new ThreadPoolExecutor()
    }
}
