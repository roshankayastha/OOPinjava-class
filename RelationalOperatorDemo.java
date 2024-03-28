import java.util.Scanner;
public class RelationalOperatorDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        boolean k;
        System.out.print("Enter the value of a: ");
        a = input.nextInt();
        System.out.print("Enter the value of b: ");
        b = input.nextInt();
        k = a<b;
        System.out.println("a<b is "+k);
        k = a>b;
        System.out.println("a>b is "+k);
        k = a<=b;
        System.out.println("a<=b is "+k);
        k = a>=b;
        System.out.println("a>=b is "+k);
        k = a==b;
        System.out.println("a==b is "+k);
    }
}
