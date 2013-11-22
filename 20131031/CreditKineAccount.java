
public class CreditKineAccount extends Account{
	int creditLine;
	

	CreditKineAccount(String accountNo, String ownerName
		, int balane, int creditLine){
		super(accountNo,ownerName,balance);
		this.creditLine = creditLine;
		
	}


	@Override
	int withdraw(int amount) throws Exception {
		super.withdraw(amount);
		if((this.balance+this.creditLine) < amount){
			throw new Exception("������ �Ұ����մϴ�.");
		}
		balance -= amount;
		return amount;
			
	}
}


