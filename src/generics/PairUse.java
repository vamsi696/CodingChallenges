package generics;

public class PairUse {
    public static void main(String[] args) {
        Pair<String, Integer> pInner = new Pair<>("Generics", 20);
        Pair<Pair<String, Integer>,String> P = new Pair<>();
        P.setFirst(pInner);
        System.out.println(P.getFirst());
        System.out.println(P.getFirst().getFirst());
        System.out.println(P.getFirst().getSecond());

        P.setSecond("Java is core");
        System.out.println(P.getSecond());
    }
}
