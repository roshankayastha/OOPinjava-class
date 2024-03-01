import java.util.Scanner;
public class DiagonalMatrixSum {
    public static void main(String[] args) {
        int matrix[][]= new int[3][3];
        int sum=0;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the elements of your matrix");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                matrix[i][j] = input.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (i==j){ //Condition to check for diagonals in the matrix
                    sum = sum + matrix[i][j];
                }
            }
        }
        System.out.println("The matrix you entered: ");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of diagonals of the matrix= "+sum);
    }
    }

