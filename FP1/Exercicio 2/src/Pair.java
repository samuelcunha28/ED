public class Pair<T extends Comparable> {

    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T max() {
        if(first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }
}
