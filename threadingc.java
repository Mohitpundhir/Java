
public class threadingc extends Thread {
	
	public void run()
	{
		System.out.println("THREAD IS RUNNING");
		
	}

		public static void main(String[] args) {
				
					threadingc t=new threadingc();
					t.run();

	}

}
