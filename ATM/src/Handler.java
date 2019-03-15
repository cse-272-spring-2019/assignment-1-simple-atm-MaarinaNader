
public class Handler {
	Account acc=new Account(0.0,"123789");	

	public Handler() {
	acc.getCardNumber();
	}
	
	
public boolean validate(String CardNumber) {
	if(acc.getCardNumber().equals(CardNumber)) {
		
	return true;

}
	else {
		return false;
	}

}
}


