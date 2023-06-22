package top.jocularchao.t02api;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/22 17:14
 * @description: 实现iterable接口的集合提供一个iterator的方法返回一个Iterator类型的对象
 *
 *
 */
public class IteratorTest implements Iterable{
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}
