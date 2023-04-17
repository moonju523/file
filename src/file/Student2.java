package file;

public class Student2 {
    static int numStudentRegistered = 0;
}

// In another class or method:
Student2 std1 = new Student2();
Student2 std2 = new Student2();
Student2.numStudentRegistered = 2; // This line should work fine

//답 2 2 