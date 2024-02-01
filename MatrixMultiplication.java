package Matrix;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first matrix ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int one[][]=new int[r1][c1];
        for(int i=0; i<one.length; i++){
            for(int j=0; j<one[0].length; j++){
                one[r1][c1]= sc.nextInt();
            }
        }
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int two[][]=new int[r1][c1];
        for(int i=0; i<two.length; i++){
            for(int j=0; j<two[0].length; j++){
                one[r2][c2]= sc.nextInt();
            }
        }
        if(c1!=r2){
            System.out.println("Invailed Input");
        }
        int pro[][]=new int [r1][c2];
        for(int i=0; i<pro.length; i++){
            for(int j=0; i<pro[0].length; j++){
                for(int k=0; k<c1; k++){
                    pro[i][j]+=one[i][k] * two[k][j];
                }
            }
        }
        for(int i=0; i<pro.length; i++){
            for(int j=0; i<pro[0].length; j++){
                System.out.print(pro[i][j]+" ");
            }
            System.out.println();
        }

    }
}
