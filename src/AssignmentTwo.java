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
        Employee operator = createOperator("Alice", 35, "Female", "E101", "Ride Operator");
        Ride rollerCoaster = createRide("Roller Coaster", 2, operator);

        // Import and display the ride history
        rollerCoaster.importRideHistory("exportFile.csv");
        printRideQueueDetails(rollerCoaster);
    }

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
        Employee operator = createOperator("Alice", 35, "Female", "E101", "Ride Operator");
        Ride rollerCoaster = createRide("Roller Coaster", 2, operator);

        // Add visitors to the ride history
        addVisitorsToHistory(rollerCoaster);

        // Print the number of visitors and all visitors in the history
        printRideHistoryDetails(rollerCoaster);
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

    /**
     * Create and return a new Employee object.
     *
     * @param name The name of the employee
     * @param age The age of the employee
     * @param gender The gender of the employee
     * @param id The ID of the employee
     * @param role The role of the employee
     * @return A new Employee object
     */
    private Employee createOperator(String name, int age, String gender, String id, String role) {
        return new Employee(name, age, gender, id, role);
    }

    /**
     * Create and return a new Ride object.
     *
     * @param name The name of the ride
     * @param capacity The capacity of the ride
     * @param operator The employee operating the ride
     * @return A new Ride object
     */
    private Ride createRide(String name, int capacity, Employee operator) {
        return new Ride(name, capacity, operator);
    }

    /**
     * Add a list of visitors to the queue.
     *
     * @param ride The ride object
     */
    private void addVisitorsToQueue(Ride ride) {
        Visitor[] visitors = {
                new Visitor("Tom", 25, "Male", "V101", 000),
                new Visitor("Sherly", 22, "Female", "V102", 999),
                new Visitor("Ben", 28, "Male", "V103", 6777),
                new Visitor("David", 24, "Female", "V104", 868),
                new Visitor("Jack", 30, "Male", "V105", 456654),
                new Visitor("Lee", 30, "Female", "V106", 645645),
                new Visitor("Jack", 25, "Male", "V107", 654654),
                new Visitor("Sharon", 22, "Female", "V108", 65465463),
                new Visitor("Benny", 28, "Male", "V109", 635634),
                new Visitor("Leo", 24, "Female", "V110", 63463546),
                new Visitor("Nehemia", 30, "Male", "V111", 634565436)
        };
        for (Visitor visitor : visitors) {
            ride.addVisitorToQueue(visitor);
        }
    }

    /**
     * Add visitors to the ride history.
     *
     * @param ride The ride object
     */
    private void addVisitorsToHistory(Ride ride) {
        Visitor[] visitors = {
                new Visitor("Jack", 25, "Male", "V101", 33333),
                new Visitor("Sharon", 22, "Female", "V102", 2222),
                new Visitor("Benny", 28, "Male", "V103", 22),
                new Visitor("Leo", 24, "Female", "V104", 333),
                new Visitor("Nehemia", 30, "Male", "V105", 4444)
        };
        for (Visitor visitor : visitors) {
            ride.addVisitorToHistory(visitor);
        }
    }

    /**
     * Print the queue before and after running the cycle.
     *
     * @param ride The ride object
     */
    private void printQueueBeforeAfterCycle(Ride ride) {
        System.out.println("Visitors in queue before the cycle:");
        ride.printQueue();

        // Run a cycle and print updated queue
        ride.runOneCycle();

        System.out.sprintln("Visitors in queue after the cycle:");
        ride.printQueue();
    }


    /**
     * Print ride history details: the total number of visitors and all the visitors.
     *
     * @param ride The ride object
     */
    private void printRideHistoryDetails(Ride ride) {
        System.out.println("Total visitors in ride history: " + ride.numberOfVisitors());
        ride.printRideHistory();
    }

    /**
     * Print ride queue details: the total number of visitors and all the visitors.
     *
     * @param ride The ride object
     */
    private void printRideQueueDetails(Ride ride) {
        System.out.println("The number of Visitors: " + ride.getSizeOfVisitorQueue() + "\n");
        System.out.println("All Visitors:");
        ride.printQueue();
    }
}
