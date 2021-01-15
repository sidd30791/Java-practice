class calcc{
	int numb1;
	int numb2;
	double numb3;
	int resultf; //instance variable
	
	public calcc() {
		numb1=5;
		numb2=2;
		numb3=55.55;
		System.out.println("inconst");
	}
	
	public calcc(int n) {
		numb1 = n;
	}
	
	public calcc(double m) {
		numb3 = m;
	}
	
}
public class ConstDemo {
	
	public static void main(String args[]) {
		
		
		calcc obj = new calcc(); //Constructor
		calcc obj1 = new calcc(77);
		calcc obj2 = new calcc(99.99);
				
		System.out.println(obj.numb1);
		System.out.println(obj1.numb1);
		System.out.println(obj2.numb3);
	}

}
