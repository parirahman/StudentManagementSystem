package termproject;

import java.util.ArrayList;

public class Admin {
	private currentofferedcourse newcourse;
	private IExtraFeeCalculator eFeeCalculator;
	private static Admin instance; 
	
	
	public Admin() {
		 currentofferedcourse b=new currentofferedcourse();
		 newcourse=b;
		 eFeeCalculator=new DevelopmentFeeCalculator();
		
		
	}
	public static Admin getInstance() { 
		if(instance == null) 
		{ instance = new Admin(); 
		} 
		return instance;
	}
	
	
	  public void offerCourse(course x) {
		 
		  newcourse.addcourse(x);
	  
	  } 
	  public void publishoffercourse() {
		  ArrayList<course> parray=newcourse.getcourselist();
		  for(int i = 0; i < parray.size(); i++) 
	    	{ 
	    		System.out.println(i+1+". "+parray.get(i)+"\n"); 
	    	} 	
	  
	  }
	  public void increaseSeatCapacity(course p,int size) {
		  p.setseatcapacity(p.getseatcapacity()+size);	  
	  }
	  public void seeCourseStatus() {
		  ArrayList<course> parray=newcourse.getcourselist();
		  for(int i=0;i < parray.size();i++) {
				System.out.println("Course ID: "+parray.get(i).getid()+", Seat Capacity: "+parray.get(i).getseatcapacity()+",Number of Students: "+parray.get(i).getnumofstudent()+"\n");
				
			}  
	  }
	  public void setExtraFeeCalculator(IExtraFeeCalculator eFeeCalculator) {
		  this.eFeeCalculator=eFeeCalculator;
		  
	  }
	  public IExtraFeeCalculator getExtraFeeCalculator() {
		  return eFeeCalculator;
	  }
	  
	 

}
