import java.util.Scanner;

public class AscenDscen {

	public static void main(String[] args) {
		
				int arr[]=new int[6];
				int temp;
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter your Elements:");
				for(int i=0;i<arr.length;i++)
				{
					arr[i]=sc.nextInt();
				}
				
				for(int i=0;i<arr.length/2;i++)
				{
					for(int j=0;j<arr.length/2;j++)
					{
						if(arr[i]<arr[j])
						{
							temp=arr[j];
							arr[j]=arr[i];
							arr[i]=temp;
						}
					}
					
				}
					for(int i=arr.length/2;i<arr.length;i++)
					{
						for(int j=arr.length/2;j<arr.length;j++)
						{
							
							if(arr[i]>arr[j])
							{
								temp=arr[i];
								arr[i]=arr[j];
								arr[j]=temp;
								
							}
						}
					}
					System.out.println("half in Array in ascending: ");
					for(int i=0;i<arr.length/2;i++)
					{
						System.out.print(arr[i]+"");
					}
					
					System.out.println();
					
					System.out.println("half in descending:");
					for(int i=arr.length/2;i<arr.length;i++)
					{
						System.out.print(arr[i]+"");
					}
				

	}

}
