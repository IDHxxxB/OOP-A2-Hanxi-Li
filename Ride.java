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

abstract class Ride implements RideInterface {
    private String rideName;
    private Employee operator;
    private int heightRestriction;
    private int capacity;

    private java.util.ArrayList<Visitor> waitingQueue = new java.util.ArrayList<>();
    private java.util.ArrayList<Visitor> rideHistory = new java.util.ArrayList<>();

    public Ride() {

    }

    public Ride(String rideName, Employee operator, int minAge, int capacity) {
        this.rideName = rideName;
        this.operator = operator;
        this.heightRestriction = minAge;
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

    public int getHeightRestriction() {
        return heightRestriction;
    }

    public void setHeightRestriction(int heightRestriction) {
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
            System.out.println(visitor.getName() + " is not added to the waiting queue.");
        }
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (waitingQueue.remove(visitor)) {
            System.out.println(visitor.getName() + " removed from the waiting queue.");
        } else {
            System.out.println(visitor.getName() + " was not in the waiting queue.");
        }
    }

    @Override
    public void printQueue() {
        System.out.println("The visitors in the waiting queue are:");
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
            System.out.println(visitor.getName() + " is not added to the ride history.");
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
