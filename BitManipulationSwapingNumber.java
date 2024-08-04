package AdvancedDataStructureInJava;
import java.io.*;
import java.util.*;

public class BitManipulationSwapingNumber {
    public static void main(String args[]) {
        /*package whatever //do not write package name here */


        int a = 5;
        int b = 7;
        System.out.print("Before Swapping, a = ");
        System.out.print(a);
        System.out.print(" ");
        System.out.print("b = ");
        System.out.print(b);
        System.out.println("");
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.print("After Swapping, a = ");
        System.out.print(a);
        System.out.print(" ");
        System.out.print("b = ");
        System.out.print(b);
    }
}




