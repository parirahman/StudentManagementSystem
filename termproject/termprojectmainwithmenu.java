package termproject;

public class termprojectmainwithmenu {

	public static void main(String[] args) {
		course CSE115 = new course("CSE115", "Programming Language-I", 3, 6000);
		course CSE173 = new course("CSE173", "Discrete Mathematics", 3, 6000);
		course CSE215= new course("CSE215", "Programming Language-II", 3, 6000);
		course CSE225 = new course("CSE225", "Data Structures and Algorithms", 3, 6000);
		course CSE231 = new course("CSE231", "Digital Logic Design", 3, 6000);
		course CSE311 = new course("CSE311", "Database Systems", 3, 6000);
		course CSE323 = new course("CSE323", "Operating Systems Design", 3, 6000);
		course CSE373 = new course("CSE373", "Design and Analysis of Algorithms", 3, 6000);

		Student s1 = new Student("Farhan Islam", 1631728042, 2.70, 'Y', 'N');
		Student s2 = new Student("Sadia Sultana", 1821347042, 3.44, 'N', 'Y');
		Student s3 = new Student("Sanjida Akter", 2021746042, 3.65, 'N', 'N');
		Student s4 = new Student("Farhan Bhuiyan", 1923147042, 3.94, 'N', 'N');
		Student s5 = new Student("Mahmudul Hoque", 1524137042, 2.14, 'Y', 'Y');
		Admin a1= Admin.getInstance();
		a1.offerCourse(CSE115);
		a1.offerCourse(CSE173);
		a1.offerCourse(CSE215);
		a1.offerCourse(CSE225);
		a1.offerCourse(CSE231);
		a1.offerCourse(CSE311);
		a1.offerCourse(CSE323);
		a1.offerCourse(CSE373);
		a1.publishoffercourse();
		s1.makeNewRegistration();
		s1.addCourse(CSE115);
		s1.addCourse(CSE173);
		s2.makeNewRegistration();
		s2.addCourse(CSE115);
		s2.addCourse(CSE215);
		s2.addCourse(CSE225);
		s3.makeNewRegistration();
		s3.addCourse(CSE115);
		s3.addCourse(CSE225);
		s3.addCourse(CSE311);
		a1.seeCourseStatus();
		s4.makeNewRegistration();
		s4.addCourse(CSE115);
		s4.addCourse(CSE225);
		s5.makeNewRegistration(); 
		s5.addCourse(CSE115);
		s5.addCourse(CSE173);
		s5.addCourse(CSE215);
		a1.increaseSeatCapacity(CSE115,2);
		s4.addCourse(CSE115);
		s5.addCourse(CSE115);
		System.out.println();
		a1.seeCourseStatus();
		s3.addCourse(CSE173);
		s3.addCourse(CSE215);
		s3.addCourse(CSE231);
		s3.addCourse(CSE323);
		s5.addCourse(CSE311);
		s5.addCourse(CSE373);
		System.out.println();
		a1.seeCourseStatus();
		s3.dropCourse(CSE311);
		System.out.println(s3.printRegisteredCourse());
		s1.setDiscounts();
		System.out.println(s1.getBillingInfo());
		s2.setDiscounts();
		System.out.println(s2.getBillingInfo());
		s3.setDiscounts();
		a1.setExtraFeeCalculator(new BDTaxAdapter());
		System.out.println(s3.getBillingInfo());
		s4.setDiscounts();
		System.out.println(s4.getBillingInfo());
		s5.setDiscounts();
		System.out.println(s5.printRegistrationSlip());
		


	}

}
