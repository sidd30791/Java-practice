
//Is - A      HAS - A

class Calculator { //superclass or parent class
	public int add(int i, int j) {
		return i+j;
	}
}

class AdvanceCalc extends Calculator{ //subclass or child class 
	public int sub(int k, int l) {
		return k - l; 
	}
	
}

class vvrycal extends AdvanceCalc {
	public int mul(int i, int j) {
		return i*j;
	}
}

public class InheritanceDemo {

	 public static void main(String args[]) {
		 
		 AdvanceCalc cl = new AdvanceCalc();
		 int result1 = cl.add(2, 2);
		 int result2 = cl.sub(5, 3);
		 System.out.println(result1);
		 System.out.println(result2);
		 
		 System.out.println("================");
		 
		 vvrycal cl2 = new vvrycal();
		 int result12 = cl2.add(2, 2);
		 int result22 = cl2.sub(5, 3);
		 int result32 = cl2.mul(5, 3);
		 System.out.println(result12);
		 System.out.println(result22);
		 System.out.println(result32);
		 
	 }
}
