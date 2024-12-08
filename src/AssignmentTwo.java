/**
 * AssignmentTwo Class
 * <p>
 * This class demonstrates the simulation of an amusement park ride system.
 * It handles the creation of employees (operators) and rides, adding visitors to ride queues,
 * running cycles for rides, and managing ride history. The class implements various parts of the
 * assignment, showcasing operations like importing ride history, exporting data to CSV files,
 * and printing visitor details.
 * </p>
 *
 * Author: zxiong11
 */
public class AssignmentTwo {

    /**
     * Main method to execute the simulation.
     * <p>
     * This method runs the entire sequence of operations defined in parts 3 to 7 of the assignment.
     * </p>
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partSeven();
//        assignment.partSix();
//        assignment.partFive();
//        assignment.partFourB();
//        assignment.partFourA();
//        assignment.partThree();
    }

    /**
     * Part 7 implementation: Import ride history from CSV and print the queue.
     */
    public void partSeven() {


    /**
     * Part 6 implementation: Add visitors and export ride history to a CSV file.
     */
    public void partSix() {

    }

    /**
     * Part 5 implementation: Run a cycle on the roller coaster and print details.
     */
    public void partFive() {

    }

    /**
     * Part 4B implementation: Sort ride history and print it.
     */
    public void partFourB() {

    }

    /**
     * Part 4A implementation: Add visitors to ride history and print details.
     */
    public void partFourA() {

    }

    /**
     * Part 3 implementation: Add visitors to the queue, remove one, and print the queue.
     */
    public void partThree() {
        Employee operator = createOperator("Alice", 35, "Female", "E101", "Ride Operator");
        Ride rollerCoaster = createRide("Roller Coaster", 2, operator);

        // Create and add visitors to the queue
        addVisitorsToQueue(rollerCoaster);

        // Print the queue before and after removing a visitor
        rollerCoaster.printQueue();
        rollerCoaster.removeVisitorFromQueue();
        rollerCoaster.printQueue();
    }


}
