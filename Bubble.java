public class Bubble
	{
		public static void main(String arg[])
		{
		
			int a[]={10,6,5,4,19,45,12,1,32};
			int temp=0;
		
			for(int i=0;i<9;i++)
			{
				for(int j=0;j<9;j++)
			
					{

						if(a[i]<a[j])
						{

							temp=a[i];
							a[i]=a[j];
							a[j]=temp;		
				
						}
					
					}
					
		}	
			
			for(int i=0;i<9;i++)
					{
						System.out.println(a[i]);
					}				

		}



	}