package selfpractices;

public class AdvancedPatternProgram {
    public static void main(String[] args) {
        int n=5;
        // first part
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //sapaces
            int spaces=2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //2nd parts
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=n; i>=1 ;i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //sapaces
            int spaces=2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //2nd parts
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
