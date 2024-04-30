package Interfaces;

import java.io.*;
interface test{
    // public, static and final
    final int a = 10;
    int b=20;
    // public and abstract
    void display();
    void newdispaly();
}

 class testmain  implements  test {
    @Override
    public void display() {
        System.out.println("hello vishal rai");
    }

     @Override
     public void newdispaly() {
         System.out.println("hello rai ji");

     }
    public static void main(String[] args) {
        testmain it = new testmain();
        it.display();
        it.newdispaly();
        System.out.println(a);
        System.out.println(b);

    }

}
