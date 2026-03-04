import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n+m];


        for(int i=0;i<n;i++)
            arr[i] = nums1[i];

        for(int j=0;j<m;j++)
            arr[n+j] = nums2[j];



        Arrays.sort(arr);
        int total = n+m;
        if(total % 2 == 1)
            return arr[total/2];
        else
            return (arr[total/2] + arr[total/2 -1]) / 2.0;
    }
}