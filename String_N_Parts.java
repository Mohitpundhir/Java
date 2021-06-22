import java.util.Scanner;

public class String_N_Parts {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your String:");
		String s=sc.next();
		
		int len=s.length();
		int n=3;
		
		int temp=0,chars=len/n;
		
		String[] equalstr=new String[n];
		
		if(len%n!=0)
		{
			System.out.println("Sorry String cant divided");
		}
		else
		{
			for(int i=0;i<len;i=i+chars)
			{
				String part=s.substring(i,i+chars);
				equalstr[temp]=part;
				temp++;
			}
		}
		
		System.out.println(n+ "equal part is given String are:");
		
		for(int i=0;i<equalstr.length;i++)
		{
				
			System.out.println(equalstr[i]);
			
		}
		
	}

}
