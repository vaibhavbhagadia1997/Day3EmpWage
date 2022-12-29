package EmpWageComputation;

public class UC3_PartTimeWage {

	public static void main(String[] args) {
		// constants
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_HOUR = 20;
		// variables
		int empHour = 0;
		int empWage = 0;
	    // computation
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_FULL_TIME)
			empHour = 8;
		else if (empCheck == IS_PART_TIME)
             empHour = 4;
		else 
			empHour = 0;
		empWage = empHour * EMP_RATE_HOUR;
		System.out.println("Emp Wage: " + empWage);
}
	}

