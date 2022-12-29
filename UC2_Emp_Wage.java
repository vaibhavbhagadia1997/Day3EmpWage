package EmpWageComputation;

public class UC2_Emp_Wage {
	
	public static void main(String[] args) {
		// constants
			int IS_FULL_TIME = 1;
			int EMP_RATE_HOUR = 20;
			// variables
			int empHour = 0;
			int empWage = 0;
			// computation
			double empCheck = Math.floor(Math.random() * 10 % 2);
			if (empCheck == IS_FULL_TIME)
				empHour = 8;
			else 
				empHour = 0;
			empWage = empHour * EMP_RATE_HOUR;
			System.out.println("Emp Wage; " + empWage);
			
	}
}
