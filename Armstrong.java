import java.util.Scanner;

public class Armstrong {
	
				public static void main(String ar[])
				{
						
							int n,r,a=0,temp;
							
							Scanner s=new Scanner(System.in);
							
							System.out.println("Enter your number:");
							n=s.nextInt();
							temp=n;
							while(n>0)
							{
									r=n%10;
									a=(r*r*r+a);
									n=n/10;
								
								
							}
							
								if(temp==a)
							System.out.println(+temp+" "+"is a Armstrong number");
									
								else
									System.out.println(+temp+" "+"is not a Armstrong number");
				}
				

}
