import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		
					Scanner sc=new Scanner(System.in);
						
					System.out.println("Enter your String:");
					
					String str=sc.nextLine();
					
					for(int i=0;i<str.length();i++)
					{
							if(str.charAt(i)==' ')
							{
								System.out.println();
								continue;
							}
							
							System.out.print(str.charAt(i));
						
					}
					
					sc.close();
					
					
	}

}
