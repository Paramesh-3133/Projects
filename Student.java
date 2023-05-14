import java.util.Arrays;

public class Student {
    long rollNo;
    String name;
    String address;
    String subject;
    int marks[]=new int[6];

    public Student(long rollNo, String name, String address, String subject, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.subject = subject;
        this.marks = marks;
    }

    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "RollNo=" + rollNo +
                ", " +
                "Name=" + name +
                ", Address=" + address +
                ", Subject=" + subject +
                ", Marks=" + Arrays.toString(marks) ;
    }
}
