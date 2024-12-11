// Main class to demonstrate different parts of the Assignment
public class AssignmentTwo {
    // Main method to call various parts of the assignment
    public static void main(String[] args) {
        AssignmentTwo a2 = new AssignmentTwo();
        // Calling different parts of the assignment
        a2.partThree();
        a2.partFourA();
        a2.partFourB();
        a2.partFive();
        a2.partSix();
        a2.partSeven();
    }

    // Part 3 – Queue Interface
    public void partThree() {
        // Create a new ride with a specific employee operator
        Ride ride1 = new Ride("Kansas Twister", new Employee("Hanson", 23, "12345678", 101, 5000), "Height less than 95cm and more than 205cm", 40, 0);
        // Create several visitor objects
        Visitor visitor1 = new Visitor("Alice", 20, "22345671", false, 1);
        Visitor visitor2 = new Visitor("John", 18, "22345672", false, 1);
        Visitor visitor3 = new Visitor("Jack", 24, "22345673", true, 5);
        Visitor visitor4 = new Visitor("Zack", 23, "22345674", true, 3);
        Visitor visitor5 = new Visitor("West", 23, "22345675", false, 1);

        // Add visitors to the ride's queue
        ride1.addVisitorToQueue(visitor1);
        ride1.addVisitorToQueue(visitor2);
        ride1.addVisitorToQueue(visitor3);
        ride1.addVisitorToQueue(visitor4);
        ride1.addVisitorToQueue(visitor5);
        // Remove one visitor from the queue
        ride1.removeVisitorFromQueue(visitor2);
        // Print the current queue of visitors
        ride1.printQueue();
    }

    // Part 4A – Collection class (LinkedList)
    public void partFourA() {
        // Create a new ride with a specific employee operator
        Ride ride2 = new Ride("Wild West Falls Adventure Ride", new Employee("Quinn", 27, "22345678", 102, 7000), "Height less than 95cm", 30, 0);
        // Create several visitor objects
        Visitor visitor6 = new Visitor("Billy", 24, "22345676", true, 3);
        Visitor visitor7 = new Visitor("Ford", 28, "22345677", false, 1);
        Visitor visitor8 = new Visitor("Ethan", 26, "22345678", false, 2);
        Visitor visitor9 = new Visitor("Heath", 18, "22345679", true, 2);
        Visitor visitor10 = new Visitor("Riley", 32, "22345680", false, 1);

        // Add visitors to the ride's history
        ride2.addVisitorToHistory(visitor6);
        ride2.addVisitorToHistory(visitor7);
        ride2.addVisitorToHistory(visitor8);
        ride2.addVisitorToHistory(visitor9);
        ride2.addVisitorToHistory(visitor10);

        // Check if a specific visitor is in the ride history
        ride2.checkVisitorFromHistory(visitor8);
        // Print the number of visitors in the history
        ride2.numberOfVisitors();
        // Print the complete ride history
        ride2.printRideHistory();
    }

    // Part 4B – Sorting the collection
    public void partFourB() {
        // Create a new ride with a specific employee operator
        Ride ride3 = new Ride("Hollywood Stunt Driver 2", new Employee("Elon", 21, "32345678", 103, 4500), "No restriction", 80, 0);
        // Create several visitor objects
        Visitor visitor11 = new Visitor("Nora", 19, "22345681", true, 4);
        Visitor visitor12 = new Visitor("Zoe", 23, "22345682", true, 1);
        Visitor visitor13 = new Visitor("Luna", 29, "22345683", false, 1);
        Visitor visitor14 = new Visitor("Ada", 34, "22345684", false, 1);
        Visitor visitor15 = new Visitor("Marco", 41, "22345685", false, 1);

        // Add visitors to the ride's history
        ride3.addVisitorToHistory(visitor11);
        ride3.addVisitorToHistory(visitor12);
        ride3.addVisitorToHistory(visitor13);
        ride3.addVisitorToHistory(visitor14);
        ride3.addVisitorToHistory(visitor15);

        // Print the ride history before sorting
        ride3.printRideHistory();
        // Sort the ride history
        ride3.sortRideHistory();
        // Print the ride history after sorting
        ride3.printRideHistory();
    }

    // Part 5 – Run a ride cycle
    public void partFive() {
        // Create a new ride with a specific employee operator
        Ride ride4 = new Ride("Sylvester And Tweety Cages", new Employee("Betty", 29, "42345678", 104, 3000), "No restriction", 8, 0);
        // Create several visitor objects
        Visitor visitor16 = new Visitor("Louis", 6, "32345671", false, 1);
        Visitor visitor17 = new Visitor("Jesse", 8, "32345672", false, 1);
        Visitor visitor18 = new Visitor("Mike", 10, "32345673", false, 1);
        Visitor visitor19 = new Visitor("Sawyer", 14, "32345674", false, 1);
        Visitor visitor20 = new Visitor("Jane", 40, "32345675", false, 1);
        Visitor visitor21 = new Visitor("Peggy", 38, "32345676", true, 4);
        Visitor visitor22 = new Visitor("Angela", 7, "32345677", true, 3);
        Visitor visitor23 = new Visitor("Klaus", 12, "32345678", false, 1);
        Visitor visitor24 = new Visitor("Nate", 38, "32345679", false, 1);
        Visitor visitor25 = new Visitor("Bonnie", 4, "32345680", false, 1);

        // Add visitors to the ride's queue
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

        // Print the queue before running the ride
        System.out.println("\nBefore running the ride:");
        ride4.printQueue();
        // Run the ride for one cycle
        ride4.runOneCycle();
        // Print the queue after running the ride
        System.out.println("\nAfter running the ride:");
        ride4.printQueue();
        // Print the ride's history
        ride4.printRideHistory();
    }

    // Part 6 – Writing to a file
    public void partSix() {
        // Create a new ride with a specific employee operator
        Ride ride5 = new Ride("Star Parade", new Employee("Kim", 42, "52345678", 105, 6000), "No restriction", 20, 0);
        // Add visitors to the ride's history
        ride5.addVisitorToHistory(new Visitor("Fido", 21, "1423451", true, 7));
        ride5.addVisitorToHistory(new Visitor("Bella", 18, "1423452", true, 3));
        ride5.addVisitorToHistory(new Visitor("Charlie", 23, "1423453", false, 1));
        ride5.addVisitorToHistory(new Visitor("Max", 25, "1423454", false, 1));
        ride5.addVisitorToHistory(new Visitor("Lucy", 30, "1423455", false, 2));

        // Export the ride history to a CSV file
        ride5.exportRideHistory("RideHistory.csv");
    }

    // Part 7 – Reading from a file
    public void partSeven() {
        // Create a new ride with a specific employee operator
        Ride ride = new Ride("Imported Ride", new Employee("Operator", 30, "111", 111, 1000), "No restriction", 20, 0);

        // Import the ride history from a CSV file
        ride.importRideHistory("RideHistory.csv");
        // Print the number of visitors in the ride history
        ride.numberOfVisitors();
        // Print the ride history
        ride.printRideHistory();
    }
}
