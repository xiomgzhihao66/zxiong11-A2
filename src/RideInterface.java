import java.util.List;

/**
 * Ride Interface
 * <p>
 * This interface defines the basic operations for managing visitors and the ride cycles
 * in an amusement park ride system.
 * </p>
 *
 * Author: zxiong11
 */
public interface RideInterface {

    /**
     * Adds a visitor to the queue for the ride.
     *
     * @param visitor The visitor to be added to the queue
     */
    void addVisitorToQueue(Visitor visitor);

    /**
     * Removes a visitor from the front of the queue.
     */
    void removeVisitorFromQueue();

    /**
     * Prints the details of all visitors currently in the queue.
     */
    void printQueue();

    /**
     * Runs one cycle of the ride, allowing a number of visitors to experience it.
     */
    void runOneCycle();

    /**
     * Adds a visitor to the ride history.
     *
     * @param visitor The visitor to be added to the ride history
     */
    void addVisitorToHistory(Visitor visitor);

    /**
     * Checks if a visitor is in the ride history.
     *
     * @param visitor The visitor to be checked
     * @return true if the visitor has taken the ride before, otherwise false
     */
    boolean checkVisitorFromHistory(Visitor visitor);

    /**
     * Returns the total number of visitors who have taken the ride.
     *
     * @return The number of visitors in the ride history
     */
    int numberOfVisitors();

    /**
     * Prints the details of all visitors who have taken the ride.
     */
    void printRideHistory();
}
