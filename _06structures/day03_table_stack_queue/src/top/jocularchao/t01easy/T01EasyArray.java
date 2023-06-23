package top.jocularchao.t01easy;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/20 13:26
 * @description: 表的简单数组实现
 *
 * 此操作 查找会花费常数时间
 * 但插入和删除看位置而定
 * 在数组顶端    O(1)
 * 其他位置 插入 需要数组后移一位
 *         删除 需要数组前移一位
 *         O（N）
 *
 */
public class T01EasyArray<AnyType> {
    //创建数组及变量
    //private AnyType[] data;
    private Object[] data;
    private int size;

    //构造方法



    //无参
    //默认情况下 数组默认大小为10
    public T01EasyArray() {
        this(10);
    }

    //重载 参数：capacity 容量
    public T01EasyArray(int capacity) {
        this.size = 0;
        //this.data = new AnyType[capacity];   //不能使用泛型在java构建数组  泛型只能是引用类型
        this.data=new Object[capacity];
    }

    //data的元素个数
    public int size(){
        return this.size;
    }

    public void add(AnyType element){
        data[size]=element;
        //当添加一个对象时size会变大
        size++;
    }

    public AnyType get(int index){
        return (AnyType) this.data[index];
    }

    //测试
    public static void main(String[] args) {
        /*//创建arr数组
        int[] arr = new int[10];

        //根据具体需要扩大arr
        //以arr双倍长度创建新数组
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        arr = newArr;*/
        //创建对象
        T01EasyArray<String> list = new T01EasyArray<>(20);
        //添加20个元素
        for (int i = 0; i < 20; i++) {
            String temp = "Jocular #"+i;
            list.add(temp);
        }
        System.out.println(list.size);

    }
}
