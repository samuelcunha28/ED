package com.company;

public class UnorderedPair<T extends Comparable> extends Pair<T> {
    public UnorderedPair() {
        setFirst(null);
        setSecond(null);
    }

    public UnorderedPair(T firstItem, T secondItem) {
        setFirst(firstItem);
        setSecond(secondItem);
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            UnorderedPair<T> otherPair = (UnorderedPair<T>) otherObject;

            return (getFirst().equals(otherPair.getFirst())
                    && getSecond().equals(otherPair.getSecond()))
                    || (getFirst().equals(otherPair.getSecond())
                    && getSecond().equals(otherPair.getFirst()));
        }
    }

    public T getFirstItem() {
        return super.getFirst();
    }

    public T getSecondItem() {
        return super.getSecond();
    }

    public boolean compare() {
        return super.getFirst().equals(super.getSecond());
    }
}
