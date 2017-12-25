package Harshad;

class Calculator{
	public int sum(int n1,int n2)
	{
		return n1+n2;
	}
	
	public int power(int y1, int y2)
	{
		 int pow=1;
		 for(int i=0;i<y2;i++){
			 pow = pow * y1; 
		 }
		 return pow;
	}
}

public class Method_Calculator_power {
	public static void main(String[] args) {
		Calculator m=new Calculator();
		int n3=m.sum(10, 20);
		System.out.println("sum=" +n3);
			
		int y2=m.power(3,3);
		System.out.println("Power="+y2);
	
	}

}

