import java.util.Scanner;
public class ClassAndObjectDemo {
    public static void main(String[] args) {
        System.out.println("Main Method: ");
        ClassAndObjectDemo obj = new ClassAndObjectDemo();
        obj.sum();
    }
         void sum()
         {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
        int sum = a +b;
        System.out.println("The sum of a and b is: " +sum);
    }
}
