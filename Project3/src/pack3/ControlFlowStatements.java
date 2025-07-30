package pack3;
import java.util.Scanner;
public class ControlFlowStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter a number: ");
		a = sc.nextInt();
		if(a>=0) {
			System.out.println("Its a positive number.");
		}
		else
			System.out.println("Negative");
sc.close();
	}

}
