import java.util.Scanner;

public class Account {
	private static double balance;
	private String CardNumber;
	private int count;
	private Transaction[] History;
	
	Scanner sc= new Scanner(System.in);
	
	
	public Account(double balance,String CardNumber) {
	Account.balance=balance;
	this.CardNumber=CardNumber;
	History=new Transaction[5];
	count =0;
	}
	
	public double deposite()
	{
	  double depositeMoney;
	  System.out.println("Enter deposite amount");
	  depositeMoney =sc.nextDouble();
		balance=balance+depositeMoney;
		Transaction history = new Transaction("deposite",depositeMoney);
		History[count++]=history;		
		return balance;
	}

	public double withdraw(double amount) {
		double withdrawMoney;
		 withdrawMoney=sc.nextDouble();
		if(withdrawMoney<=balance) {
			
		balance=balance-withdrawMoney;
		Transaction history = new Transaction("withdraw",withdrawMoney);
		History[count--]=history;
		}
		else {
			System.out.println("Error!insufficient funds");
		}
		return balance;
	}


	

	public static double getBalance() {
		 return Account.balance=balance;
	}

	public static void setBalance() {
		Account.balance = balance;
	}

	public String getCardNumber() {
		return CardNumber;
	}
	public void previous() {
		System.out.println(History[count-1].getName()+": "+History[count-1].getAmount());
		count=count-1;
	}
	
	public void next() {
		System.out.println(History[count+1].getName()+": "+History[count+1].getAmount());
		count=count+1;
	}

	
}
