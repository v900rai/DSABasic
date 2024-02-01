package Matrix;

public class spiralMatrix {
    private  static void spiralMatrix(int arr[][]){
        int left=0;
        int right=arr.length-1;
        int top=0;
        int bottom=arr[0].length-1;
        while (top<=bottom && left<=right){
            // left to right
            for(int i=left; i<=right; i++){
                System.out.print(arr[top][i]);
            }
            top++;




            // top se bottom
            for(int i=top; i<=bottom; i++){
                System.out.print(arr[i][right]);
            }
            right--;




            /// rigth to left
            for(int i=right; i>=left; i--){
                System.out.print(arr[bottom][i]);
            }
            bottom--;




            // bottom se top pr
            for(int i=bottom; i>=top; i--){
                System.out.print(arr[i][left]);
            }
            left++;

        }

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralMatrix(arr);

    }
}
