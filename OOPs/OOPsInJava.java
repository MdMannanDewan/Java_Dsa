public class OOPsInJava {
    public static void main(String[] args) {
        // To create a new object
        Pen p1 = new Pen();// Pen() is constractor function in Pen class
        p1.setColor("blue");
        p1.setTip(2);
        // Creating another object
        Pen p2 = new Pen();
        p2.setColor("red");
        p2.color = "black";
        // System.out.println(p2.color);
        // System.out.println(p1.color);
        // BankAccount b1 = new BankAccount();
        // b1.name = "Mannan";
        // b1.password = "123456"; // we can not access private password property
        // outside class
        // b1.setPassword("12345");
        // System.out.println(b1.name);
        Student s1 = new Student("Mannan", 26, 65.56f);
        // System.out.println(s1.name + " " + s1.age + " " + s1.percentage);
        ConstructorOverloading c1 = new ConstructorOverloading("mannan");
        System.out.println(c1.name);
    }
}

class BankAccount {
    public String name;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
        System.out.println(password);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int math, int phy, int chem) {
        percentage = (math + phy + chem) / 3;
    }

    Student(String name, int age, float percentage) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }
}

class ConstructorOverloading {
    String name;
    int age;

    ConstructorOverloading() {
    }

    ConstructorOverloading(String name) {
        this.name = name;
    }

    ConstructorOverloading(int age) {
        this.age = age;
    }
}