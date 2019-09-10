
public class Deamon extends Thread {
	
	
					public void run()
					{
						if(Thread.currentThread().isDaemon())
						{
							System.out.println("Deamon Thread ");
						}
						else
							System.out.println("User Thread Wokrking");
						
					}
					
					public static void main(String a[])
					{
							Deamon d1=new Deamon();
							Deamon d2=new Deamon();
							Deamon d3=new Deamon();
						
							d1.setDaemon(true);
							
							d1.start();
							d2.start();
							d3.start();
							
					}
					

}
