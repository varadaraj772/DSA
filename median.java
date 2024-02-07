import java.util.*;

class median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged[] = new int[nums1.length + nums2.length];
        int len = merged.length;
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
        if (len % 2 == 0) {

            double middle1 = merged[len / 2 - 1];
            double middle2 = merged[len / 2];
            System.out.print((middle1 + middle2)/2);
            double median = (middle1 + middle2) / 2;
            return median;
        } else {
            double median = merged[len / 2];
            System.out.print(median);
            return median;
        }

    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2 };
        int nums2[] = { 3, 4 };
        findMedianSortedArrays(nums1, nums2);
    }

}