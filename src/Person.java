/**
 * Person Class
 * <p>
 * Represents a generic person with attributes like name, age, and gender.
 * This is an abstract class that can be extended by other specific person types.
 * </p>
 *
 * Author: zxiong11
 */
public abstract class Person {
    private String name;
    private int age;
    private String gender;

    // Default constructor
    public Person() {
    }

    /**
     * Constructor for Person class.
     *
     * @param name The name of the person
     * @param age The age of the person
     * @param gender The gender of the person
     */
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * Get the name of the person.
     *
     * @return The name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the person.
     *
     * @param name The new name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the age of the person.
     *
     * @return The age of the person
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the age of the person.
     *
     * @param age The new age of the person
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get the gender of the person.
     *
     * @return The gender of the person
     */
    public String getGender() {
        return gender;
    }

    /**
     * Set the gender of the person.
     *
     * @param gender The new gender of the person
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}
