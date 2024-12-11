// Visitor class that extends the abstract Person class
class Visitor extends Person{
    // Instance variables IsMembership and visitCount
    private boolean isMembership;
    public int visitCount;

    // Constructor to initialize a Visitor object with name, age, phoneNum, IsMembership, and visitCount
    public Visitor(String name, int age, String phoneNum, boolean isMembership, int visitCount) {
        // Call the constructor of the parent class
        super(name, age, phoneNum);
        // Initialize visitor specific attributes
        this.isMembership = isMembership;
        this.visitCount = visitCount;
    }

    // Getter method to retrieve the IsMembership
    public boolean getIsMembership() {
        return isMembership;
    }

    // Setter method to set the IsMembership
    public void setIsMembership(boolean isMembership) {
        this.isMembership = isMembership;
    }

    // Getter method to retrieve the visitCount
    public int getVisitCount() {
        return visitCount;
    }

    // Setter method to set the visitCount
    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }
}
