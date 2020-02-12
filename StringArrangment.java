
public class StringArrangment {
	
								static void printPermutation(String str,String ans	)
								{

											if(str.length()==0)
											{
												System.out.println(ans+"");
												return; 
											}
									
									for(int i=0;i<str.length();i++)
									{
										char ch=str.charAt(i);
										
										String out=str.substring(0,i)+str.substring(i+1);
										
										printPermutation(out,ch+ans);
										
										
										
									}
											
								}
								
								public static void main(String str[])
								{
									String s="ABC";
									printPermutation(s,"");
									
									
									
											
									
								}
		
		

	}


