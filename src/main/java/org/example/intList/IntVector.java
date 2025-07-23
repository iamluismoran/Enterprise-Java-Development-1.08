package org.example.intList;

import java.util.Arrays;

public class IntVector implements IntList{
    private int[] array;
    private int size;

    public IntVector() {
        this.array = new int[20];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = number;
    }

    @Override
    public int get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        throw  new IndexOutOfBoundsException("Índice inválido: " + index);
    }
}
