package codeAcademy;

public class Droid {

    //  Instance variable
    String name;
    int batterylevel;

//    Constructor method
    public Droid(String droidName) {
        name = droidName;
        batterylevel = 100;
    }

// Methods
    public void performingTask(String task){
        System.out.println(name + " is performing task " + task);
        batterylevel = batterylevel - 10;
    }
    public void displayBatterylevel(){

    }

    public int energyReport(){
        System.out.println("My Battery level is: " + batterylevel);
        return 0;
    }

    public static void energyTransfer(Droid a, Droid b){
     int c = a.batterylevel;
     int d = b.batterylevel;
     a.batterylevel = d;
     b.batterylevel = c;
    }

    public String toString(){
       return "Hello, I'm the droid: " + name;
    }

//    Main Method
public static void main(String[] args) {
        Droid codey = new Droid("Codey");
         System.out.println(codey);
    codey.energyReport();
         codey.performingTask("Fighting");
    codey.energyReport();
         codey.performingTask("Dancing");
    codey.energyReport();
         codey.performingTask("Running");
    codey.energyReport();
         codey.performingTask("Singing");
    codey.energyReport();
    int codyBattlevel = codey.energyReport();

    Droid d1 = new Droid("Zara");
    System.out.println(d1);
    d1.energyReport();
    d1.performingTask("Swimming");
    d1.energyReport();
    int d1Battlevel = d1.energyReport();

    System.out.println("result before running special method!");
    System.out.println(codey.name + " batterylevel is: " + codey.batterylevel);
    System.out.println(d1.name + " batterylevel is: " + d1.batterylevel);

    System.out.println();
    energyTransfer(codey, d1);

    System.out.println("result after running special method!");
    System.out.println(codey.name + " batterylevel is: " + codey.batterylevel);
    System.out.println(d1.name + " batterylevel is: " + d1.batterylevel);

}
}
