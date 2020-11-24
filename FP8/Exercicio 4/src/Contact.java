public class Contact implements Comparable {
    private String firstName, lastName, phone;

    /**
     * Sets up this contact with the specified information
     *
     * @param firstName a string representation of a first name
     * @param lastName a string representation of a last name
     * @param phone a string representation of a phone number
     */
    public Contact(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    /**
     * Returns a description of this contact as a string
     *
     * @return a string representation of this contact
     */
    @Override
    public String toString() {
        return lastName + ", " + firstName + "\t" + phone;
    }

    /**
     * Uses both last and first names to determine lexical ordering
     *
     * @param other the contact to be compared to this contact
     * @return the integer result of the comparison
     */
    @Override
    public int compareTo(Object other) {
        int result;
        if (lastName.equals(((Contact)other).lastName))
            result = firstName.compareTo(((Contact)other).firstName);
        else
            result = lastName.compareTo(((Contact)other).lastName);
        return result;
    }
}