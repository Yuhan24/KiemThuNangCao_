package com.example.kiemthunangcao.Demo02;

public class TruyXuat {
    public int getElementAtIndex(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Nằm ngoài phạm vi !");
        }
        return array[index];
    }
}
