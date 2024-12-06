public class Employee extends Person {
    private int employeeID;
    private int salary;

    public Employee() {

    }

    public Employee(String name, int age, String phoneNum, int employeeID, int salary) {
        super(name, age, phoneNum);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
