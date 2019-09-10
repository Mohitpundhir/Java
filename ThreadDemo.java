
public class ThreadDemo implements Runnable {

			public void run()
			{
				System.out.println(Thread.currentThread().getName());
				
			}
	
	
	public static void main(String[] args) {
	
			ThreadDemo run=new ThreadDemo();
			
				ThreadGroup t1=new ThreadGroup("Parent Thread");
				
				Thread th1=new Thread(t1,run,"one");
				th1.start();
				Thread th2=new Thread(t1,run,"two");
				th2.start();
				Thread th3=new Thread(t1,run,"Three");
				th3.start();
				
				System.out.println("Thread Group Name:"+t1.getName());
				t1.list();
					
	}

		
}


