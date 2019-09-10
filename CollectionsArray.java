import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsArray {
	
			public static void main(String arg[])
			{
					ArrayList <String> list=new <String> ArrayList();
					
					list.add("Mohit");
					list.add("Gouri");
					list.add("Rohit");
					
					Iterator  i=list.iterator();
						
					while(i.hasNext())
					{
						System.out.println(i.next());
						
					}
				
			}
	

}
