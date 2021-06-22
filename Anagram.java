import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
			public static void main(String arg[])
			{
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter your first String:");
				String s1=sc.next();
				
				System.out.println("Enter your Second String");
				String s2=sc.next();
				
				
				s1=s1.toLowerCase();
				s2.toLowerCase();
				
				if(s1.length()!=s2.length())
				{
					System.out.println("Strings are not Anagram");
				}
				
				else
				{
					char[] c1=s1.toCharArray();
					char[] c2=s2.toCharArray();
					
					Arrays.sort(c1);
					Arrays.sort(c2);
					
					if(Arrays.equals(c1,c2)==true)
					{
						
						System.out.println("String are anagram");
					}
					
					else
					{
						System.out.println("Strings are not anagram");
					}
					
				}
				
			}
}
