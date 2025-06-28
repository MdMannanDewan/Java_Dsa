import java.util.Arrays;

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("mannan", 27, new int[] { 23, 123, 132, 34 });
        System.out.println(s1.name);
        Student s2 = new Student(s1);
        System.out.println(s2.age);
        s1.name = "Rakib";
        System.out.println(s1.name + " " + s2.name + " " + Arrays.toString(s2.marks));
        s2.marks[0] = 32;
        System.out.println(s1.name + " " + s2.name + " " + Arrays.toString(s2.marks));
        System.out.println(s1.name + " " + s2.name + " " + Arrays.toString(s1.marks));
    }
}

class Student {
    String name;
    int age;
    int marks[];

    Student(String name, int age, int marks[]) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    };
    // copy constructor -- Shallow copy
    // Student(Student s) {
    // this.name = s.name;
    // this.age = s.age;
    // this.marks = s.marks;
    // }

    // Deep copy
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.marks = new int[s.marks.length];
        for (int i = 0; i < s.marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }
}
