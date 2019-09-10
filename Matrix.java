import java.util.Scanner;

public class Matrix {
	
		int r1,r2,c1,c2,sum;
		int a[][];
		int b[][];
	
			Matrix()
			{
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter number of rows in first matrix:");
				r1=sc.nextInt();
				System.out.println("Enter number of columns in first matrix:");
				c1=sc.nextInt();
				System.out.println("Enter number of rows in second matrix:");
				r2=sc.nextInt();
				System.out.println("Enter number of columns in second matrix:");
				c2=sc.nextInt();
				}
				
				public void input()
				{
					Scanner s=new Scanner(System.in);
					a=new int [r1][c1];
					System.out.println("Enter elements for first matrix:");
					for(int i=0;i<r1;i++)
					{
						for(int j=0;j<c1;j++)
						{
								a[i][j]=s.nextInt();
							
						}
						
					}
						b=new int[r2][c2];
						System.out.println("Enter elements for second matrix:");
						for(int i=0;i<r2;i++)
						{
							for(int j=0;j<c2;j++)
							{
								b[i][j]=s.nextInt();
								
							}
							
						}
					
				}
				
					public void Output()
					{
						System.out.println("Your first matrix:");
						for(int i=0;i<r1;i++)
						{
							for(int j=0;j<c1;j++)
							{
								System.out.print(a[i][j]+"");
								
							}
							
								System.out.println(" ");
						}
						
						System.out.println("Your Second matrix:");
						for(int i=0;i<r2;i++)
						{
							for(int j=0;j<c2;j++)
							{
								System.out.print(b[i][j]+"");
								
							}
							
								System.out.println(" ");
						}
					
						
					}
					
						}
