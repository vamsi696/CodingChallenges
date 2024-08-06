package codingNinja.flowchart;

import java.util.Scanner;

public class LargestNnumber {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int i = 1;
        int l = -12;
       while (i<=n){
           int num = i;
           if (num > l){
               l = num;
           }
           i++;
       }
        System.out.println(l);
    }
}
