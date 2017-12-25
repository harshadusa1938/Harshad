package Harshad;

public class StudentDemo 
{
		public static void main(String[] args) {
			Student.schoolName = "ABC";
			Student s1 = new Student(1,"Raj");
			Student s2 = new Student(2,"Ram");
			Student s3 = new Student(3,"Raja");
			
			s1.display();
			s2.display();
			s3.display();
		}

	}

	
	
