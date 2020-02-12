import java.util.Scanner;

public class Duplicateint {
	
	
					public static void main(String arg[])
					{
							
								Scanner sc=new Scanner(System.in);
								
								int arr[]=new int[5];
								
								
								int j=0;
								System.out.println("Enter your elements:");
								
								
								for(int i=0;i<arr.length;i++)
								{
									arr[i]=sc.nextInt();
								}
								
								for(int i=0;i<arr.length-1;i++)
								{
									if(arr[i]!=arr[i+1])
									{
										arr[j]=arr[i];
										j++;
									}
									
									
								}
								arr[j]=arr[arr.length-1];
								
								for(int i=0;i<j+1;i++)
								{
									System.out.print(arr[i]);
								}
								
					}
				
}
								
								
								
								
								

