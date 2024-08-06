package codingNinja.Strings;

public class Output2 {
    public static void main(String[] args) {
//        String a = "coding", b = "ninjas";
//
//        if (a.contains("ing")){
//            a += b;
//        } else {
//            b += "ing";
//        }
//        System.out.println(b+a);

        String str = "coding";
        for(int i =2; i<5; i++){
            System.out.println(str.substring(i-2, i+1));
        }
    }
}
