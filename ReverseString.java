import java.util.Scanner;

public class ReverseString {
	
					public static void main(String ar[])
					
					{
						
						
							Scanner sc=new Scanner(System.in);
							System.out.println("Enter your String:");
							
							char letter[]=sc.nextLine().toCharArray();
							
							for(int i=letter.length-1;i>=0;i--)
							{
								System.out.print(letter[i]);
								
								
							}
							
							
							
							
							
						
						
					}
					

}
