
class Cal{
	public int add(int ... n) { //reach as an array // variable length arguments
		 
		int sum=0;
		for(int i : n) {
			sum = sum + i;
		}
		return sum;
	}
}

public class VaragsDemo {
	
	public static void main(String args[]) {
		Cal objj = new Cal();
		
		System.out.println(objj.add(3,4,5,6,7,8,9,1));
	}


}
