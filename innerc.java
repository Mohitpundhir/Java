
public class innerc {

	private int data=50;
	
	class subb
		{
			public void my()
			{
				
					System.out.println("MY DATA:"+data);
			}
		}
	
	
	
	public static void main(String[] args) {
		
		innerc in1=new innerc();
		innerc.subb in2=in1.new subb();
			
			in2.my();
	}

}
