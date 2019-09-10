import java.util.Scanner;

public class Primenumber {
	
	
				public static void main(String a[])
				{
							int n;
							int flag=0;
							
					Scanner sc=new Scanner(System.in);
					
					System.out.println("Enter your number:");
					n=sc.nextInt();
					
					for(int i=2;i<=n/2;i++)
						
					{
						if(n%i==0)
						{
							
							System.out.println(+n+" "+"is not a prime number");	
							flag=1;
							break;
							
						}
						
					}
						if(flag==0)
						{
						
							System.out.println(+n+" "+"is a prime number");
						}
							
				}

}
