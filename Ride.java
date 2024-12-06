public class Ride {
    private String rideName;
    private Employee operator;
    private int heightRestriction;
    private int capacity;

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
}
