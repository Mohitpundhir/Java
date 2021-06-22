import java.util.Scanner;

public class StringVowels {
	
			public static void main(String arg[])
			{
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter your String:");
				String s=sc.nextLine();
				
				
				s=s.toLowerCase();
				int consonent=0;
				int vowels=0;
				
				
				for(int i=0;i<s.length();i++)
				{
					if(s.charAt(i)=='a'|| s.charAt(i)=='i'|| s.charAt(i)=='e'|| s.charAt(i)=='o'|| s.charAt(i)=='u')
					{
						vowels++;
						
					}
					
					else if(s.charAt(i)!=' ')
					{
						consonent++;
					}
					
					
				}
				System.out.println("Vowels are:"+vowels);
				System.out.println("Consonent are:"+(consonent));
				
			
				sc.close();
			}

}
