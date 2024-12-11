// Employee class that extends the abstract Person class
class Employee extends Person {
    // Instance variables employeeID and salary
    private int employeeID;
    private int salary;

    // Constructor to initialize an Employee object with name, age, phone number, employeeID, and salary
    public Employee(String name, int age, String phoneNum, int employeeID, int salary) {
        // Call the constructor of the parent class
        super(name, age, phoneNum);
        // Initialize employee specific attributes
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Getter method to retrieve the employeeID
    public int getEmployeeID() {
        return employeeID;
    }

    // Setter method to set the employeeID
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    // Getter method to retrieve the salary
    public int getSalary() {
        return salary;
    }

    // Setter method to set the salary
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
