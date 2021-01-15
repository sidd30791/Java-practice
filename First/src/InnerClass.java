class Outer{
	
	int a;
	public void show() {
		
		System.out.println("Inside Outter");
	}
	
	class inner{ //Outer$inner.class
		
		public void display() {
			
			System.out.println("Inside Inner Class");
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		
		Outer Obj = new Outer();
		Obj.show();
		
		Outer.inner Obj1 = Obj.new inner();
		Obj1.display();
	}

}
