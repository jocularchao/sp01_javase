package a02binary_search;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/16 11:36
 * @Description 二分查找
 * <p>
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 */
public class BinarySearch705 {

    //左闭右闭区间
    public int search(int[] nums, int target) {
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    //左闭右开区间
    public int search1(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left<right) {
            int mid = left+((right - left) >> 1);
            if (nums[mid]<target)
                left = mid + 1;
            else if (nums[mid]>target)
                right = mid;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};

        System.out.println(new BinarySearch705().search(nums, 3));
        System.out.println(new BinarySearch705().search(nums, 1));
        System.out.println(new BinarySearch705().search(nums, 4));
        System.out.println(new BinarySearch705().search1(nums, 1));
        System.out.println(new BinarySearch705().search1(nums, 4));


    }
}
