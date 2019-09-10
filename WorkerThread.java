
public class WorkerThread implements Runnable{

	private String msg;
	
		public WorkerThread(String s)
		{
				this.msg=s;
		}
	
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+"MESSAGE:"+msg);
		process();
		
		System.out.println(Thread.currentThread().getName()+"End");
		
	}
	
		private void process()
		{
			try 
			{
				Thread.sleep(1200);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		}
			


