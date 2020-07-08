package com.company;

public class Util {

    public static int[] getShuffledArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int)(Math.random() * size);
        }
        return result;
    }

    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1])
                return false;
        }
        return true;
    }

    public static Integer[] getShuffledArrayInt(int size) {
        Integer[] result = new Integer[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int)(Math.random() * size);
        }
        return result;
    }

    public static boolean isSortedInt(Integer[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1])
                return false;
        }
        return true;
    }
}
