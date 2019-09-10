
public class threadsleep extends Thread {

				public void run()
				{
					for(int i=0;i<5;i++)
					{
						try
						{
							Thread.sleep(1000);
						}
						catch(Exception e)
						{
							
								System.out.println(e);
						}
						
						System.out.println(i);
					}
					
					
				}
	
				public static void main(String arg[])
					{
					
						threadsleep t=new threadsleep();
						threadsleep t1=new threadsleep();
					
						t.start();
						t1.start();
					}
}
