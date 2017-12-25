package Harshad;

public class Rectangle 
{

	public int perimeter(int l, int w) 
	{
		return (l + w) * 2;
	}

	public int area(int l1, int w1) 
	{
		return l1 * w1;
	}

	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle();
		r1.perimeter(10, 5);

		System.out.println("Perimeter:=" + r1.perimeter(10, 5));
		System.out.println("Area:-" + r1.area(10, 5));

	}

}