package chao.a01create;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/5/1 22:17
 * @description: StringBuffer 与StringBuilder 使用起来相同
 * 但两者存在区别<br />
 * 1、String 是只读字符串，它并不是基础数据类型，而是一个对象。从底层源码来看是一个final类型的字符数组，
 * 所引用的字符串不能被改变，已经定义无法删改，每次对String的操作都会产生一个新的String对象。<br />
 * 每次+操作 ： 隐式在堆上new了一个跟原字符串相同的StringBuilder对象，再调用append方法 拼接+后面的字符。<br />
 * 2、StringBuilder、StringBuffer都继承了AbstractStringBuilder抽象类，他们的底层都是可变的字符数组<br />
 * 3、StringBuilder 并没有对方法进行加同步锁，所以是非线程安全的。
 * 4、外StringBuffer 对方法加了同步锁或者对调用的方法加了同步锁，所以是线程安全的。
 *
 *
 */
public class StringBufferDemo {

}
