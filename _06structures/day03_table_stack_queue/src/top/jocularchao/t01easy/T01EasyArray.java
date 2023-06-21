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
public class T01EasyArray {
    public static void main(String[] args) {
        //创建arr数组
        int[] arr = new int[10];

        //根据具体需要扩大arr
        //以arr双倍长度创建新数组
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        arr = newArr;


    }
}
