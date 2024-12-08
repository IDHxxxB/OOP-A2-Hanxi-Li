import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

interface RideInterface {
    void addVisitorToQueue(Visitor visitor);
    void removeVisitorFromQueue(Visitor visitor);
    void printQueue();
    void runOneCycle();
    void addVisitorToHistory(Visitor visitor);
    boolean checkVisitorFromHistory(Visitor visitor);
    int numberOfVisitors();
    void printRideHistory();
}

class Ride implements RideInterface {
    private String rideName;
    private Employee operator;
    private String heightRestriction;
    private int capacity;

    private Queue<Visitor> waitingQueue = new LinkedList<>();
    private java.util.ArrayList<Visitor> rideHistory = new java.util.ArrayList<>();

    public Ride() {

    }

    public Ride(String rideName, Employee operator, String heightRestriction, int capacity) {
        this.rideName = rideName;
        this.operator = operator;
        this.heightRestriction = heightRestriction;
        this.capacity = capacity;
    }

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public String getHeightRestriction() {
        return heightRestriction;
    }

    public void setHeightRestriction(String heightRestriction) {
        this.heightRestriction = heightRestriction;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor != null) {
            waitingQueue.add(visitor);
            System.out.println(visitor.getName() + " added to the waiting queue.");
        } else {
            System.out.println("Unable to add.");
        }
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (waitingQueue.remove(visitor)) {
            System.out.println(visitor.getName() + " removed from the waiting queue.");
        } else {
            System.out.println("Unable to remove.");
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Visitors in the waiting queue:");
        for (Visitor visitor : waitingQueue) {
            System.out.println(visitor.getName());
        }
    }

    @Override
    public void runOneCycle() {
        System.out.println("The ride" + rideName + " is running one cycle.");
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if (visitor != null) {
            rideHistory.add(visitor);
            System.out.println(visitor.getName() + " added to the ride history.");
        } else {
            System.out.println("Unable to add.");
        }
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        boolean found = rideHistory.contains(visitor);
        if (found) {
            System.out.println(visitor.getName() + " found in the ride history.");
        } else {
            System.out.println("Unable to find.");
        }
        return found;
    }

    @Override
    public int numberOfVisitors() {
        int size = rideHistory.size();
        if (size > 0) {
            System.out.println("Number of visitors in the ride history: " + size);
        } else {
            System.out.println("No visitors in the ride history.");
        }
        return size;
    }

    @Override
    public void printRideHistory() {
        Iterator<Visitor> iterator = rideHistory.iterator();
        System.out.println("Ride history:");
        while (iterator.hasNext()) {
            Visitor visitor = iterator.next();
            System.out.println(visitor.getName());
        }
    }

    public void sortRideHistory() {
        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("Successful sorting ride history.");
    }
}

class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        int nameCompare = v1.getName().compareTo(v2.getName());
        if (nameCompare != 0) {
            return nameCompare;
        }
        return Integer.compare(v1.getAge(), v2.getAge());
    }
}