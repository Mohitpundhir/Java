import java.util.Scanner;

public class Average {
	
	      static double pi=3.14;
	       static double r;
	       static Scanner sc=new Scanner(System.in);
	       public static void main(String a[])
	       
	       {
	    	   double area;
	    	   double parameter;
	    	   
	    	   
	    	   System.out.println("Enter radius:");
	    	   r=sc.nextInt();
	    	   area=pi*r*r;
	    	   parameter=2*pi*r;
	    	   
	    	   System.out.println("Area of Circle:"+area);
	    	   System.out.print("parameter of circle:"+parameter);
	    	    
	    	   }

}
