package codeAcademy;

public class calculator_Exercise_4 {
// Basic Calculator Code
    public calculator_Exercise_4(){

    }

    public int add(int a, int b){
       return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide (int a, int b){
        return a / b;
    }

    public int modulo(int a, int b){
        return a % b;
    }

    public static void main(String[] args) {
           calculator_Exercise_4 myCalculator = new calculator_Exercise_4();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
        System.out.println(myCalculator.multiply(3, 13));
        System.out.println(myCalculator.divide(10, 2));
        System.out.println(myCalculator.modulo(12, 3));
    }

}
