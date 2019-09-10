
public class Encapsulation {
	
			private String name;
			private String addres;
			private String email;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getAddres() {
				return addres;
			}
			public void setAddres(String addres) {
				this.addres = addres;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			
			public static void main(String ar[])
			{
					Encapsulation en=new Encapsulation();
					
					en.setName("Mohit");
					en.setAddres("UttamNagar West");
					en.setEmail("mohitpundhir65@gmail.com");
					
					System.out.println("Name:"+en.getName());
					System.out.println("Address:"+en.getAddres());
					System.out.println("Em@il:"+en.getEmail());
			}
}

			
