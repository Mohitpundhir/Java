import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
					Scanner sc=new Scanner(System.in);
					
					String rev = "";
					
					System.out.println("Enter your String:");
					String str=sc.next();
					int length=str.length()-1;
					
					for(int i=length;i>=0;i--)
					{
						rev=rev+str.charAt(i);
						
					}
					if(str.equals(rev))
					{
					System.out.println(rev+" is pallindrome");
					}
					else
					{
						System.out.println(rev+" is not pallindrome");
					}
					
					
	}

}
