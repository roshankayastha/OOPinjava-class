public class PassByValueDemo {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before calling the method: "+a);
        PassByValueDemo obj = new PassByValueDemo();
        obj.changeValue(a);
        System.out.println("After calling the method: "+a);
    }
    void changeValue(int b){
        b=20;
        System.out.println("Inside the method: "+b);
    }
}
