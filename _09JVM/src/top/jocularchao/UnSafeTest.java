package top.jocularchao;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/14 18:44
 * @Description
 */
public class UnSafeTest {
    public static void main(String[] args) throws IllegalAccessException {
        Field field = Unsafe.class.getDeclaredFields()[0];
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);

        //申请4字节大小的内存空间，并得到对应位置的地址
        long address = unsafe.allocateMemory(4);
        //在对应的地址上设定int的值
        unsafe.putInt(address, 6666666);
        //获取对应地址上的Int型数值
        System.out.println(unsafe.getInt(address));
        //释放申请到的内容
        unsafe.freeMemory(address);

        //由于内存已经释放，这时数据就没了
        System.out.println(unsafe.getInt(address));

    }
}
