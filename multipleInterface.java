package Interfaces;
interface printablee {
    void print();
}
interface Showable{
    void show();
}
public class multipleInterface implements printablee,Showable{
    public void print(){
        System.out.println("hello");

    }
    public void show(){
        System.out.println("welcome");
    }

    public static void main(String[] args) {
        multipleInterface ml=new multipleInterface();
        ml.print();
        ml.show();

    }

}
