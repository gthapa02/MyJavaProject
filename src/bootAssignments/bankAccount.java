package bootAssignments;

import java.util.Scanner;

public class bankAccount {

public static void main(String[] args) throws InSufficientBalanceException {
		
		float balance = 600;
		boolean cont = false;
		do {
		System.out.println("Enter Withdrawing Amount");
		Scanner sc = new Scanner(System.in);
		try {
		float withdrawing = Float.parseFloat(sc.next());
		if(withdrawing > balance) {
			throw new InSufficientBalanceException("InSufficient Balance Exception Encountered!");
		}
		balance = balance - withdrawing;
		System.out.println("New balance is: "+ balance+"\n");
		System.out.println("Do you want to continue? Y/N");
		String con = sc.next();
		if(con.equals("Y") || con.equals("y")) {
			cont = true;
		}
		}catch(NumberFormatException e) {
			System.out.println("Enter proper balance in number.");
		}
		}while(cont);
		
		System.out.println("Program Terminated");
	}
	

}
