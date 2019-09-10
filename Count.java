

public class Count {

	public static void main(String[] args) {
		
		String test="My name is mohit and my age is 19 and Dob is 19/12/1999";
		Count(test);
		
		
	}

	public static void  Count(String X) {
			
				char[] ch=X.toCharArray();
				int letter=0;
				int digit=0;
				int space=0;
				int others=0;
			
				for(int i=0;i<X.length();i++)
				{
					if(Character.isLetter(ch[i]))
						letter++;
					
					else if(Character.isDigit(ch[i]))
					{
						digit++;
					}
					
					else if(Character.isSpaceChar(ch[i]))
					{
						space++;
					}
					
					else
					{
						others++;
						}	
				
				
				}
					System.out.println("Letters:"+letter);
					System.out.println("Digit:"+digit);
					System.out.println("Space:"+space);
					System.out.println("Others:"+others);
	
	}
}
