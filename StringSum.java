import java.util.Scanner;

public class StringSum {
	
					public static void main(String arg[])
						{
						
									Scanner sc=new Scanner(System.in);
									
									System.out.println("Enter your string:");
									String str=sc.nextLine();
									int sum=0;
									char[] ch=str.toCharArray();
									
									
									for(char c:ch)
									{
										
										sum +=c-'A'+1;
										
										}
										System.out.println(sum);
									}
						
						
						}
	


