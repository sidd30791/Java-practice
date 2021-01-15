class Casio{

	//Method Overloading - same name and same parameters are not accepted !
	public void add(int i, int j) {
		System.out.println(i+j);
	}
	public void add(int i, int j, int k) {
		System.out.println(i+j+k);
	}
	public void add(double i, double j) {
		System.out.println(i+j);
	}
}
public class MethodOverloading {
	public static void main(String args[]) {
		Casio obj = new Casio();
		obj.add(9, 9);
		obj.add(9, 9, 9);
		obj.add(9.9, 9.9); 
	}
}
