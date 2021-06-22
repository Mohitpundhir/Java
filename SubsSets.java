
public class SubsSets {

	
			public static void main(String arg[])
			{
				
				String str="MAN";
				
				int len=str.length();
				int temp=0;
				
				String[] sa=new String[len*(len+1)/2];
				
				for(int i=0;i<len;i++)
				{
					for(int j=i;j<len;j++)
					{
						sa[temp]=str.substring(i,j+1);
						temp++;
					}
				}
				
				System.out.println("All Subsets for given String are:");
				for(int i=0;i<sa.length;i++)
				{
					System.out.println(sa[i]);
					
				}
				
			}
}
