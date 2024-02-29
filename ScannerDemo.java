import java.util.Scanner;


public class ScannerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b,sum;
		System.out.println("Enter any two numbers: ");
		a = input.nextInt();
		b = input.nextInt();
		sum = a+b;
		System.out.println("The sum is " +sum);
		
		

	}

}
