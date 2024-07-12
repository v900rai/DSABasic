package Matrix;

public class searchInMatrix {
    public static void main(String[] args) {

        int x = 8;
        int[][] arr = {{0, 6, 8, 9, 11},
                {20, 22, 28, 29, 31},
                {36, 38, 50, 61, 63},
                {64, 66, 100, 122, 128}};

        if (searchInMatrix(arr, x)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


    static boolean searchInMatrix(int[][] arr, int x) {
        int m = arr.length, n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == x)
                    return true;
            }
        }
        return false;
    }

}