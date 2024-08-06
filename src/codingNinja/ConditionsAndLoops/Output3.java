package codingNinja.ConditionsAndLoops;

public class Output3 {
    public static void main(String[] args) {
        double a = 55.5;
        int b = 55;

        a %= 10;
        b %= 10;

        System.out.println(a <= 5 || b > 5);
    }
}
