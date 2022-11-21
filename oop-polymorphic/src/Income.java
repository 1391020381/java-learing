
public class Income {

	protected double income;
	// 构造函数
	public Income(double income) {
		this.income = income;
	}

	public double getTax() {
		return income * 0.1; // 税率10%
	}

}
