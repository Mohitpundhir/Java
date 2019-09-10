import java.util.Calendar;
import java.util.Scanner;

public class My_age {
	
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
		
					System.out.println("Enter your birth year:");
					int birth=s.nextInt();
					int year=Calendar.getInstance().get(Calendar.YEAR);
					
					int age=year-birth;
					
					System.out.println("Your age is:"+age);

	}

}
