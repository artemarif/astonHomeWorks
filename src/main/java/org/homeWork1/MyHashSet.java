package org.homeWork1;


public class MyHashSet<K> {
    int size;
    MyNode<K>[] nodeArr = new MyNode[16];

    private int hash(K key) {
        if (key == null) return 0;
        int h = key.hashCode();
        return h ^ (h >>> 16);
    }

    private int indexFor(int hash, int length) {
        return hash & (length - 1);
    }

    public boolean put(K value) {

        int hash = hash(value);
        int index = indexFor(hash, nodeArr.length);

        if (contains(value)) {
            return false;
        }
        size++;
        MyNode<K> newNode = new MyNode<>(hash, value, nodeArr[index]);
        nodeArr[index] = newNode;
        return true;
    }

    public boolean contains(K value) {
        int hash = hash(value);
        int index = indexFor(hash, nodeArr.length);

        MyNode<K> current = nodeArr[index];
        while (current != null) {
            if (current.getHash() == hash &&
                    (current.getKeyVal().equals(value))) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public boolean remove(K value) {
        int hash = hash(value);
        int index = indexFor(hash, nodeArr.length);

        MyNode<K> current = nodeArr[index];
        MyNode<K> prev = null;

        while (current != null) {
            if (current.getHash() == hash &&
                    (current.getKeyVal().equals(value))) {
                if (prev == null) {
                    nodeArr[index] = current.getNext();
                } else {
                    prev.setNext(current.getNext());
                }
                size--;
                return true;
            }
            prev = current;
            current = current.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;

        for (int i = 0; i < nodeArr.length; i++) {
            MyNode<K> current = nodeArr[i];
            while (current != null) {
                stringBuilder.append(current.toString()).append('\n');
                current = current.getNext();
            }
        }
        return stringBuilder.toString();
    }
}
