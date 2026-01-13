class Student {
    int rollNo;
    String name;
    static String collegeName = "ABC College";

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + collegeName);
    }

    static void changeCollege() {
        collegeName = "XYZ University";
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Amit");

        Student.changeCollege();

        s1.display();
        s2.display();
    }
}