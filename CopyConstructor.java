package selfpractices;

public class CopyConstructor {
    int a;
    String b;
    CopyConstructor(){
        a=10;
        b="vishal";
        System.out.println(a +" "+b);
    }
    CopyConstructor(CopyConstructor ref){
        a=ref.a;
        b=ref.b;
        System.out.println(a +" "+b);

    }

    public static void main(String[] args) {
        CopyConstructor a=new CopyConstructor();
        CopyConstructor b=new CopyConstructor(a);
    }

}
