
public class threadInter implements Runnable{

	
	public void run() {
		
				System.out.println("thread........");
			}
	

		public static void main(String ar[])
			{
				
					threadInter th=new threadInter();
					th.run();
			
			
			}
	
}
