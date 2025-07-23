package org.example.intList;

import java.util.Arrays;

public class IntArrayList implements IntList{
    private int[] array;
    private  int size;

    public IntArrayList() {
        this.array = new int[10];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int newLength = (int) (array.length * 1.5);
            array = Arrays.copyOf(array, newLength);
        }
        array[size++] = number;
    }


    @Override
    public int get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        throw new IndexOutOfBoundsException("Índice inválido: " + index);
    }
}
