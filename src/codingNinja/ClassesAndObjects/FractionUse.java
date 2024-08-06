package codingNinja.ClassesAndObjects;

public class FractionUse {
    public static void main(String[] args) {
//        f1 is for simplyfing and adding the increment value by 1 and printing it
        Fraction f1 = new Fraction(4, 6);
        f1.print();
        f1.increment();
        f1.print();
//        f2 is for adding multiplying and subrarct the fraction and adding the value to f1
        Fraction f2 = new Fraction(4, 8);
        f1.add(f2);
        f1.print();
        f1.multiply(f2);
        f1.print();
        f1.subtract(f2);
        f1.print();
//         Creating a new object and adding the f1 and f2
        Fraction f3 = Fraction.add(f1, f2);
        f3.print();
    }
}
