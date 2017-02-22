package lab1;
// Natalie Russo, Rebecca Schwartz, Mike Rawding
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	double monthlysaving;
	double yearstowork;
	double returnwhileworking;
	double moneyneeded;
	double yearsretired;
	double annualreturn;
	double requiredincome;
	double monthlySSI;
	
	//these are the variables that will be obtained by the user and calculated
	
	System.out.println("Enter years you will work? ");
	yearstowork = input.nextDouble();
	
	
	do{
		System.out.println("What is the expected annual return while working? (Enter value 0 to 20)");
	
	returnwhileworking =input.nextDouble();
	}while (returnwhileworking < 0 || returnwhileworking > 20);
	// do while loop is used in order to ensure a valid entry is input into the system
	
	System.out.println("How long do you want to draw?");
	yearsretired = input.nextDouble();
	
	do{
		System.out.println("What is your annual return once retired? (Enter a value 0 to 3)");
	
	annualreturn = input.nextDouble();
	}while (annualreturn < 0 || annualreturn > 3);
	
	// do while loop is used in order to ensure a valid entry is input into the system, a value from 0 to 3
	
	System.out.println("What is your required income?");
	requiredincome = input.nextDouble();
	
	System.out.println("What is your expected SSI income?");
	monthlySSI = input.nextDouble();
	
	double r = (annualreturn/100)/12;
	double n = (yearsretired*12);
	
	moneyneeded = (requiredincome - monthlySSI)*((1-(Math.pow((1+r),-n)))/r);
	// formula for Present Value of Annuity
	
	double r1 = (returnwhileworking/100)/12;
	double n1 = (yearstowork*12);
	
	monthlysaving = (moneyneeded*r1)/(Math.pow((1+r1), n1)-1);
	//formula to calculate Future Value of Annuity
	
	System.out.printf("Money needed to be saved: $%10.2f\n", moneyneeded);
	System.out.printf("Amount needed to be saved monthly: $%10.2f", monthlysaving);
	input.close();
	//system gives user total money needed to be saved and how much to save each month
	}
	
}
