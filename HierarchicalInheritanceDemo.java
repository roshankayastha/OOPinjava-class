class SuperClass{
    void input(){
        System.out.println("Your Name:");
    }
    void input1(){
        System.out.println("Surname:");
    }
}
class SubClass1 extends SuperClass{
    void show(){
        System.out.println("My name is Roshan.");
    }
    void show1(){
        System.out.println("xyz");
    }
}
class SubClass2 extends SuperClass{
    void display(){
        System.out.println("My name is Ramesh.");
    }
    void display1(){
        System.out.println("xyz");
    }
}
class SubClass3 extends SuperClass{
    void display(){
        System.out.println("My name is Rajesh.");
    }
    void display1(){
        System.out.println("xyz");
    }
}
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        SubClass1 obj1 = new SubClass1();
        SubClass2 obj2 = new SubClass2();
        SubClass3 obj3 = new SubClass3();
        obj1.input();
        obj1.show();
        obj1.input1();
        obj1.show1();
        obj2.input();
        obj2.display();
        obj2.input1();
        obj2.display1();
        obj3.input();
        obj3.display();
        obj3.input1();
        obj3.display1();
    }
}
