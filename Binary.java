import java.util.Scanner;

public class Binary {
	
	
				public static void main(String ar[])
				
				{
						int num1,num2;
						int d1,d2,sum=0,carry=0;
						
						int arr[]=new int[10];
						
						Scanner sc=new Scanner(System.in);
						
						System.out.println("Enter your first Num:");
						num1=sc.nextInt();
						
						System.out.println("Enter your second number:");
						num2=sc.nextInt();
						
						for(int i=arr.length-1;i>0;i--)
						{
						
						d1=num1%10;
						d2=num2%10;
						
						
						num1=num1/10;
						num2=num2/10;
						
						sum=d1+d2+carry;
						
						if(sum==0)
						{
							arr[i]=0;
							carry=0;
							
						}
						
						else if(sum==1)
						{
							arr[i]=1;
							carry=0;
							
						}
						
						else if(sum==2)
						{
							arr[i]=0;
							carry=1;
						}
						
						else if(sum==3)
						{
							arr[i]=1;
							carry=1;
							
						}
						
						
					
						}
						
						for(int i=0;i<arr.length;i++)
						{
							 System.out.print(arr[i]);
							
						}
				}

}
