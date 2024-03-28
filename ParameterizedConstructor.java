class Student{
    int id;
    String name;
    int age;
   Student(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }
//    Student(int id, String name, int age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }
    void display(){
        System.out.println("Id: "+id+"\t"+"Name: "+name+"\t"+"Age: "+age);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student student  = new Student(101,"Ananya",20);
        Student student1 = new Student(102,"Abhiraj",15);
        Student student2 = new Student(1, "Roshan", 20);
        student.display();
        student1.display();
        student2.display();
    }
}
