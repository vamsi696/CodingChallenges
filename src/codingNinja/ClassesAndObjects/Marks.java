package codingNinja.ClassesAndObjects;

public class Marks {
    private int firstStudent;
    private int secondStudent;

    private String studentName;

    public int getFirstStudent(){
        return this.firstStudent;
    }

    public void setFirstStudent(int firstStudent){
        if(firstStudent <= 0){
            return;
        }
        this.firstStudent = firstStudent;
    }
    public int getSecondStudent(){
        return this.secondStudent;
    }

    public void setSecondStudent(int secondStudent){
        if(secondStudent <= 35){
            return;
        }
       this.secondStudent = secondStudent;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public void setStudentName(String studentName){
        if (studentName == ""){
            return;
        }
        this.studentName = studentName;
    }
}
