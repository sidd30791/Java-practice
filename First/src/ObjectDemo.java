
class Calc{
	float num1;
	float num2;
	float result;
	
	public void Add(){
		result = num1 + num2;
	}
	public void Sub(){
		result = num1 - num2;
	}
	public void Multiply(){
		result = num1 * num2;
	}
	public void Divide(){
		result = num2/num1;
	}
}
public class ObjectDemo {

	public static void main(String args[]) {
		
		Calc obj1 = new Calc(); 
		obj1.num1=100;
		obj1.num2=50;
		
		obj1.Add();
		//obj.Sub();
	    //obj.Multiply();
	    //obj.Divide();
		
		System.out.println(obj1.result);
	}
}
