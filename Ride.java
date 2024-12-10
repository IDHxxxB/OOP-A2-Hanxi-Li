import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.io.*;

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
    private int maxRider;
    private int numOfCycles;

    private Queue<Visitor> waitingQueue = new LinkedList<>();
    private java.util.ArrayList<Visitor> rideHistory = new java.util.ArrayList<>();

    public Ride() {

    }

    public Ride(String rideName, Employee operator, String heightRestriction, int maxRider, int numOfCycles) {
        if (maxRider < 1) {
            throw new IllegalArgumentException("maxRider must be at least 1.");
        }
        this.rideName = rideName;
        this.operator = operator;
        this.heightRestriction = heightRestriction;
        this.maxRider = maxRider;
        this.numOfCycles = numOfCycles;
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

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    public void setNumOfCycles(int numOfCycles) {
        this.numOfCycles = numOfCycles;
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
        if (operator == null) {
            System.out.println("There is no ride operator.");
            return;
        }

        if (waitingQueue.isEmpty()) {
            System.out.println("The queue is empty.");
            return;
        }

        int riders = 0;
        while (riders < maxRider && !waitingQueue.isEmpty()) {
            Visitor visitor = waitingQueue.poll();
            addVisitorToHistory(visitor);
            riders++;
        }

        numOfCycles++;
        System.out.println(rideName + " is running one cycle.");
        System.out.println(numOfCycles + " cycles were found.");
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

    public void exportRideHistory(String filename) {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(filename));

            for (Visitor visitor : rideHistory) {
                String visitorDetails = visitor.getName() + "," + visitor.getAge() + ","
                        + visitor.getPhoneNum() + "," + visitor.getIsMembership() + ","
                        + visitor.getVisitCount();
                writer.write(visitorDetails);
                writer.newLine();
            }
            System.out.println("Successful export.");
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing file: " + e.getMessage());
            }
        }
    }

    public void importRideHistory(String filename) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filename));
            String line;

            System.out.println("Reading file: " + filename);
            System.out.println("Visitor details from file:");
            System.out.println("Name,Age,PhoneNum,IsMembership,VisitCount");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);

                String[] visitorData = line.split(",");
                if (visitorData.length == 5) {
                    String name = visitorData[0];
                    int age = Integer.parseInt(visitorData[1]);
                    String phoneNum = visitorData[2];
                    boolean isMembership = Boolean.parseBoolean(visitorData[3]);
                    int visitCount = Integer.parseInt(visitorData[4]);

                    Visitor visitor = new Visitor(name, age, phoneNum, isMembership, visitCount);
                    rideHistory.add(visitor);
                } else {
                    System.err.println("Error: Invalid line format in file: " + line);
                }
            }
            System.out.println("Successfully imported ride history.");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing number: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing file: " + e.getMessage());
            }
        }
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