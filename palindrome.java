import java.util.Scanner;

public class palindrome {
	
				public static void main(String ar[])
				
				{
							int n,r,reminder=0,orignal,sum=0;
							
							Scanner s=new Scanner(System.in);
							
							System.out.println("Enter your number:");
							n=s.nextInt();
							
							orignal=n;
							
							while(n>0)
								{
									r=n%10;
									sum=(sum*10)+r;
									n=n/10;
								
								}
							
									if(orignal==sum)
									{
										
										System.out.println(+orignal+" "+"is a Palindrome number");
									}
									
									else
									{
										System.out.println(+orignal+" "+"is not a Palindrome number");
									}
							{
								
								
							}
							
						
					
				}

}
