package tech.ibrokhimov.algorithms.sorting;

import tech.ibrokhimov.util.ArrayUtils;

public class ElementarySorts  {

    public static void selectionSort(int[] array) {
        if(array == null)
            return;
        for(int i = 0; i < array.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[min])
                    min = j;
            }
            ArrayUtils.swapInt(array, i, min);
        }
    }

    public static void insertionSort(int[] array) {
        if(array == null)
            return;
        for(int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i-1;
            while(j >=0 && array[j] > key) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }

    public static void shellSort(int[] nums) {
        int h = nums.length / 2;
        while(h > 0) {
            for(int i = h; i < nums.length; i++) {
                int key = nums[i];
                int j = i;
                while(j >= h && nums[j-h] > key ) {
                    nums[j] = nums[j-h];
                    j -= h;
                }
                nums[j] = key;
            }
            h /= 2;
        }
    }
}
