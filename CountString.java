import java.util.Scanner;

public class CountString {


	 	public static void main(String main[])
	 	{
	 		
	 		Scanner sc=new Scanner(System.in);
	 		int count=0;
	 		
	 		System.out.println("Enter your String:");
	 		String input=sc.nextLine();
	 		String[] s=input.split(" ");
	 		
	 		for(int i=0;i<s.length;i++)
	 		{
	 		
	 				count+=s[i].length();
	 	
	 				
	 		}

 			System.out.println(count);
 		
	 	}
	 	
	
}
