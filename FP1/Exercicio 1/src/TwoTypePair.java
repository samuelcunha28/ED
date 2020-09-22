public class TwoTypePair <T1, T2> {

    private T1 first;
    private T2 second;

    public TwoTypePair() {
        first = null;
        second = null;
    }

    public TwoTypePair(T1 firstItem, T2 secondItem) {
        this.first = firstItem;
        this.second = secondItem;
    }

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public String toString() {
        return ("first: " + first.toString() + "\n" + "second: " + second.toString());
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            TwoTypePair otherPair = (TwoTypePair) otherObject;
            return (first.equals(otherPair.first) && second.equals(otherPair.second));
        }
    }
}
