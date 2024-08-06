package codingNinja.ClassesAndObjects;

public class ConstructorUse {
    public static void main(String[] args) {
      ConstructorOne c = new ConstructorOne("Rubi", 1);
      ConstructorOne c3 = new ConstructorOne("Vamsi", 2);
      ConstructorOne c4 = new ConstructorOne("Hemanth", 3);
      //c.print();

      ConstructorOne c1 = new ConstructorOne("Vamsi");
      ConstructorOne c5 = new ConstructorOne("Ram");
      ConstructorOne c6 = new ConstructorOne("Hanuman");
      ConstructorOne c7 = new ConstructorOne("Sita");
      //c1.print();

      ConstructorOne c2 = new ConstructorOne();
      //c2.print();


        System.out.println(ConstructorOne.CONVERSION_FACTOR);
        System.out.println(ConstructorOne.numStudents);
        System.out.println(ConstructorOne.onlyNames);

        System.out.println(c.getName()+" "+ c.getRollNumber());
        System.out.println(c3.getName()+" "+c3.getRollNumber());
    }
}
