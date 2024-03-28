public class NoArgumentConstructor {
    NoArgumentConstructor(){
        System.out.println("Constructor of class A is called.");
    }
    void display(){
        System.out.println("No Argument constructor.");
    }

    public static void main(String[] args) {
        NoArgumentConstructor obj = new NoArgumentConstructor();
        obj.display();
    }
}
