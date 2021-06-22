
public class UpperLower {
	
	
			public static void main(String arg[])
			{
				String str="Good Person";
				
				StringBuffer stb=new StringBuffer(str);
			
				
				for(int i=0;i<str.length();i++)
				{
			

					if(Character.isLowerCase(str.charAt(i)))
					{
						
						stb.setCharAt(i,Character.toUpperCase(str.charAt(i)));
						
					}
					
					else if(Character.isUpperCase(str.charAt(i)))
					{
						
						stb.setCharAt(i,Character.toLowerCase(str.charAt(i)));
					}
			
					
					
					
				}
				
				System.out.println(stb);
				
				
			
			}
			

}
