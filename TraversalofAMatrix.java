package Matrix;

public class TraversalofAMatrix {

    public static void main(String args[]){
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };
        // Traversing over all the rows
        for (int i = 0; i < 3; i++) {
            // Traversing over all the columns of each row
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
