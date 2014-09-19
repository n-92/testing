import java.util.Scanner;


public class MySecondProject {

	static final int gradeAmax = 899;
	static final int gradeAmin = 700;
	static final int gradeBmax = 799;
	static final int gradeBmin = 600;
	static final int gradeCmax = 649;
	static final int gradeCmin = 500;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the salary: ");
		int salary = scanner.nextInt();
		System.out.print("Enter the merit point: ");
		int merit = scanner.nextInt();
		
		System.out.printf("Salary: %d, merit: %d --Grade: %c",salary,merit,returnGrade(salary,merit));
		
	}
	public static char returnGrade(int salary, int merit){
		char c = 'x';
		if (salary>=gradeCmin && salary <=gradeCmax){
			if (merit >= 10 && salary >600)
				c= 'B';
			else 
				c= 'C';
		}
		else if (salary>gradeBmin && salary<gradeBmax){
			if (merit < 10 && salary <=649)
				c= 'C';
			else 
				c= 'B';
		}
		else if (salary>gradeAmin){
			if (merit < 20 && salary <=799)
				c= 'B';
			else 
				c= 'A';
		}
	
		return c;
		
	}

}
