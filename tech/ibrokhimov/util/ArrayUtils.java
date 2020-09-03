package tech.ibrokhimov.util;

public class ArrayUtils {
    public static void swapInt(int[] array, int i, int j) {
        if(array == null || i > array.length || j > array.length)
            return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
