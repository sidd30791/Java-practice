class Casio1{
	int num1;
	int num2;
	String operation;
	public Casio1() {
		num1 = 0;
		num2 = 0;
		operation = "NA";
	}
	public Casio1(int i) {
		num1 = i;
		num2 = 0;
		operation = "NA";
	}
	public Casio1(int i, int j) {
		num1 = i;
		num2 = j;
		operation = "NA";
	}
	public Casio1(int i, int j, String op) {
		num1 = i;
		num2 = j;
		operation = op;
	}
	
	
}
public class ClassOverloading {
	public static void main(String args[]) {
		//Casio1 obj = new Casio1(4,5,"Sid");

	}
}
