public class AssignmentTwo {
    public static void main(String[] args) {
        Ride ride1 = new Ride("Kansas Twister", new Employee("Hanson", 23, "12345678", 101, 7000), "Kansas Twister", 40);
        Visitor visitor1 = new Visitor("Alice", 20, "22345671", false, 1);
        Visitor visitor2 = new Visitor("John", 18, "22345672", false, 1);
        Visitor visitor3 = new Visitor("Jack", 24, "22345673", true, 5);
        Visitor visitor4 = new Visitor("Zack", 23, "22345674", true, 3);
        Visitor visitor5 = new Visitor("West", 23, "22345675", false, 1);

        ride1.addVisitorToQueue(visitor1);
        ride1.addVisitorToQueue(visitor2);
        ride1.addVisitorToQueue(visitor3);
        ride1.addVisitorToQueue(visitor4);
        ride1.addVisitorToQueue(visitor5);

        ride1.removeVisitorFromQueue(visitor2);

        ride1.printQueue();
    }

    public void partThree() {

    }

    public void partFourA() {

    }

    public void partFourB() {

    }

    public void partFive() {

    }

    public void partSix() {

    }

    public void partSeven() {

    }
}
