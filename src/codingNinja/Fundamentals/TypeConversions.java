package codingNinja.Fundamentals;

public class TypeConversions {
    public static void main(String[] args) {
//        Explict conversion
        int i = 14;
        short s = (short) i;
        System.out.println(s);

        long l = 2123;
        int y = (int) l;
        System.out.println(y);

        float f = 1.234f;
        int z = (int) f;
        System.out.println(f);

//        Implicit Conversions
        short a = 124;
        int x = a;
        System.out.println(x);

    }
}
