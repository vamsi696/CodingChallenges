package codingNinja.ClassesAndObjects;

public class StudentUse {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1);
        //s1 and s2 are references of the object.
        //s1.name = "Hemanth";
        //s1.rollNumber = 12;
        s1.setName("");
        s1.setRollNumber(1);
        System.out.println(s1.getName() +" " + s1.getRollNumber());

        //s2.name = "Rubi";
        //s2.rollNumber = 10;
        s2.setName("Rubi");
        s2.setRollNumber(1);
        System.out.println(s2.getName()+" " + s2.getRollNumber());
        System.out.println(s1.getName());
       // s1.Print();
        //s2.Print();
    }
}
