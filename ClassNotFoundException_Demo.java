package July2024;

public class ClassNotFoundException_Demo {
    public static void main(String[] args) {
        try {
            Class.forName("Class1");   // Class1 is not defined
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            System.out.println("Class Not Found...");
        }
    }
}
