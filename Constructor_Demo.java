package Harshad;

/**
 * @author Harsh
 *
 */
public class Constructor_Demo 
{
	
	private int id;
	private String name;
	public static String college_name="The College of Saint Rose";
	
	
	Constructor_Demo()
	{
		
		
	}
	
	public Constructor_Demo(int id, String name)
	{
		this.id=id;
		this.name=name;
		//this.college_name=college_name;
		
	}

	
	public void show()
	{
		
		System.out.println("Student Information:="+ id +" "+ name +" " + college_name);
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Constructor_Demo.college_name="The College of Saint Rose";
		Constructor_Demo cd=new Constructor_Demo(101,"Harsh");
		Constructor_Demo cd1=new Constructor_Demo(102,"Rahul");
		Constructor_Demo cd2=new Constructor_Demo(103,"Asha");
		Constructor_Demo cd3=new Constructor_Demo(104,"Bitti");
		
		cd.show();
		cd1.show();
		cd2.show();
		cd3.show();
		
		
	}

}
