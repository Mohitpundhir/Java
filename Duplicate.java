class Duplicate{
		public static void main(String ar[])
		{
			int a[]={1,2,2,3,3,4,4,5,5};
			int i,j=0;

			for(i=0;i<a.length-1;i++)
			{
				if(a[i]!=a[i+1])
				{
					a[j]=a[i];
					j++;
				}

			}
			a[j]=a[a.length-1];

			for(i=0;i<j+1;i++)
			{
				System.out.print(a[i]);
			
			}		

		}


	}