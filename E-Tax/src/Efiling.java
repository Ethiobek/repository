public class Efiling {

	private char taxLevel;
	private double dailyIncom;

	public double getTaxAmount(double dailyIncome, char taxLevel) {
		double dd=dailyIncome*2;
		return dd;
		
	}

	public char getTaxLevel() {
		return this.taxLevel;
	}

	public void setTaxLevel(char taxLevel) {
		this.taxLevel = taxLevel;
	}

	public double getDailyIncom() {
		return this.dailyIncom;
	}

	public void setDailyIncom(double dailyIncom) {
		this.dailyIncom = dailyIncom;
	}
}
