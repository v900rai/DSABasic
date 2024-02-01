package Matrix;

public class addddmatrix {
    public static void main(String[] args) {

        //Initialize matrix a
        int a[][] = {
                {4, 5, 6},
                {3, 4, 1},
                {1, 2, 3}
        };

        //Initialize matrix b
        int b[][] = {
                {2, 0, 3},
                {2, 3, 1},
                {1, 1, 1}
        };
        int rows=a.length;
        int col=b[0].length;
        int diff[][]=new int [rows][col];
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                diff[i][j]=a[i][j]+b[i][j];
            }

        }
        //    System.out.println("Subtraction of two matrices: ");
        System.out.println("Subtraction of two matrices: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                System.out.print(diff[i][j]+" ");
            }
            System.out.println();
        }

    }


}
