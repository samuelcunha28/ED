public class Car implements Comparable<Car> {

    // instance variables
    private String brand;
    private int year;

    /**
     * Constructor of Car
     * @param brand the brand's car
     * @param year the year
     */
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    /**
     * Getter for brand
     * @return the brand's car
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Setter for brand
     * @param brand the brand's car
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Getter for year
     * @return the car year
     */
    public int getYear() {
        return year;
    }

    /**
     * Setter for year
     * @param year the car year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Method that compares different cars year
     * @param o
     * @return
     */
    @Override
    public int compareTo(Car o) {
        try {
            Car tmp = (Car) o;
            if (this.year < tmp.year) {
                return -1;
            } else if (this.year > tmp.year) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            throw new ClassCastException();
        }
    }
}