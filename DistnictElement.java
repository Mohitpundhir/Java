
public class DistnictElement {
	
	
	public static void main(String arg[])
	{
		
		
		int a[]={2,4,7,3,6};
		int b[]= {3,6,7,2};
		int c=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			c=0;
			for(int j=0;j<b.length;j++)
			{
				
				if(a[i]==b[j])
				{
					c=1;
				}
				
					
			}
			if(c!=1)
			{
				System.out.println(a[i]);
				
			}
			
		}
		System.out.println();
		
		
		
		
	}

	
	
}
