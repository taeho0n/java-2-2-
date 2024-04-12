public class UpcastingEx {
    public static void main(String[] args) {
      Person p =new Person("이재문");

     Student s=(Student)p;

     System.out.println(s.name);
     s.grade="A";
     System.out.println(s.grade);
    }
    
}
class Person {
    String name;
    String id;

    public Person(String name){
        this.name=name;
    }
}

class Student extends Person{
    String grade;
    String department;

    public Student(String name){
        super(name);
    }
}
