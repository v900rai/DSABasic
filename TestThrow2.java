package javaInterviewProgram;

import java.io.*;

public class TestThrow2 
{
	//function to check if person is eligible to vote or not   
    public static void method() throws FileNotFoundException {  
  
        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\Vishalrai.txt");  
        BufferedReader fileInput = new BufferedReader(file);  
  
      
        throw new FileNotFoundException();  
      
    }  
    //main method  
    public static void main(String args[]){  
        try  
        {  
            method();  
        }   
        catch (FileNotFoundException e)   
        {  
            e.printStackTrace();  
        }  
        System.out.println("rest of the code...");    
  }    
}    


