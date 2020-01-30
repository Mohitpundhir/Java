import java.util.Scanner;

class PrimeNumbern
	{
	
					public static void main(String arg[])
					{
							Scanner sc=new Scanner(System.in);
							
							System.out.println("Enter your Number for prime Number:");
							int n=sc.nextInt();
							int temp=0;
							
							for(int i=1;i<=n;i++)
							{
								for(int j=2;j<i-1;j++)
								{
									 if(i%j==0)
									 {
										 	temp=temp+1;
										 
									 }
								}
								if(temp==0)
								{
									System.out.print(" "+i);
								}
								else
								{
									temp=0;
								}
								
							}
							
					}


	}