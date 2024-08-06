package codingNinja.ConditionsAndLoops;

public class Output1 {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 6;

         if((var2 = 1) == var1){
//             Here in the condition we have the changed the var2 = 1 so the variable has changed from 6 to 1;
//             so the condition doesn't get satisfied and moves to else condition.
            System.out.println(var2);
        } else {
            System.out.println(var2 + 1);
        }
    }
}
