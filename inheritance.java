
public class inheritance {
	
			int bonus=4000;

}

	class salary extends inheritance
	{
			int sal=50000;
			
			
			public static void main(String arg[])
			{
			salary s=new salary();
			
			System.out.println("SALARY:"+s.sal);
			System.out.println("TOTAL SALARY:"+s.bonus);
			
			
			}
			
		
		
	}