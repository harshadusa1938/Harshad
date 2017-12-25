package Harshad;

public class Student {
	

	  private int id;
	  private String name;
	  public static String schoolName;
	 
	 /*static{
		 schoolName = "XYZ";
	 } */
	 
	public Student(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}
	public void display(){
		System.out.println("ID="+id);
		System.out.println("name="+name);
		System.out.println("School Name="+schoolName);
	}
	}


