# salah-21110309-programming
package proceduralfinal;

public class Procedural {

	public static void printSAL() {
		System.out.println("Welcome to my Procedural code");
	}

	public static void WelcomeSAL(String name) {
		System.out.println("Hello " + name + " To my procedural code ");
	}

	public static void sumnum(double x, double y) {
		double sum;
		sum = x + y ;
		System.out.println("The result of the sumation is " + sum);
	}

	public static void main(String[] args) {
		printSAL();
		WelcomeSAL("Salah Abu Snaineh ");
		String name = "Salah Abu Snaineh";
		WelcomeSAL(name);
		sumnum(7, 8.9);
	}

}
