
public class SalaryIncome implements Income {
	private double income;
	public SalaryIncome(double income) {
		this.income = income;
	}
	@Override
	public double getIncome() {
		return this.income;
	}

}
