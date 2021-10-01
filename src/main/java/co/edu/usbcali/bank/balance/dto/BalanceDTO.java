package co.edu.usbcali.bank.balance.dto;

public class BalanceDTO {
	
	private Double balance;

	public BalanceDTO(Double balance) {
		super();
		this.balance = balance;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	

}
