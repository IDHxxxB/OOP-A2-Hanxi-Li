public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo a2 = new AssignmentTwo();
        a2.partFourA();
        a2.partFourB();
    }

    public void partThree() {
        Ride ride1 = new Ride("Kansas Twister", new Employee("Hanson", 23, "12345678", 101, 5000), "Height less than 95cm and more than 205cm", 40);
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

    public void partFourA() {
        Ride ride2 = new Ride("Wild West Falls Adventure Ride", new Employee("Quinn", 27, "22345678", 102, 7000), "Height less than 95cm", 30);
        Visitor visitor6 = new Visitor("Billy", 24, "22345676", true, 3);
        Visitor visitor7 = new Visitor("Ford", 28, "22345677", false, 1);
        Visitor visitor8 = new Visitor("Ethan", 26, "22345678", false, 2);
        Visitor visitor9 = new Visitor("Heath", 18, "22345679", true, 2);
        Visitor visitor10 = new Visitor("Riley", 32, "22345681", false, 1);

        ride2.addVisitorToHistory(visitor6);
        ride2.addVisitorToHistory(visitor7);
        ride2.addVisitorToHistory(visitor8);
        ride2.addVisitorToHistory(visitor9);
        ride2.addVisitorToHistory(visitor10);

        ride2.checkVisitorFromHistory(visitor8);
        ride2.numberOfVisitors();
        ride2.printRideHistory();
    }

    public void partFourB() {
        Ride ride3 = new Ride("Hollywood Stunt Driver 2", new Employee("Elon", 21, "32345678", 103, 4500), "No restriction", 80);
        Visitor visitor11 = new Visitor("Nora", 19, "22345682", true, 4);
        Visitor visitor12 = new Visitor("Zoe", 23, "22345683", true, 1);
        Visitor visitor13 = new Visitor("Luna", 29, "22345684", false, 1);
        Visitor visitor14 = new Visitor("Ada", 34, "22345685", false, 1);
        Visitor visitor15 = new Visitor("Marco", 41, "22345686", false, 1);

        ride3.addVisitorToHistory(visitor11);
        ride3.addVisitorToHistory(visitor12);
        ride3.addVisitorToHistory(visitor13);
        ride3.addVisitorToHistory(visitor14);
        ride3.addVisitorToHistory(visitor15);

        ride3.printRideHistory();
        ride3.sortRideHistory();
        ride3.printRideHistory();
    }

    public void partFive() {

    }

    public void partSix() {

    }

    public void partSeven() {

    }
}
