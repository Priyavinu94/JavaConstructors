package accessModifier;

public class BankAccount {

	private String accountName;
	private long accountSIN;
	private long phoneNo;

	BankAccount() {
		// No argument constructor
	}

	public BankAccount(String accountName, long accountSIN, long phoneNo) {
		this.accountName = accountName;
		this.accountSIN = accountSIN;
		this.phoneNo = phoneNo;
	}
	
	public String getName() {
		return accountName;
	}

	public long getSIN(boolean isAuthorised) {
		if (isAuthorised) {
			return accountSIN;
		}
		return 0;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		if (phoneNo != 0) {
			this.phoneNo = phoneNo;
		}
	}

}
