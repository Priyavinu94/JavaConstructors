package depositConstructorApproach;

public class Deposit {

	String cardNumber;
	String cardNum;
	int pinNumber;
	int pinNum;
	double balance = 4647.78;
	double depAmount;

	Deposit(){
		System.out.println("Welcome!!!");
	}
	
	public Deposit(String cardNumber, int pinNumber) {
		this.cardNumber = cardNumber;
		this.pinNumber = pinNumber;
	}

	boolean validateCard(String cardNo, int pinNo) {

		if (cardNo.equals(cardNumber) && pinNo == pinNumber) {
			return true;
		}
		return false;
	}

	void setDepositAmt(double amount) {
		depAmount = amount;
	}

	double getDepositAmt() {
		return depAmount;
	}

	void setCardNum(String cardNo) {
		cardNum = cardNo;
	}

	String getCardNum() {
		return cardNum;
	}
	
	void setPin(int pinNo) {
		pinNum = pinNo;
	}

	int getPinNum() {
		return pinNum;
	}
	
	double getBalance() {
		return balance;
	}
	
	double depositMoney(double depositAmt, String cardNo, int pinNo) {

		if (validateCard(cardNo, pinNo)) {
			balance += depositAmt;
		} 
		return balance;
	}
}
