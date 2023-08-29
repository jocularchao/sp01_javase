package top.jocularchao.test;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/25 20:29
 * @Description
 */
public class StudyTest implements Study{
    @Override
    public String test() {
        return null;
    }
    static class A implements Study<Integer>{
        //在实现接口或是继承父类时，如果子类是一个普通类，那么可以直接明确对应类型
        @Override
        public Integer test() {
            return null;
        }
    }

    static class B<T> implements Study<T>{
        //或者让子类继续为一个泛型类，那么可以不用明确
        @Override
        public T test() {
            return null;
        }
    }

    static class C extends B{

    }
}
