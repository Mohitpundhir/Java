public class Account {
	
	
			int acc_no;
			float amount;
			String name;
			
			void insert(String n,float amt,int acc)
			{
				name=n;
				amount=amt;
				acc_no=acc;
				
			}
			
			void deposite(float amt)
			{
				amount=amount+amt;
				
				System.out.println(amt+"Rupees deposite ");
				
			}
	
			void withdraw(float amt)
			{
				if(amount<amt)
					System.out.println("insufficient Balance");
				else
				{
					amount=amount-amt;
					System.out.println(amt+"is Withdrawn");
				}
				
			}
			
			void checkbalance()
			{
				System.out.println("Current Balance is:"+amount);
				
			}
			void display()
			{
				
				System.out.println("Name:"+name);
				System.out.println("Account number:"+acc_no);
				System.out.println("Balance:"+amount);
			}
			
}
