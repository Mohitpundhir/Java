
public class Finalizee {
	  
		public void finalize(){System.out.println("finalize called");}  
		public static void main(String[] args){  
		Finalizee f1=new Finalizee();  
		Finalizee f2=new Finalizee();  
		f1=null;  
		f2=null;  
		System.gc();  
		}  

}
