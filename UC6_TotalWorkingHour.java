package EmpWageComputation;

import java.util.Scanner;
import java.util.Random;

public class UC6_TotalWorkingHour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Is_Present = 1;
		int Wage;
		double EmpStatus = Math.floor(Math.random() * 10 % 2);
		if (EmpStatus == Is_Present) {
			System.out.println("Ener how many hours worked: ");
			int hours = input.nextInt();
			Wage = hours * 20;
			System.out.println("wage is" + Wage);
		} else
			System.out.println("Emplyoee is absent");
	}
}
