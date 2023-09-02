package chao.a01create;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/2 12:54
 * @Description 由Intern方法详述string创建对象过程
 *
 */
public class String03Class2Intern {
    public static void main(String[] args) {
        String a = "123456";
        String b = new String("123456");
        //很显然a和b是不相等的那么若使用intern方法则相等
        if (a == b.intern()){
            System.out.println("相等");
        }

        //why？
        //1、首先我们得了解创建的String变量都去哪了----> "" 常量池    new  堆

        //2、intern 当调用这个方法时候，如果常量池包含了一个<调用 code equals(Object)>相等的常量，就把该常量池的对象返回，
        // 否则，就把当前对象加入到常量池中并且返回当前对象的引用。

        //简明 ： 先判断这个常量是否存在于常量池，如果存在就返回地址值；若不存在就将当前对象引用复制到常量池，并且返回的是当前对象的引用
        // 若存在返回的地址值：1 引用，返回引用地址指向的对空间对象地址值 2 常量，直接返回常量池常量的地址值

        //所以，a和b b.intern 返回的是常量池的地址值并且  a和b equals相等则 a == b.intern

        //复杂问题：
        // 3
        String m = new String("1")+new String("2");
        /*
         *  首先堆中会有 1 ，2 ，以及相加之后的12 这三个对象。如果 1，23 这两个对象在常量池中没有相等的字面量
         *  那么还会在常量池中创建2个对象 最大创建了5个对象。最小创建了3个对象都在堆中。
         */
        m.intern();
        String n = "12";
        System.out.println(m==n); //true

        //4 如果把上面的m.intern();和 String n = "12";调换位置则返回 false
        //why？
        /*
        1.在执行到第二行的时候String s2 = "123"时，发现常量池没有123，所以会先创建一个常量
        2.在当s1调用intern()方法时，会发现常量池已经有了123对象，就会直接把123的常量给返回出去，
        但是由于返回值并没有接 收，所以此时s1还是堆中地址，则输入false；如果代码换成 s1 = s1.intern();
        那s1就会重新指向常量池了，那输出就为true；
         */

    }
}
