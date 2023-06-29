# 算法

### 二、排序sort

#### 1初级排序算法

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

1. 找到数组中最小的那个元素
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

###### 排序算法的可视化

###### 区别

###### 希尔排序