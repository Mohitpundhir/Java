
public class GarbageC {
	
		protected void finalize()
		{
			System.out.println("Grabage collected");
		}

			public static void main(String arg[])
			{
					GarbageC g=new GarbageC();
					GarbageC d=new GarbageC();
				
					g=null;
					d=null;
					System.gc();
			}
}
