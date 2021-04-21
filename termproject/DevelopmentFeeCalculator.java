package termproject;

public class DevelopmentFeeCalculator implements IExtraFeeCalculator{
public int getExtraAmount(int coursetotal) {
	int devf=0;
	double dev=coursetotal*0.10;
	devf=(int)dev+devf;
	return devf;
		
	}
		

}
