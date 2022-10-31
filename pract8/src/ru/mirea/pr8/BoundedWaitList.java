package ru.mirea.pr8;

import java.util.stream.Collectors;

public class BoundedWaitList<E> extends WaitList<E> {
    private final int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (this.content.size() >= this.getCapacity()) return;
        super.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList (capacity: " + this.capacity + "):\n\t" +
                this.content.stream().map(Object::toString).collect(Collectors.joining("\n\t"));
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
        }
    }
}