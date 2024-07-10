package July2024;

import selfpractices.CountObjects;

public class CountObject {
    public  static int count=0;
    public CountObject(){
        count++;
    }

    public static void main(String[] args) {
        CountObjects ctr=new CountObjects();
        CountObjects ctr1=new CountObjects();
        CountObjects ctr2=new CountObjects();
        CountObjects ctr3=new CountObjects();
        System.out.println("Number of objects created are "
                + CountObjects.count);


    }
}
