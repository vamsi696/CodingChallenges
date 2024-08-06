package codingNinja.flowchart;

import java.util.Scanner;

public class PrintAllEvenNumbers {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int i = 1;
        while(i <= n){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
