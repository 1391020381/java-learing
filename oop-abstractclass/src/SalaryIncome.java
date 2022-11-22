
public class SalaryIncome extends Income{
	private int income;
	public  SalaryIncome(int income) {
		this.income = income;
	}
	@Override
	public double getIncome() {
		return this.income;
	}
}
