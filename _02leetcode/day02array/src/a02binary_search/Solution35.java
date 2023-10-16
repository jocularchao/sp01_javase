package a02binary_search;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/16 18:06
 * @Description 35.搜索插入位置
 */
public class Solution35 {
    public int searchInsert(int[] nums,int target) {
        int n = nums.length;

        int low = 0;
        int high = n - 1;

        while (low<= high) {
            int mid = low + ((high-low)>>1);
            if (nums[mid] == target)
                return mid;
            else if (nums[mid]<target)
                low = mid + 1;
            else if (nums[mid]>target)
                high = mid -1;
        }

        return high+1;
    }

    public int searchInsert1(int[] nums,int target) {
        int n = nums.length;

        int low = 0;
        int high = n;

        while (low< high) {
            int mid = low + ((high-low)>>1);
            if (nums[mid] == target)
                return mid;
            else if (nums[mid]<target)
                low = mid + 1;
            else if (nums[mid]>target)
                high = mid;
        }

        return high;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9};
        System.out.println(new Solution35().searchInsert1(arr, 4));
    }
}
