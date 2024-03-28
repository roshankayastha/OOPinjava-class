import java.util.Scanner;
public class ArithmeticOperatorDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int sum;
        int product;
        int sub;
        int div;
        int mod;
        System.out.print("Enter first number: ");
        a = input.nextInt();
        System.out.print("Enter second number: ");
        b = input.nextInt();
        sum = a + b;
        sub = a - b;
        product = a*b;
        div = a/b;
        mod = a%b;
        System.out.println("The sum of your first and second number = " +sum);
        System.out.println("The subtraction of your first and second number = " +sub);
        System.out.println("The product of your first and second number = " +product);
        System.out.println("The division of your first by second number = " +div);
        System.out.println("The modulus of your first and second number = " +mod);
    }
}
