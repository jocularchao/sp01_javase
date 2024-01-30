# 算法

### 二  排序sort

#### 1、初级排序算法

​	**Comparable接口**

排序算法模板适用于任何实现了**Comparable接口**的数据类型。 java中包装类 Integer和Double，以及String和其他高级数据类型(File、URL)都实现了**Comparable接口**。

```java
public interface Comparable<T> {
    public int compareTo(T o);
}
```

通常实现compareTo方法来定义目标类型对象的自然次序

v.compareTo(w)当v与w无法比较 或 两者之一是null 

###### 选择排序

​	**最简单的排序算法**

1. 找到数组中**最小**的那个元素
2. 将其和数组的第一个元素交换位置
3. 在剩下的元素中找到最小的元素 ，交换位置，以此类推直到整个数组排序完

```java
public static void sort(Comparable[]a){
        //升序
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (less(a[j],a[min])){
                    min = j;
                }

            }
            exch(a, i, min);
        }
    }
```



###### 插入排序

​	为了要给插入的元素腾出空间需要其余所有元素右移

​	所需的时间取决于输入中元素的初始顺序

​	对于一个很大且其中元素**有序**的数组插入排序**首选**

​	==**但**==对于大规模乱序数组会很慢 ，因为它只会交换相邻的元素，因此元素只能一点一点从数组的一端移动到另一端

```java
public static void sort(Comparable[]a){
        //升序
        for (int i = 1; i < a.length; i++) {
            //将a[i]输入到a[i-1]a[i-2]....之中
            for (int j = i; j >0&&less(a[j],a[j-1]) ; j--) {
                exch(a, j, j-1);
            }
        }
    }
```



###### 排序算法的可视化

###### 区别

```java
```



###### 希尔排序

​	基于**插入排序**的快速的排序算法。使数组中任意间隔为h的元素都是有序的。

​	相比插入和选择 希尔排序要快得多，并且数组越大，优势越大。

​	**实际应用中，中等大小的数组，希尔排序就够了**。因为他的代码量小且不需要额外的内存空间

  

```java
public static void sort(Comparable[] a){
        //升序
        int h = 1;
        while (h<a.length/3){
            h=3*h+1;
        }
        while (h>=1){
            for (int i = h; i < a.length; i++) {
                for (int j = i; j >=h&& less(a[j],a[j-h]); j-=h) {
                    exch(a, j, j-h);
                }
            }
            h=h/3;
        }
    }
```



