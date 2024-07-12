package Matrix;

public class rotateArryas {
    private  static void rotateArryas(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        //int newArr[][]=new int[m][n];
        // transpose
        for(int i=0; i<n; i++){
            for(int j=i+1; j<m; j++){
                //arr[j][n-1-i]=arr[i][j];
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //int newArr[][]=new int[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                //arr[j][n-1-i]=arr[i][j];
                int temp=arr[i][j];
                arr[i][j]=arr[i][n-1-j];
                arr[i][n-1-j]=temp;
            }
        }

        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotateArryas(arr);
    }
}
