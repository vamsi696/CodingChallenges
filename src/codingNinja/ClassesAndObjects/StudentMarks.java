package codingNinja.ClassesAndObjects;

public class StudentMarks {
    public static void main(String[] args) {
        Marks m = new Marks();
        Marks m1 = new Marks();

        m.getFirstStudent();
        m.setFirstStudent(100);

        m.getSecondStudent();
        m.setSecondStudent(92);

        m.getStudentName();
        m.setStudentName("Rabiya");

        m1.getStudentName();
        m1.setStudentName("Hemanth");

        System.out.println(m.getStudentName()+" "+m.getFirstStudent());
        System.out.println(m1.getStudentName()+" "+m.getSecondStudent());
    }
}
