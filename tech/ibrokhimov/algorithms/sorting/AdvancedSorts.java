package tech.ibrokhimov.algorithms.sorting;

import tech.ibrokhimov.util.ArrayUtils;

public class AdvancedSorts {

    public static void mergeSort(int[] nums) {
        int N = nums.length;

        if(N < 2)
            return;

        int mid = N / 2;
        int[] left = new int[mid];
        int[] right = new int[N-mid];

        for(int i = 0 ; i < mid; i++) {
            left[i] = nums[i];
        }
        for(int i = mid ; i < N; i++){
            right[i-mid] = nums[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(nums,left, right);
    }

    private static void merge(int[] nums, int[] left, int[]right) {
        int k = 0; //nums index
        int i = 0; //left index
        int j = 0; //right index
        while(i < left.length && j < right.length) {
            if(left[i] <  right[j])
                nums[k++] = left[i++];
            else
                nums[k++] = right[j++];
        }
        while(i < left.length)
            nums[k++] = left[i++];
        while(j < right.length)
            nums[k++] = right[j++];
    }

    public static void quickSort(int[] nums){
        quickSort(nums, 0, nums.length-1);
    }

    private static void quickSort(int[] nums, int start, int end){
        if(start < end) {
            int pIndex = partition(nums, start, end);
            quickSort(nums, start, pIndex - 1);
            quickSort(nums, pIndex + 1, end);
        }
    }
    private static int partition(int[] nums, int start, int end) {
        int partitionIndex = start - 1;
        int pivot = nums[end];

        for(int i = start; i < end; i++) {
            if(nums[i] <= pivot){
                partitionIndex++;
                ArrayUtils.swapInt(nums, partitionIndex, i);
            }
        }
        ArrayUtils.swapInt(nums, partitionIndex+1, end);

        return partitionIndex+1;
    }
}
