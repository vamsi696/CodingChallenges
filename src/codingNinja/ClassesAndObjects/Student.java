package codingNinja.ClassesAndObjects;

class Student {
    private String name;
    private int rollNumber;
    final static double CONVERSION_FACTOR = 0.95;
    static int numStudents;

    public String getName(){
        return name;
    }

    public void setName(String fullName){
        if(fullName == ""){
            return;
        }
        name = fullName;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public void setRollNumber(int num){
        if(num <= 0){
            return;
        }
        rollNumber = num;
    }
    void Print(){
        System.out.println(name+" "+rollNumber);
    }
}
