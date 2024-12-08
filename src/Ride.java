import java.io.*;
import java.util.*;

/**
 * Ride Class
 * <p>
 * This class represents a ride in an amusement park with functionality to manage visitor queues,
 * ride cycles, ride history, and import/export of ride history.
 * </p>
 *
 * Author: zxiong11
 */
public class Ride implements RideInterface {
    private String rideName;
    private int maxRiders;
    private Employee operator;
    private Queue<Visitor> visitorQueue = new LinkedList<>();  // Queue for managing visitors
    private List<Visitor> rideHistory = new ArrayList<>();     // List for ride history
    private int numOfCycles = 0;                               // Tracks the number of cycles run

    // Default constructor
    public Ride() {
    }

    /**
     * Parameterized constructor for Ride class.
     *
     * @param rideName Name of the ride
     * @param maxRiders Maximum number of riders per cycle
     * @param operator The employee operating the ride
     */
    public Ride(String rideName, int maxRiders, Employee operator) {
        this.rideName = rideName;
        this.maxRiders = maxRiders;
        this.operator = operator;
    }

    // Getters and setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getMaxRiders() {
        return maxRiders;
    }

    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    public int getSizeOfVisitorQueue() {
        return visitorQueue.size();
    }


}
