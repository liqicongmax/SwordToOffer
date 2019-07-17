package 常见排序算法;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/17 10:20
 */
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            return 0;
        }
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1};
        System.out.println(binarySearch(arr, 3));
    }
}
