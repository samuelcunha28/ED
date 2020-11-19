public class BinarySearch {
    /**
     * Searches the specified array of objects using a binary search algotithm
     *
     * @param data the array to be sorted
     * @param min the integer representation of the min value
     * @param max the integer representation of the max value
     * @param target the element being searched for
     * @return true if the desired element is found
     */
    public static <T extends Comparable<? super T>> boolean
    binarySearch(T[] data, int min, int max, T target) {

        boolean found = false;

        // determine the midpoint
        int midpoint = (min + max) / 2;

        if (data[midpoint].compareTo(target) == 0) {
            found = true;
        } else if( data[midpoint].compareTo(target) > 0){
            if(min < midpoint - 1){
                found = binarySearch(data, min, midpoint - 1, target);
            }
        } else {
            if(midpoint + 1 <= max){
                found = binarySearch(data, midpoint + 1, max, target);
            }
        }

        return found;
    }
}
