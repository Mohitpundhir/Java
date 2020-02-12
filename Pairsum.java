import java.util.Scanner;

public class Pairsum {

	public static void main(String[] args) {
		
		
					Scanner sc=new Scanner(System.in);
					int i,j,k;
					int a[]=new int[6];
					
					System.out.println("Enter your elements:");
					for(i=0;i<a.length;i++)
					{
						a[i]=sc.nextInt();
						
					}
					
					for(i=0;i<a.length;i++)
					{
						for(j=1;j<a.length;j++)
						{
							for(k=0;k<a.length;k++)
							{
								if(a[i]+a[j]==a[k])
								{
									System.out.print("("+a[i]+","+a[j]+")"+" ");
								}
								else
								{
									continue;
								}
							}
								
						}
					}
					
					

	}

}
