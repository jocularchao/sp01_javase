package a03remove;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/17 12:12
 * @Description 移除元素
 */
public class RemoveDemo27 {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3};
        System.out.println(new RemoveDemo27().removeElement1(arr, 3));
    }


    //暴力破解
    public int removeElement(int[] nums,int val) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {   //遍历数组
            if (nums[i] == val) {       //首先找到的值为val的索引
                for (int j = i+1; j < n; j++) {     //遍历后面的元素，使其向前移动一位
                    nums[j-1] = nums[j];
                }
                i--;    //因为覆盖完后，是新的元素，需要重新判断
                n--;    //长度-1 ，尾格位置多余了
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+" ");
        }
        return n;
    }

    //双指针法

    public int removeElement1(int[] nums,int val) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex]!=val) {
                nums[slowIndex++] = nums[fastIndex];
            }
        }

        return slowIndex;

    }

    //相向双指针法
    public int removeElement2(int[] nums,int val) {
        return 1;

    }
}
