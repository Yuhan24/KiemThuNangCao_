package com.example.kiemthunangcao.Demo02;

public class PhanTuNhoNhat {
    public int findMinElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
