package Unit4Day13.Question2;

public class Student {

    private int roll;
    private String name;
    private int marks;

    // zero arguments constructor
    public Student() {
        super();
    }

    // arguments constructor
    public Student(int roll, String name, int marks) {
        super();
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    // getter setter methods
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
    }

}

// Create a class of students with attributes RollNo, Name, marks (maximum marks
// 500 )
// In the main runner class make the list of students add student to it
// Using java 8 functionality sort them according to their RollNo. and filter
// out the students
// getting marks below 250 out of 500. And display them.
