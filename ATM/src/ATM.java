import java.util.Scanner;
public class ATM {
	  
	
	public static void main (String[]args) {
		Account acc=new Account(0.0,"123789");
		
System.out.println("Enter Your Card Number");
		
Scanner sc= new Scanner(System.in);


        String CN;
        CN=sc.nextLine();
		
		
		if(CN.equals(acc.getCardNumber()))
		{
			
			int number;
			do {
		    System.out.println("choose a number");	
			System.out.println(" 1)Deposit");
			System.out.println(" 2)Withdrawal");
			System.out.println(" 3)Balance Inquiry");
			System.out.println(" 4)Previous");
			System.out.println(" 5)Next");
			System.out.println(" Your choice is : ");
			
			number= sc.nextInt();
				
			switch(number) {
			case 1:
				acc.deposite();			
				break;
				
			case 2:
				acc.withdraw(number);	
				break;
				
			case 3:
				System.out.println("Your balance : "+acc.getBalance());	
				break;
				
			case 4:
				acc.previous();
				break;
				
			case 5:
				acc.next();
				break;
		           }
		
		     } while(number > 0);
	    }
		
		else	
			System.out.println("Error.Invalid cardnumber.");	
    }

 
}
