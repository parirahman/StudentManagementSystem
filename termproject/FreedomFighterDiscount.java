package termproject;

public class FreedomFighterDiscount implements IDiscountStrategy {
	public int getTotal(Registration reg) {
		int disf=0;
		double dis=reg.getTotal()*0.25;
		disf=(int)dis+disf;
		return disf;	
	}


}
