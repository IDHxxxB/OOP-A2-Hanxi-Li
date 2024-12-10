public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo a2 = new AssignmentTwo();
        a2.partSix();
        a2.partSeven();
    }

    public void partThree() {
        Ride ride1 = new Ride("Kansas Twister", new Employee("Hanson", 23, "12345678", 101, 5000), "Height less than 95cm and more than 205cm", 40, 0);
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
        Ride ride2 = new Ride("Wild West Falls Adventure Ride", new Employee("Quinn", 27, "22345678", 102, 7000), "Height less than 95cm", 30, 0);
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
        Ride ride3 = new Ride("Hollywood Stunt Driver 2", new Employee("Elon", 21, "32345678", 103, 4500), "No restriction", 80, 0);
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
        Ride ride4 = new Ride("Sylvester And Tweety Cages", new Employee("Betty", 29, "42345678", 104, 3000), "No restriction", 8, 0);

        Visitor visitor16 = new Visitor("Louis", 6, "22345687", false, 1);
        Visitor visitor17 = new Visitor("Jesse", 8, "22345688", false, 1);
        Visitor visitor18 = new Visitor("Mike", 10, "22345689", false, 1);
        Visitor visitor19 = new Visitor("Sawyer", 14, "22345690", false, 1);
        Visitor visitor20 = new Visitor("Jane", 40, "22345691", false, 1);
        Visitor visitor21 = new Visitor("Peggy", 38, "22345692", true, 4);
        Visitor visitor22 = new Visitor("Angela", 7, "22345693", true, 3);
        Visitor visitor23 = new Visitor("Klaus", 12, "22345694", false, 1);
        Visitor visitor24 = new Visitor("Nate", 38, "22345695", false, 1);
        Visitor visitor25 = new Visitor("Bonnie", 4, "22345696", false, 1);

        ride4.addVisitorToQueue(visitor16);
        ride4.addVisitorToQueue(visitor17);
        ride4.addVisitorToQueue(visitor18);
        ride4.addVisitorToQueue(visitor19);
        ride4.addVisitorToQueue(visitor20);
        ride4.addVisitorToQueue(visitor21);
        ride4.addVisitorToQueue(visitor22);
        ride4.addVisitorToQueue(visitor23);
        ride4.addVisitorToQueue(visitor24);
        ride4.addVisitorToQueue(visitor25);

        System.out.println("\nBefore running the ride:");
        ride4.printQueue();

        ride4.runOneCycle();

        System.out.println("\nAfter running the ride:");
        ride4.printQueue();

        ride4.printRideHistory();
    }

    public void partSix() {
        Ride ride5 = new Ride("Star Parade", new Employee("Kim", 42, "52345678", 105, 6000), "No restriction", 20, 0);

        ride5.addVisitorToHistory(new Visitor("Fido", 21, "1423451", true, 7));
        ride5.addVisitorToHistory(new Visitor("Bella", 18, "1423452", true, 3));
        ride5.addVisitorToHistory(new Visitor("Charlie", 23, "1423453", false, 1));
        ride5.addVisitorToHistory(new Visitor("Max", 25, "1423454", false, 1));
        ride5.addVisitorToHistory(new Visitor("Lucy", 30, "1423455", false, 2));

        ride5.exportRideHistory("RideHistory.csv");
    }

    public void partSeven() {
        Ride ride = new Ride("Imported Ride", new Employee("Operator", 30, "111", 111, 1000), "No restriction", 20, 0);

        String filename = "RideHistory.csv";
        ride.importRideHistory(filename);

        ride.numberOfVisitors();

        ride.printRideHistory();
    }
}
