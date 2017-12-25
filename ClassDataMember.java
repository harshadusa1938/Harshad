package Harshad;

public class ClassDataMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassDataMember_X.a=10;
	       //className.methodName()
		ClassDataMember_X.display();
	       
	       //Non static data member access
		ClassDataMember_X x = new ClassDataMember_X();
	       x.b = 20;
	       x.print();
	}

}
