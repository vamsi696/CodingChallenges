package com.vamsi;

public class    switchstatements {
    public static void main(String[] args) {
//        Switch statements
//        In Switch statments if we are using the char we need to specify the letters in case/ if int need to speicfy the numbers, for
//        String we need to mention the words in case. We can't change int to char/Strings in cases.
        char grade = 'A';
        switch (grade){
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
        }
//        This is we can store the output in another variable this works only after java 14 or higher version
//        String result = switch (grade){
//            case 'A' -> "RankA";
//            case 'B', 'C' -> "RankB";
//            default -> "Fail";
//        };
//        System.out.println(result);

        int day = 2;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("sunday");
        }

        String name = "sunday";
        switch (name.toUpperCase()){
            case "MONDAY":
                System.out.println("WeekDay");
                break;
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                System.out.println("Weekday");
                break;
            case "SATURDAY":
            case "SUNDAY":
                System.out.println("weekend");
            default:
                System.out.println("Invalid day");
        }
    }
}
