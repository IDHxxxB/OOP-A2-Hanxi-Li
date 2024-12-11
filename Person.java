// Abstract class Person
abstract class Person {
    // Instance variables name, age, and phoneNum
    private String name;
    private int age;
    private String phoneNum;

    // Constructor to initialize a Person object with name, age, and phone number
    public Person(String name, int age, String phoneNum) {
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum;
    }

    // Getter method to retrieve the name
    public String getName() {
        return name;
    }

    // Setter method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to retrieve the age
    public int getAge() {
        return age;
    }

    // Setter method to set the age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method to retrieve the phoneNum
    public String getPhoneNum() {
        return phoneNum;
    }

    // Setter method to set the phoneNum
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
