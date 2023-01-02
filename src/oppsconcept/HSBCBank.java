package oppsconcept;

public class HSBCBank implements USBank, BrazilBank{ // we are achieving multiple inheritance  

	@Override
	public void credit() {
		System.out.println("Hsbc===== credit");
		
	}

	@Override
	public void debit() {
		System.out.println("Hsbc===== debit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("Hsbc===== transferMoney");
		
	}
	
	public void educationLoan() {
		System.out.println("Hsbc===== educationLoan");
	}
	
	public void carLoan() {
		System.out.println("Hsbc===== carLoan");
	}

	@Override
	public void mutualFunds() {
		System.out.println("Hsbc===== mutualFunds");
	}

}
