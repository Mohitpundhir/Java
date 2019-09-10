
public class Threadset extends Thread{

				public void run()
				{
						System.out.println("Threadddddddd");
						
					
				}
				
					public static void main(String arg[])
					{
						
							Threadset t1=new Threadset();
							Threadset t2=new Threadset();
							
							System.out.println("Thread name 1:"+t1.getName());
							System.out.println("Thread name 2:"+t2.getName());
							System.out.println("Therad ID:"+t1.getId());
						
							t1.start();
							t2.start();
							t1.getId();
							
							System.out.println("After set t1 Name");
							t1.setName("MOHIT PUNDIR");
							System.out.println("THREAD 1 NAME:"+t1.getName());
							
					}
	
}
