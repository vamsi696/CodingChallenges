package com.vamsi;

public class elseifUsingLogicalor {
    public static void main(String[] args) {
//        Else if Using the Logical Or Operator

       String gender = "MALe";

       if (gender.equalsIgnoreCase("FEMALE") || gender.equalsIgnoreCase("MALE")){
           System.out.println("Valid Gender");
       } else{
           System.out.println("Invalid Gender");
       }
    }
}
