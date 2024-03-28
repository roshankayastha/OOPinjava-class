class Students{
    int id;
    String name;
    int age;
    Students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Id: "+id+"\t"+"Name: "+name+"\t"+"Age: "+age);
    }
}
public class ThisKeywordDemo {
    public static void main(String[] args) {
        Students student  = new Students(101,"Ram",20);
        Students student1 = new Students(102,"Sita",15);
        Students student2 = new Students(1,"Roshan",20);
        student.display();
        student1.display();
        student2.display();
    }
}
