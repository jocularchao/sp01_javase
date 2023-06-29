package top.jocularchao.s01easy;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/28 14:53
 * @description:
 */
public class E01Example {
    public void sort(Comparable[] a){

    }

    public boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    public void exch(Comparable[]a,int i ,int j){
        Comparable t = a[i];
        a[i]=a[j];
        a[j]= t;
    }

    public void show(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            if (less(a[i],a[i-1])){
                return false;
            }
        }
        return true;
    }


}
