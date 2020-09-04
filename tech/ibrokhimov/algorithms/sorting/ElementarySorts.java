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
}
