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

    // Queue-related methods
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        visitorQueue.add(visitor);
        System.out.println(visitor.getName() + " has successfully joined the queue for " + rideName + ".");
    }

    @Override
    public void removeVisitorFromQueue() {
        Visitor removedVisitor = visitorQueue.poll();  // Remove the first visitor in the queue
        if (removedVisitor != null) {
            System.out.println(removedVisitor.getName() + " has been removed from the queue for " + rideName + ".");
        } else {
            System.out.println("Queue for " + rideName + " is currently empty. No visitor to remove.");
        }
    }

    @Override
    public void printQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.println("No visitors are currently in the queue for " + rideName + ".");
        } else {
            System.out.println("List of visitors in the queue for " + rideName + ":");
            for (Visitor visitor : visitorQueue) {
                System.out.println("- " + visitor.getName() + " (Age: " + visitor.getAge() + ")" + " (Gender: " + visitor.getGender() + ")");
            }
        }
    }

    @Override
    public void runOneCycle() {
        // Check if an operator is assigned
        if (operator == null) {
            System.out.println("Error: Ride " + rideName + " cannot be run. No operator assigned.");
            return;
        }

        // Check if the queue is empty
        if (visitorQueue.isEmpty()) {
            System.out.println("Error: Ride " + rideName + " cannot be run. Queue is empty.");
            return;
        }

        // Run the ride
        int riders = 0;
        System.out.println("Starting one cycle of " + rideName + "...");
        while (riders < maxRiders && !visitorQueue.isEmpty()) {
            Visitor visitor = visitorQueue.poll();
            if (visitor != null) {
                addVisitorToHistory(visitor);
                System.out.println(visitor.getName() + " is now enjoying the ride " + rideName + ".");
                riders++;
            }
        }

        // Increment the number of cycles
        numOfCycles++;
        System.out.println("Cycle completed! Total cycles run for " + rideName + ": " + numOfCycles);
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " has been added to the history of " + rideName + ".");
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        boolean found = rideHistory.contains(visitor);
        System.out.println(visitor.getName() + " is " + (found ? "" : "not ") + "in the history of " + rideName + ".");
        return found;
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("No visitors have ridden " + rideName + " yet.");
        } else {
            System.out.println("List of visitors in the history of " + rideName + ":");
            for (Visitor visitor : rideHistory) {
                System.out.println("- " + visitor.getName() + " (Age: " + visitor.getAge() + ")");
            }
        }
    }

}
