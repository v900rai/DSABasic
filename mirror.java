package ArraysProgram;

import java.util.Scanner;

public class mirror {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data  ");
        int matrix[][]= new int[2][2];
        for (int i = 0; i <=1 ; i++) {
            for (int j = 0; j <=1 ; j++) {
                matrix[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("Enter the matrix  ");
        for (int i = 0; i <=1 ; i++) {
            for (int j = 0; j <=1 ; j++) {
                System.out.println( matrix[i][j]);
            }

        }
        System.out.println("Enter the mirror matrix ");
        for (int i = 0; i <=1 ; i++) {
            for (int j = 1; j>=1; j--) {
                System.out.println(matrix[i][j]);
            }

        }

    }
}
