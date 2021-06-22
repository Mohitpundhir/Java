interface lambdae
{
 public String printmessage(String name);

}




public class Lambda {
	 
	   public static void main(String arg[])
	   {
		   
		   lambdae s=(name)->{return "heloo"+name;};
		   
		   System.out.println(s.printmessage("mohit"));
		   
	   
		   lambdae s1=name ->{return "hello"+name;};
		   
		   System.out.println(s1.printmessage("rohit"));
	   
	   
	   }
	


}
