package termproject;

public class MinorityGroupDiscount  implements IDiscountStrategy {
	public int getTotal(Registration reg) {
		int disf=0;
		double dis=reg.getTotal()*0.10;
		disf=(int)dis+disf;
		return disf;
		
	}


}
