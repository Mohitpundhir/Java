import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		
					
					Scanner sc=new Scanner(System.in);
					
					int i,j;
					
					int a[]=new int[6];

					int temp;
					System.out.println("Enter your elements:");
					
					for( i=0;i<a.length;i++)
					{
						a[i]=sc.nextInt();
					}
					
					for(i=0;i<a.length;i++)
					{
						for(j=0;j<a.length;j++)
						{
								if(a[i]<a[j])
								{
									temp=a[i];
									a[i]=a[j];
									a[j]=temp;
										
								}
							
						}
						
						
					}
					System.out.println("Second largest is:");
					for(i=0;i<a.length;i++)
					{
						System.out.print(a[a.length-2]);
						break;
						
					}
					
					
					
					
		

	}

}
