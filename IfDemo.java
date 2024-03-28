import java.util.Scanner;
public class IfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0,b=0;
        System.out.print("Enter your age: ");
        a = input.nextInt();
        if (a>=18){
            System.out.print("You are eligible to drive, enter a number from 1 to 5: ");
            b = input.nextInt();
            if(b==3){
            System.out.println("Congratulations you won a gift!");
        }
            else{
                System.out.println("Better luck next time!");
            }
        }
        else if (a<18) {
            System.out.println("You are not eligible to drive.");
        }
    }
}
