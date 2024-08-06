package codingNinja.ClassesAndObjects;

class ConstructorOne {
    private  String name;
    private int rollNumber;
    final static double CONVERSION_FACTOR = 0.95;
    static int numStudents;
    static int onlyNames;
    public ConstructorOne(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
        numStudents++;
    }
    public ConstructorOne(String name){
        this.name = name;
        onlyNames++;
    }
    public ConstructorOne(){
        name = "Hemanth";
        rollNumber = 12;
    }

    public void print(){
        //Sysdm.out.println(name +" "+ rollNumber);
    }

    public String getName(){

        return this.name;
    }

    public void setName(String name){
        if (name == ""){
            return;
        }
        this.name = name;
    }

    public int getRollNumber(){
        return this.rollNumber;
    }

    public void setRollNumber(int rollNumber){
        if (rollNumber <= 0){
            return;
        }
        this.rollNumber = rollNumber;
    }
}
