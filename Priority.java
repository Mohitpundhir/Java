
public class Priority  extends Thread{
	
				public void run()
				{
						System.out.println("Running thread name:"+Thread.currentThread().getName());
						System.out.println("Thread Prority:"+Thread.currentThread().getPriority());
						
					
				}
				
				
				public static void main(String []arg)
				
				{
						Priority pr=new Priority();
						Priority pri=new Priority();
							
						pr.setPriority(Thread.MIN_PRIORITY);
						pri.setPriority(Thread.MAX_PRIORITY);
						
						pr.start();
						pri.start();	
						
					
				}
}
