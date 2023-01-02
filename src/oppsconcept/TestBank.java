package oppsconcept;

public class TestBank {

	public static void main(String[] args) {

		HSBCBank h=new HSBCBank();
		h.credit();
		h.debit();
		h.transferMoney();
		h.educationLoan();
		h.carLoan();
		//System.out.println(h.min_bal);
		System.out.println(USBank.min_bal);
		h.mutualFunds();
		System.out.println("============");
		
		USBank u=new HSBCBank();  // dynamic polymorphism
		u.credit();
		u.debit();
		u.transferMoney();
		System.out.println(u.min_bal);
	
	
	}
	
	
	
	
	

}
