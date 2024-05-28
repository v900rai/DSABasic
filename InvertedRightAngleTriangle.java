package selfpractices;


    import java.util.Scanner;

    public class InvertedRightAngleTriangle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();

            for (int i = rows; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            scanner.close();
        
    }

}
