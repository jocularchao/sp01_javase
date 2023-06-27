package top.jocularchao.t01easy;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/20 13:26
 * @description: 表的简单数组实现
 * <p>
 * 此操作 查找会花费常数时间
 * 但插入和删除看位置而定
 * 在数组顶端    O(1)
 * 其他位置 插入 需要数组后移一位
 * 删除 需要数组前移一位
 * O（N）
 */
public class T01EasyArray<AnyType> {

    //private AnyType[] data;
    private Object[] data;  // 创建数组以期转换成AnyType类型 实现表存储数据
    private int size;       // 表内元素个数

    //构造方法

    //无参
    //默认情况下 数组默认大小为10
    public T01EasyArray() {
        this(10);
    }

    //重载 参数：capacity 容量
    // 初始化data数组、size
    public T01EasyArray(int capacity) {
        this.size = 0;
        //this.data = new AnyType[capacity];   //不能使用泛型在java构建数组  泛型只能是引用类型  所以字段data改为Object类
        this.data = new Object[capacity];
    }

    //获取表的元素个数  O(1)
    public int size() {
        return this.size;
    }

    // 添加表元素
    //不扩展存储:    O(1)
    //扩展存储:      O(N) 复制原数组到新数组中 由其中元素决定 so?
    public void add(AnyType element) {
        // 扩展判断，当size大于或等于数组长度时
        if (size >= data.length) {
            expandStorage();
        }
        data[size] = element;
        //当添加一个对象时size会变大
        size++;
    }

    //根据索引位置增加元素  即插入
    public void add(AnyType element,int index){
        // 判断index在数组中的位置
        if (index>size){
            throw new ArrayIndexOutOfBoundsException("Index of " + index + " is bigger than the number of elements, which is " + size);
        }
        if (index == size){
            add(element);
            return;
        }
        //扩充判定
        if (size>=data.length){
            expandStorage();
        }

        //
        for (int i = size; i < index ; i--) {
            data[i] = data[i-1];
        }
        data[index] = element;
        size++;


    }
    //构建数组扩展数据
    private void expandStorage() {
        //在重复扩展数据和分配过大空间之间找到一个快乐的媒介  1.5  size * 1.5 = size + size/2   +1 保证>0
        int expendsSize = size + size / 2 + 1;
        //构建新数组
        Object[] expandedData = new Object[expendsSize];
        //复制原数组内容到新数组中
        for (int i = 0; i < size; i++) {
            expandedData[i] = data[i];
        }
        //data指向新数组完成扩充
        this.data = expandedData;
    }

    //根据索引值获取元素值 O(1)
    public AnyType get(int index) {
        // 进行数组下标越界判断，确认后抛出异常
        // 异常在逻辑之外 不做复杂度考虑
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index of " + index + " is bigger than the number of elements, which is " + size);
        }
        return (AnyType) this.data[index];
    }

    // 移除目标索引的值并将其输出到控制台
    public AnyType remove(int index) {
        // 当然先做下标越界判断
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index of " + index + " is bigger than the number of elements, which is " + size);
        }
        AnyType thingToReturn = (AnyType) data[index];
        //若从表中间移除一个值 需要由目标索引的下一个索引处依次替代上一个
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        data[size - 1] = null;
        size--;
        return thingToReturn;
    }

    public void printList() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

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
        T01EasyArray<String> list = new T01EasyArray<>();
        //添加20个元素
        for (int i = 0; i < 20; i++) {
            String temp = "Jocular #" + i;
            list.add(temp);
        }
        list.printList();
        System.out.println(list.size);
        //移除一位
        System.out.println(list.remove(19));
        list.printList();

        list.add("new",19);
        list.printList();

        MyIterator iter1 = T01EasyArray.iterator();
    }

    // 迭代器
    public class MyIterator{
        private int currentIndex;

        public MyIterator(){
            this.currentIndex = 0;
        }

        public boolean hasNext(){
            if (currentIndex >= T01EasyArray.this.size){
                return false;
            }
            return true;
        }

        public AnyType next(){
            //AnyType thingToReturn = data[currentIndex];
        }
    }
}

