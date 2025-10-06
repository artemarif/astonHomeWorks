package org.homeWork1;

import java.util.Arrays;

public class MyArrayList<K> {
    private static final int BASE_LENGTH = 16;
    public int length;
    public Object[] arr;
    public int size = 0;

    public MyArrayList() {
        this(BASE_LENGTH);
    }


    public MyArrayList(int length) {
        this.length = length;
        arr = new Object[length];
    }

    public boolean add(K value) {
        if (value == null) {
            return false;
        }
        if (size + 1 > arr.length){
            resize(arr.length * 2);
        }
        arr[size++] = value;
        return true;
    }

    public boolean add(int index, K value) {
        if (value == null) {
            return false;
        }
        checkIndex(index);
        System.arraycopy(arr, index, arr, index + 1, size - index);
        arr[index] = value;
        size++;
        return true;
    }

    public K get(int index) {
        checkIndex(index);
        return (K) arr[index];
    }

    public K remove(int index) {
        checkIndex(index);
        K removedElement = (K) arr[index];
        System.arraycopy(arr, index + 1, arr, index, size - index - 1);
        return removedElement;
    }

    public boolean remove(K value) {
        if (value == null) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (value.equals(arr[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean addAll(MyArrayList<K> otherArr) {
        if (otherArr == null || otherArr.size == 0) {
            return false;
        }
        if (otherArr.arr.length > arr.length) {
            resize(otherArr.arr.length + arr.length);
        }
        System.arraycopy(otherArr.arr, 0, arr, size, otherArr.size);
        size += otherArr.size;

        return true;
    }

    private void checkIndex(int index) {
        if (index < 0 && index > size) {
            resize(arr.length * 2);
        }
    }

    private void resize(int newLength) {
        arr = Arrays.copyOf(arr, newLength);
    }

    @Override
    public String toString() {
        return "MyArrayList{" + "arr=" + Arrays.toString(arr) + '}';
    }
}