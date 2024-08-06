package com.vamsi;

public class Even {
    public static void main(String[] args) {
        int n = 88;
        int k = 10;
        for (int i = 1; i<=n; i++){
            int L = i;
            if (L > k){
                k = L;
            }

        }
        System.out.println(k);
    }
}
