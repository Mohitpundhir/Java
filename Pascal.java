import java.util.Scanner;
class Pascal
	{
		public static void main(String ar[])
		{
			int i,j,n,space;
			Scanner sc=new Scanner(System.in);		
			System.out.println("Enter your number:");
			n=sc.nextInt();
			space=n;
			int number=1;
			
			for(i=0;i<n;i++)
			{
			 	for(j=1;j<=space;j++)
				{
					System.out.print(" ");
				
				
				}
				 number=1;
				for(int k=0;k<=i;k++)
				{
					System.out.print(number+" ");
					number=number*(i-k)/(k+1);
				}
				space--;
				System.out.println();
			

			}
						
		
		}


	}