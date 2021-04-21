package termproject;

import java.util.ArrayList;

public class Student {
	private String name;
	private int id;
	private double cgpa;
	private char freedomFighterStatus;
	private char minorityGroupStatus;
	private Registration reg;
	private int credittaken;
	public Student(String name,int id,double cgpa,char freedomFighterStatus, char minorityGroupStatus) {
		this.name=name;
		this.id=id;
		this.cgpa=cgpa;
		this.freedomFighterStatus=freedomFighterStatus;
		this.minorityGroupStatus=minorityGroupStatus;
		
	}
	public String getname() {
		return name;
	}
	public int getid() {
		return id;
	}
	public double getcgpa() {
		return cgpa;
	}
	public int getcredittaken() {
		return credittaken;
	}
	public char getfreedomFighterStatus() {
		return freedomFighterStatus;
	}
	public char getminorityGroupStatus() {
		return minorityGroupStatus;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setid(int id) {
		this.id=id;
	}
	public void setcgpa(double cgpa) {
		this.cgpa=cgpa;
	}
	public void makeNewRegistration() {
		Registration r1=new Registration();
		reg=r1;
	}
	public void setcredittaken(int credittaken) {
		this.credittaken=credittaken;
	}
	public void setfreedomFighterStatus(char freedomFighterStatus) {
		this.freedomFighterStatus=freedomFighterStatus;
	}
	public void setminorityGroupStatus(char minorityGroupStatus) {
		this.minorityGroupStatus=minorityGroupStatus;
	}
	public void addCourse(course y) {
		int maxcredit;
		
		if(cgpa>=3.5) {
			maxcredit=18;
			if(credittaken<=maxcredit && y.getnumofstudent()<y.getseatcapacity()) {
				setcredittaken(y.getcredit()+credittaken);
				if(credittaken<=maxcredit) {
					reg.addcourse(y);
					y.setnumofstudent( y.getnumofstudent()+1);
				}
				else
				{
					System.out.println(getname()+":"+"You cannot take "+y+".You exceed the "+maxcredit+" credit limit.");
				}
				
			}
			else if (credittaken<=maxcredit && y.getnumofstudent()>=y.getseatcapacity()) {
				System.out.println(y+" cannot be added.Seat is full !!");
			}
			else {
				System.out.println(getname()+":"+"You cannot take "+y+".You exceed the "+maxcredit+" credit limit.");
			}	
		}
		else
		{
			maxcredit=12;
			
			
			if(credittaken<=maxcredit && y.getnumofstudent()<y.getseatcapacity()) {
				setcredittaken(y.getcredit()+credittaken);
				if(credittaken<=maxcredit) {
					reg.addcourse(y);
					y.setnumofstudent( y.getnumofstudent()+1);
				}
				else
				{
					System.out.println(getname()+":"+"You cannot take "+y+".You exceed the "+maxcredit+" credits limit.");
				}
				
			}
			else if (credittaken<=maxcredit && y.getnumofstudent()>=y.getseatcapacity()) {
				System.out.println(y+" cannot be added.Seat is full !!");
			}
			else {
				System.out.println(getname()+":"+"You cannot take "+y+".You exceed the "+maxcredit+" credits limit.");
			}	
			
		}
		
		
	}
		public void dropCourse(course p) {
			reg.deletecourse(p);
			p.setnumofstudent( p.getnumofstudent()-1);
		}
		public Registration getRegistration() {
			return reg;
		}
		public void setDiscounts() {
			if (cgpa>3.5) {
				reg.setApplicationDiscounts(new AcademicExcellenceDiscount());
			}
			else if (freedomFighterStatus=='Y') {
				reg.setApplicationDiscounts(new FreedomFighterDiscount());
				
			}
			else 
			{
				reg.setApplicationDiscounts(new MinorityGroupDiscount());
			}
			
		}
		public String printRegisteredCourse() {
			ArrayList<course> newarray=reg.getcourselist();
			String q="";
			System.out.println("Course Id:     Course Title:");
			System.out.println("==============================================");
			for(int i=0;i<newarray.size();i++) {
				course r=newarray.get(i);
				String t=r.getid()+"         "+r.gettitle()+"\n";
				q=q+t;
			}
			return q+"==============================================";
			
		}
		public String getBillingInfo() {
			int a=reg.getGrandtotal()-reg.getDiscountAmount();
			return "Billing Info: (ID: "+getid()+")"+"\n -------------------------------"+"\n Total course Fees:  "+reg.getTotal()+"\n Extra Fees:      +   "+reg.getExtraFeeAmount()+"\n -------------------------------"+"\n Grand Total:     "+reg.getGrandtotal()+"\n Discount:   -     "+reg.getDiscountAmount()+"\n------------------------------- \nPayment Amount: "+a;
		}
		public String printRegistrationSlip() {
			int a=reg.getGrandtotal()-reg.getDiscountAmount();
			return "Registration Time: "+reg.getLocalDateTime()+"\n -------------------------------------"+"\n Name: "+getname()+", ID: "+getid()+", CGPA: "+getcgpa()+"\n -------------------------------------"+"\n"+printRegisteredCourse()+"\n"+getBillingInfo();
					
			
			
		}
		public String toString() {
			return "The student name is: "+getname()+" ID is:"+getid()+" Cgpa is: "+getcgpa()+" The freedom fighter status is "+getfreedomFighterStatus()+" The minority status is "+getminorityGroupStatus();
		}
	

}
