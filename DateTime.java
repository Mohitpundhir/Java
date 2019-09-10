import java.sql.Timestamp;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		
						Date d=new Date();
						Timestamp ts=new Timestamp(d.getTime());	
		
						System.out.println(ts);	

	}

}
