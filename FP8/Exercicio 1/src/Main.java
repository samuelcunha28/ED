public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Audi", 2019);
        Car car2 = new Car("BMW", 1997);
        Car car3 = new Car("Mercedes", 2018);
        Car car4 = new Car("Opel", 2020);

        Car array[] = new Car[10];
        array[0] = car1;
        array[1] = car2;
        array[2] = car3;
        array[3] = car4;

        System.out.println("Result of the Linear Search: " + LinearSearch.LinearSearch(array, 0, 3, car4));
        System.out.println("Result of the Binary Search: " + BinarySearch.binarySearch(array, 0, 3, car4));
    }
}
