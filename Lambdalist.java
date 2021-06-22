import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.*;

public class Lambdalist {
	
	int id;
	String name;
	long salary;
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	
	public void setName(String name) {
		this.name = name;
	}

	
	public Long getSalary() {
		return salary;
	}



	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	public Lambdalist(int id,String name,long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary=salary;
	}

		

	

	
		public static void main(String arg[])
		{
			
			
			List<Lambdalist> list=new ArrayList<Lambdalist>();
			
			
			list.add(new Lambdalist(1,"mohit",10000));
			list.add(new Lambdalist(2,"rohit",10500));
			list.add(new Lambdalist(3,"kunal",100020));
			list.add(new Lambdalist(4,"aashna",100523));
		
		
			System.out.println("sorting basis on the name");
			
			
			Stream<Lambdalist> filter_data=list.stream().filter(l->l.salary>10030);
			
			filter_data.forEach(
					
					lambdalist->System.out.println(lambdalist.id+"-"+lambdalist.name+"-"+lambdalist.salary)
					
					);
			
			
			/*
			 * Collections.sort(list,(p1,p2)-> { return p1.name.compareTo(p2.name); });
			 * 
			 * 
			 * for(Lambdalist l:list) {
			 * 
			 * System.out.println(l.id+""+l.name); }
			 */
		}
	
}
