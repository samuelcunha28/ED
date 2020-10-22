public class Person {

    private String name;

    /**
     * Constructor of Person
     * @param name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Getter for person name
     * @return the person name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for person name
     * @param name the person name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method toString to print
     * @return
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
