
interface multiplep
{

	public int calc(int a,int b);
	

}


public class lambda1 {

			public static void main(String arg[])
			{
				
				multiplep m=(a,b)->(a+b);
				
				System.out.println(m.calc(45,25));
						
				
				multiplep m1=(a,b)->(a-b);
				System.out.println(m1.calc(85,23));
				
				
			}
	
	
}
