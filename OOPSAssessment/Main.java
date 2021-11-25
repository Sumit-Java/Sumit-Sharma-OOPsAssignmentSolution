package OOPSAssessment;

public class Main {

	public static void main(String[] args) {
		/* Here in this Solution, we have been using the hierarchical Inheritance concept
		and run-time polymorphism or dynamic binding or method over-riding*/
		
		//Object initialization for HR, Admin and IT department
		AdminDepartment AD=new AdminDepartment();
		// Respective method calling using defined Objects of each class.
		System.out.println("Welcome to " +AD.departmentName());
		System.out.println(AD.getTodaysWork());
		System.out.println(AD.getWorkDeadline());
		System.out.println(AD.isTodayAHoliday());
		System.out.println(); // Adding a new line. 
		
		HrDepartment HD=new HrDepartment();
		
		System.out.println("Welcome to " +HD.departmentName());
		System.out.println(HD.doActivity());
		System.out.println(HD.getTodaysWork());
		System.out.println(HD.getWorkDeadline());
		System.out.println(HD.isTodayAHoliday());
		System.out.println();
		
		TechDepartment TD=new TechDepartment();
		
		System.out.println("Welcome to " +TD.departmentName());
		System.out.println(TD.getTodaysWork());
		System.out.println(TD.getWorkDeadline());
		System.out.println(TD.getTechStackInformation());
		System.out.println(TD.isTodayAHoliday());
		
	}

}
