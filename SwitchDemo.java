import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        int a=0;
    Scanner input = new Scanner(System.in);
        System.out.println("Menu:\n1.Momo\t\t2.Noodles\t\t3.Pasta");
        System.out.print("Enter the corresponding number to place your order: ");
        a = input.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Your order for Momo has been placed.");
                break;
            case 2:
                System.out.println("Your order for Noodles has been placed.");
                break;
            case 3:
                System.out.println("Your order for Pasta has been placed.");
                break;
            default:
                System.out.println("Please select a number included in the list!!");
                break;
        }
    }
}
