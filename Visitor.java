class Visitor extends Person{
    private boolean isMembership;
    public int visitCount;

    public Visitor() {

    }

    public Visitor(String name, int age, String phoneNum, boolean isMembership, int visitCount) {
        super(name, age, phoneNum);
        this.isMembership = isMembership;
        this.visitCount = visitCount;
    }

    public boolean getIsMembership() {
        return isMembership;
    }

    public void setIsMembership(boolean isMembership) {
        this.isMembership = isMembership;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }
}
