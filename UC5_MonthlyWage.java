package EmpWageComputation;

public class UC5_MonthlyWage {
public static final int Is_Part_Time = 1;
public static final int Is_Full_Time = 2;
public static final int Emp_Rate_Per_Hour = 20;
public static final int Num_Of_Working_Days = 20;

	public static void main(String[] args) {
		// variables
		int empHour = 0;
		int	empWage = 0;
		int totalEmpWage = 0;
		// computation
		for (int i=1;i<=20;i++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case Is_Part_Time:
				empHour = 4;
				break;
			case Is_Full_Time:
				empHour = 4;
				break;
			default:
				empHour = 0;
			}
			empWage = empHour * Emp_Rate_Per_Hour;
			totalEmpWage += empWage;
			System.out.println("Emp Wage: " + empWage);
		}
		System.out.println("Total Emp Wage:" + totalEmpWage);

	}

}
