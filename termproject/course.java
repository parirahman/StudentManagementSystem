package termproject;

public class course {
	private String id;
	private String title;
	private int credit;
	private int tuitionpercredit;
	private int numofstudent;
	private int seatcapacity;
	public course(String id,String title,int credit,int tuitionpercredit) {
		this.id=id;
		this.title=title;
		this.credit=credit;
		this.tuitionpercredit=tuitionpercredit;
		seatcapacity=3;
	}
	public String getid() {
		return id;
	}
	public String gettitle() {
		return title;
	}
	public int getcredit() {
		return credit;
	}
	public int gettuitionpercredit() {
		return tuitionpercredit;
	}
	public int getnumofstudent() {
		return numofstudent;
	}
	public int getseatcapacity() {
		return seatcapacity;
	}
	public void setid(String id) {
		this.id=id;
	}
	public void settitle(String title) {
		this.title=title;;
	}
	public void setcredit(int credit) {
		this.credit=credit;
	}
	public void settutionpercredit(int tutionpercredit) {
		this.tuitionpercredit=tuitionpercredit;
	}
	public void setnumofstudent(int numofstudent) {
		this.numofstudent=numofstudent;
	}
	public void setseatcapacity(int seatcapacity) {
		this.seatcapacity=seatcapacity;
	}
	public int getSubTotal() {
		int Subtotal=getcredit()*gettuitionpercredit();
		return Subtotal;
	}
	
	  public String toString() { 
		  return  ""+id; 
	 
	  }
	 
	
	
	
	


}
