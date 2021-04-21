package termproject;

public class BDTaxAdapter extends BDTaxCalculator implements IExtraFeeCalculator {
	public BDTaxAdapter() {
		super();
	}
	public int getExtraAmount(int coursetotal) {
		double x;int y;
		x=calculateVatAmount(coursetotal);
		y=(int)x;
		return y;		
		
	}


}
