package org.homeWork1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        MyArrayList<Integer> arrayList1 = new MyArrayList<>();
        arrayList1.addAll(arrayList);
        arrayList1.remove(1);
        System.out.println(arrayList1);
    }
}
