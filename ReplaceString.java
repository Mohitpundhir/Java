
public class ReplaceString {

			
					public static void main(String arg[])
					{
						
							String stri="aabmohitcdbc";
							
							char[] str=stri.toCharArray();
							
							for(int i=1;i<str.length;i++)
							{
								if(str[i-1]=='a' && str[i]=='b')
								{
									str[i-1]='c';
								
								int j;
								for(j=i;j<str.length-1;j++)
								{
									str[j]=str[j+1];
								}
							str[j]=' ';
								
								}
							}
							for(int i=1;i<str.length;i++)
							{
								if(str[i-1]=='b' && str[i]=='c')
								{
									str[i-1]='a';
								
								int j;
								for(j=i;j<str.length-1;j++)
								{
									str[j]=str[j+1];
								}
							str[j]=' ';
								
								}
							}
							
							System.out.println(str);
							
						}
	}
