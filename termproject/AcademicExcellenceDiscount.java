package termproject;

public class AcademicExcellenceDiscount implements IDiscountStrategy {
	public int getTotal(Registration reg) {
		int disf=0;
		double dis=reg.getTotal()*0.20;
		disf=(int)dis+disf;
		return disf;
		
	}
	

}
