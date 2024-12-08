/**
 * Employee Class
 * <p>
 * Represents an employee in the system. Extends the Person class to include specific employee attributes like employee ID and role.
 * </p>
 *
 * Author: zxiong11
 */
public class Employee extends Person {
    private String employeeId;
    private String role;

    // Default constructor
    public Employee() {
    }

    /**
     * Constructor for Employee class.
     *
     * @param name The name of the employee
     * @param age The age of the employee
     * @param gender The gender of the employee
     * @param employeeId The ID of the employee
     * @param role The role of the employee
     */
    public Employee(String name, int age, String gender, String employeeId, String role) {
        super(name, age, gender); // Call to superclass constructor (Person)
        this.employeeId = employeeId;
        this.role = role;
    }

    /**
     * Get the employee ID.
     *
     * @return The employee ID
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Set the employee ID.
     *
     * @param employeeId The new employee ID
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Get the employee's role.
     *
     * @return The role of the employee
     */
    public String getRole() {
        return role;
    }

    /**
     * Set the employee's role.
     *
     * @param role The new role of the employee
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Display the details of the employee.
     * <p>
     * Prints employee's name, age, gender, ID, and role.
     * </p>
     */
    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.printf("Name: %s\nAge: %d\nGender: %s\nEmployee ID: %s\nRole: %s\n",
                getName(), getAge(), getGender(), employeeId, role);
    }
}
