
public class Unique {

	public static void main(String[] args) {
		
		int amount=0;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				for(int k=1;k<=5;k++)
				{
					if(k!=i && k !=j && i !=j)
					{
						System.out.println(i+""+j+""+k);
						amount++;
					}
					
				}
			}
		}
			
			System.out.println("TOTAL UINQUE NUMBER IS:"+amount);
	}

}
