
public class ArrayDemo {

//	public ArrayDemo() {
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		 int ary[] = new int[5];
		 
		 ary[0]=0;
		 ary[1]=1;
		 ary[2]=2;
		 ary[3]=3;
		 ary[4]=4;
		 for (int i=0;i<5;i++) {
			 System.out.println(ary[i]);
		 }
		 
		 int ary1[] = {1,3,4,5,6,7,8};
		
		 for (int i=0;i<6;i++) {
			 System.out.println(ary1[i]);
		 }
		 
		 
		 System.out.println("-----------------");
		 
		 int twodarry[][] = {
				 {1,2,3,4,5},
				 {6,7,8,9,10},
				 {11,12,13,14,15}
		 };
		 
		 for(int n=0; n<3; n++) {
			 
			 for(int m=0; m<5; m++) {
				 System.out.print(" " + twodarry[n][m]);
			 }
			 System.out.println();
		 }
		 
		 System.out.println("2d array print enhanced for loop");
		 
		 for( int c[] : twodarry) {
			 for (int e : c) {
				 System.out.print(" " + e);
			 }
			 System.out.println();
		 }
		 
		 
		 System.out.println("-----------------");
		 
		 int y[] = {2,4,5,6,7,8,9,0};
		 
		 for (int k : y) {
			 System.out.print(k);
			 
		 }
		 
	}

}
