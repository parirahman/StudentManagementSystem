package termproject;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class Registration implements Iterable<course> {
	private ArrayList<course> courselist= new ArrayList<course>();
	private ArrayList<IDiscountStrategy> applicableDiscounts= new ArrayList<IDiscountStrategy>();
	private IExtraFeeCalculator eFeeCalculator;
	private LocalDateTime date;
	Iterator<course> iterator = courselist.iterator();

	public Registration() {
	}
	@Override
	public Iterator<course> iterator() {
		return courselist.iterator();
	}
	public void addcourse(course c) {
		courselist.add(c);
	}
	public void deletecourse(course x) {
		Iterator<course> iterator = courselist.iterator();
		
		  while(iterator.hasNext()) { course y =iterator.next(); if (x.equals(y)) {
		  iterator.remove(); } }
		 
	}
	public  ArrayList<course> getcourselist() {
		return courselist;
	}
	public String getLocalDateTime() {
		date=LocalDateTime.now();
		String y=""+date;
		return y;
		
	}
	public void setApplicationDiscounts(IDiscountStrategy discountStrategy) {
		applicableDiscounts.add(discountStrategy);
	
	}
	public double getTotal() {
		double total = 0;
		int y;
		Iterator<course> iterator = courselist.iterator();
		while(iterator.hasNext()) {
		    y = iterator.next().getSubTotal();
		    total=total+y;
		   
		    }
		return total;
	}
	public int getExtraFeeAmount() {
		Admin a1=Admin.getInstance();
	    IExtraFeeCalculator eFeeCalculator= a1.getExtraFeeCalculator();
		return eFeeCalculator.getExtraAmount((int)getTotal());
	}
	public int getGrandtotal() {
		int grandtotal;
		grandtotal=(int)getTotal()+getExtraFeeAmount();
		return grandtotal;
	}
	public int getDiscountAmount() {
		int academicExcellenceDiscount=0;
		int freedomFighterDiscount=0;
		int minorityGroupDiscount=0;
		for(int i=0;i<applicableDiscounts.size();i++)
		{
			if (applicableDiscounts.get(i) instanceof AcademicExcellenceDiscount) {
				academicExcellenceDiscount=academicExcellenceDiscount+applicableDiscounts.get(i).getTotal(this);
			}
			else if (applicableDiscounts.get(i) instanceof FreedomFighterDiscount) {
				freedomFighterDiscount=freedomFighterDiscount+applicableDiscounts.get(i).getTotal(this);
			}
			else {
				minorityGroupDiscount=minorityGroupDiscount+applicableDiscounts.get(i).getTotal(this);
			}
		}
		if (academicExcellenceDiscount>freedomFighterDiscount && academicExcellenceDiscount> minorityGroupDiscount ) {
			return academicExcellenceDiscount;
			
		}
		else if (freedomFighterDiscount>academicExcellenceDiscount && freedomFighterDiscount> minorityGroupDiscount ) {
			return freedomFighterDiscount;
		}
		else if (minorityGroupDiscount>academicExcellenceDiscount &&  minorityGroupDiscount>freedomFighterDiscount) {
			return minorityGroupDiscount;
		}
		else {
			return 0;
		}
	
		
	}
	}
	
 
