import java.util.LinkedList;
import java.util.Queue;

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
        return rideHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return waitingQueue.size();
    }

    @Override
    public void printRideHistory() {
        System.out.println("Ride history:");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor.getName());
        }
    }
}
