package top.jocularchao.t02api;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/21 11:25
 * @description:
 */
public class CollectionTest implements Collection {
    //返回集合中的项数
    @Override
    public int size() {
        return 0;
    }

    //判断是否为空
    @Override
    public boolean isEmpty() {
        return false;
    }

    //是否存在 存在返回true；否则false
    @Override
    public boolean contains(Object o) {
        return false;
    }

    //迭代器
    @Override
    public Iterator iterator() {
        return null;
    }

    //
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    //添加
    @Override
    public boolean add(Object o) {
        return false;
    }

    //删除
    @Override
    public boolean remove(Object o) {
        return false;
    }

    //
    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate filter) {
        return Collection.super.removeIf(filter);
    }

    //清空
    @Override
    public void clear() {

    }

    @Override
    public Spliterator spliterator() {
        return Collection.super.spliterator();
    }

    @Override
    public Stream stream() {
        return Collection.super.stream();
    }

    @Override
    public Stream parallelStream() {
        return Collection.super.parallelStream();
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    //公共方法
    //打印任意集合中所有的项
    public static<String> void print(Collection<String> coll){
        for (String item :
                coll) {
            System.out.println(item);

        }
    }
}
