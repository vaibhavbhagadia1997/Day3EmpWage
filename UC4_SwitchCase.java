package EmpWageComputation;

public class UC4_SwitchCase {
	public static final int Is_Full = 1;
	public static final int Is_Part = 2;
	public static void main(String[] args) {
	 
      int hours = 0;
      int Wage;
      int EmpStatus = (int) Math.floor(Math.random() * 10) % 3;
      	switch (EmpStatus) {
      	case 	Is_Full:
      			hours = 8;
      			break;
      	case    Is_Part:
      		    hours = 4;
      		    break;
      	default:
      		    hours = 0;
      		    
      	}
      	Wage = hours * 20;
      	System.out.println("your daily wage is:"+Wage);
	}
}