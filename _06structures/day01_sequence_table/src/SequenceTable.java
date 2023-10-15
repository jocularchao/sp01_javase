/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/15 12:02
 * @Description 顺序表实现
 */
public class SequenceTable<E> {  //加上泛型，表具体存放的元素还未知


    int capacity = 10;      //表的容量
    int size = 0;           //表存放元素个数


    private Object[] array = new Object[capacity];  //底层 要存放数据的数组

    //打印当前存放的元素
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            builder.append(array[i]).append(" ");
        }
        return builder.toString();
    }

    //插入元素
    //在特定位置插入元素，后面的元素会往后移动
    public void add(E element, int index) {
        //插入之前进行位置判断[0,size]
        if (index< 0||index>size) {
            throw new IndexOutOfBoundsException("插入位置非法，合法的插入位置为：0~"+size);
        }

        //扩容判断
        if (capacity == size) {
            int newCapacity = capacity + (capacity>>1);     //扩容规则就按照原本的1.5倍
            Object[] newObject = new Object[newCapacity];   //创建新的数组来存放更多的元素
            System.arraycopy(array, 0, newObject, 0, size); //快速拷贝原数组内容到新数组

            array = newObject;
            capacity = newCapacity;
        }

        //从后往前一个个搬运元素,直到index位置停止
        for (int i = size; i <index; i--) { // i = size  是最后一个元素位置+1
            array[i] = array[i-1];
        }
        array[index] = element;  // 腾出位置后，插入元素
        size++;     //插入元素后，个数增加

    }



    //删除元素
    //删除特定位置元素，后面的元素向前移动，补充空缺
    public E remove(int index) {

        //超出索引判断
        if (index<0 || index>size-1) {
            throw new IndexOutOfBoundsException("删除位置非法，合法的删除位置为：0~"+(size - 1));
        }

        E e = (E) array[index];     //因为存放的Object元素，需要返回被删除的元素
        for (int i = index; i < size; i++) {
            array[i] = array[i+1];
        }
        size--; //个数减1

        return e;
    }

    //get方法 获取指定元素
    public E get(int index) {
        if (index<0 || index > size-1)
            throw new IndexOutOfBoundsException("非法的位置，合法的位置为：0 ~ \"+(size - 1)");
        return (E)array[index];
    }

    //获取当前存放的元素数量
    public int size() {
        return size;
    }



 }
