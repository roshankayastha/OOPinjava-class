import java.util.Scanner;
public class MatrixMultiplicationDemo {
    public static void main(String[] args) {
        int a[][] = new int [3][3];
        int b[][] = new int [3][3];
        int product[][] = new int [3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("Please enter your second matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j] = input.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    product[i][j]=product[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Your first matrix is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("Your second matrix is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Result: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }

    }
}
