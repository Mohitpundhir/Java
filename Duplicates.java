import java.util.Scanner;

public class Duplicates {

	
					public static void main(String arg[])
						{
						
						Scanner sc=new Scanner(System.in);
						System.out.println("Enter your String:");
						String str1=sc.next();
					  String str2="";      
					    for(int i=0; i<=str1.length()-1;i++) {
					        int count=0;
					        for(int j=0;j<=i;j++) {
					            if(str1.charAt(i)==str1.charAt(j)) 
					                count++;
					            if(count >1)
					                break;
					        }
					        if(count==1) 
					            str2=str2+str1.charAt(i);
					    }
					    System.out.println(str2);

						
						
						}
	
}

//String str1="shushil",str2="";      
//for(int i=0; i<=str1.length()-1;i++) {
  //  int count=0;
    //for(int j=0;j<=i;j++) {
      //  if(str1.charAt(i)==str1.charAt(j)) 
        //    count++;
        //if(count >1)
          //  break;
    //}
    //if(count==1) 
      //  str2=str2+str1.charAt(i);
//}
//System.out.println(str2);

