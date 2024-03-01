import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[] args) {
        int real[][] = new int[3][3];
        int transpose[][] = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the matrix you want to transpose: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                real[i][j] = input.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = real[j][i]; //Transposing Matrix
            }
        }
        System.out.println("The matrix you entered: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(real[i][j]+" ");
        }
            System.out.println();
    }
        System.out.println("Transposed Matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
}
}
