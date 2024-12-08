/**
 * The Visitor class represents a visitor at the ride.
 * <p>
 * This class extends Person and includes specific details such as ticket ID and membership ID.
 * </p>
 *
 * Author: zxiong11
 */
public class Visitor extends Person {
    private String ticketId;      // Visitor's ticket ID
    private int membershipId;     // Visitor's membership ID

    /**
     * Default constructor.
     * Initializes a new visitor without any details.
     */
    public Visitor() {
    }

    /**
     * Parameterized constructor to initialize a visitor with the given details.
     *
     * @param name The visitor's name
     * @param age The visitor's age
     * @param gender The visitor's gender
     * @param ticketId The visitor's ticket ID
     * @param membershipId The visitor's membership ID
     */
    public Visitor(String name, int age, String gender, String ticketId, int membershipId) {
        super(name, age, gender);  // Calling the parent constructor to set name, age, and gender
        this.ticketId = ticketId;
        this.membershipId = membershipId;
    }

    /**
     * Retrieves the ticket ID of the visitor.
     *
     * @return The ticket ID of the visitor
     */
    public String getTicketId() {
        return ticketId;
    }

    /**
     * Sets the ticket ID for the visitor.
     *
     * @param ticketId The new ticket ID to set
     */
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * Retrieves the membership ID of the visitor.
     *
     * @return The membership ID of the visitor
     */
    public int getMembershipId() {
        return membershipId;
    }

    /**
     * Sets the membership ID for the visitor.
     *
     * @param membershipId The new membership ID to set
     */
    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    /**
     * Displays the details of the visitor in a formatted output.
     *
     * This method prints the visitor's details including their name, age, gender, ticket ID, and membership ID.
     */
    public void displayVisitorDetails() {
        System.out.printf("Visitor Name: %s\nAge: %d\nGender: %s\nTicket ID: %s\nMembership ID: %d\n",
                getName(), getAge(), getGender(), ticketId, membershipId);
    }

    // Main method for testing (optional)
    public static void main(String[] args) {
        // Creating a new Visitor object with sample data
        Visitor visitor1 = new Visitor("Jack", 25, "Male", "V101", 33333);
        visitor1.displayVisitorDetails();  // Display the visitor's details
    }
}
