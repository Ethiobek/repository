public class Payment extends User {

	private double amount;
	private boolean isPaid;

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean getIsPaid() {
		return this.isPaid;
	}

	public void setIsPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
}
