import java.util.Scanner;

public class Pattern {

		public static void main(String arg[])
				
		{
				int n;
					
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter number:");
				n=sc.nextInt();
				
				for(int i=n;i>=0;i--)
				{
					for(int j=0;j<=i;j++)
					{
						System.out.print("*");
						
					}
					
					System.out.print("\n");
					
				}
				
		}
		}
