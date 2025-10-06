package org.homeWork1;


public class MyNode<K> {
    private int hash;
    private K keyVal;
    private MyNode next = null;
    private MyNode prev = null;
    private MyNode first = null;
    private MyNode last = null;

    public MyNode(int hash, K keyVal, MyNode next) {
        this.hash = hash;
        this.keyVal = keyVal;
        this.next = next;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public K getKeyVal() {
        return keyVal;
    }

    public void setKeyVal(K keyVal) {
        this.keyVal = keyVal;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode getPrev() {
        return prev;
    }

    public void setPrev(MyNode prev) {
        this.prev = prev;
    }

    public MyNode getFirst() {
        return first;
    }

    public void setFirst(MyNode first) {
        this.first = first;
    }

    public MyNode getLast() {
        return last;
    }

    public void setLast(MyNode last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "MyNode{" + "keyVal=" + keyVal + '}';
    }
}
