import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
	
						
					Scanner sc=new Scanner(System.in);
					
					int len,len1,len2,found=0,not_found=0;
					
					System.out.println("Enter your First String:");
					
					String str1=sc.next();
					
					System.out.println("Enter your Second String:");
					
					String str2=sc.next();
					
					len1=str1.length();
					len2=str2.length();
					
					if(len1==len2)
					{
						
						len=len1;
						
						for(int i=0;i<len;i++)
						{
						
								found=0;
							for(int j=0;j<len;j++)
							{
								
								if(str1.charAt(i)==str2.charAt(j))
								{
									found=1;
									break;
								}
								
							}
							if(found==0)
							{
								not_found=1;
								break;
							}
							
							
							
						}
						
						if(not_found==1)
						{
							
							System.out.println("String is not ANAGRAM");
						}
						else
						{
							System.out.println("String is Anagram");
						}
						
					}
		
							
		

	}

}
