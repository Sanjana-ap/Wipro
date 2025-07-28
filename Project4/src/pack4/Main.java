package pack4;
class Calculator{
	
	static int powerInt(int n1,int n2) {
		return (int) Math.pow(n1, n2);
	}
	static double powerDouble(double n1,double n2) {
		return Math.pow(n1, n2);
	}
}
public class Main {
	public static void main(String args[]) {
 int pi = Calculator.powerInt(9, 2);
 System.out.println(pi);
 double pd=Calculator.powerDouble(2.5, 2);
 System.out.println(pd);
}
}