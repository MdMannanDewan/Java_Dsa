import java.util.*;

public class ComplexOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input for first complex number
        System.out.println("Enter the real part of first number: ");
        int real1 = sc.nextInt();
        System.out.println("Enter the imaginary part of first number: ");
        int imaginary1 = sc.nextInt();
        // create first complex number
        Complex complexNumber1 = new Complex(real1, imaginary1);

        // input for second complex number
        System.out.println("Enter the real part of second number: ");
        int real2 = sc.nextInt();
        System.out.println("Enter the imaginary part of second number: ");
        int imaginary2 = sc.nextInt();
        // create second complex number
        Complex complexNumber2 = new Complex(real2, imaginary2);

        // execute sum operation
        Complex sum = complexNumber1.sum(complexNumber2);
        sum.print();

        // execute difference operation
        Complex difference = complexNumber1.difference(complexNumber2);
        difference.print();

        // execute multiplication operation
        Complex multiple = complexNumber1.multiplication(complexNumber2);
        multiple.print();
    }

}

class Complex {
    // real and imaginary fields
    int real, imaginary;

    // constructor for complex
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // method for sum --> object can be a return type in java
    Complex sum(Complex newComplex) {
        return new Complex(this.real + newComplex.real, this.imaginary + newComplex.imaginary);
    }

    // method for difference
    Complex difference(Complex newComplex) {
        return new Complex(this.real - newComplex.real, this.imaginary - newComplex.imaginary);
    }

    // method for multiplication
    Complex multiplication(Complex newComplex) {
        int newReal = this.real * newComplex.real - this.imaginary * newComplex.imaginary;
        int newImaginary = this.real * newComplex.imaginary + this.imaginary * newComplex.real;
        return new Complex(newReal, newImaginary);
    }

    // Print imaginary number
    void print() {
        if (this.imaginary > 0)

        {
            System.out.println(this.real + "+" + this.imaginary + "i");
        } else if (this.imaginary == 0) {
            System.out.println(this.real);
        } else {
            System.out.println(this.real + "-" + (-this.imaginary) + "i");
        }
    }
}
