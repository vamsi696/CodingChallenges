package codeAcademy;

public class Magic_Exercise_3 {

    public static void main(String[] args) {
//       Original Number
        int myNumber = 6;

        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;

        System.out.println(stepSix);

    }


}
