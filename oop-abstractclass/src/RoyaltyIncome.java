
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome extends Income {
	private double income ;
	public  RoyaltyIncome (int income) {
		this.income = income;
	}
	@Override
	public double getIncome() {
		 return this.income* 0.8;
	}

}
