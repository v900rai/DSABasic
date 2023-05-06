package javaInterviewProgram;

public class javaBeanClassInjava 
{
   private int id;
   private String name;// variable declear private
   private double marks;
   public javaBeanClassInjava(int id, String name, double marks)
   {
	   this.id=id;
	   this.name=name;
	   this.marks=marks; // constructor 
	   
   }
   // getter 
   public int getId()
   {
	   return id;
   }
   public void  setId(int id)
   {
	   this.id=id;
   }
   
   public String getName()
   {
	   return name;
   }
   public void setName(String name)
   { 
	   this.name=name;
	   
   }
   public double getMaks()
   {
	   return marks;
   }
   public void setMarks(double marks)
   {
	   this.marks=marks;
   }
   public static void main(String []vishal)
   {
	   javaBeanClassInjava s1=new javaBeanClassInjava( 106, "vishal rai",100.00 );
	   System.out.println(s1.getId()+"  "+s1.getName()+"  "+s1.getMaks());
   }
   

}
