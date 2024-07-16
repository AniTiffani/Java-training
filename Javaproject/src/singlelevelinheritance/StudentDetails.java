package singlelevelinheritance;

//child class

public class StudentDetails extends Student {
	public void display()
	{
		System.out.println("Student name is: "+name);
		System.out.println("Department: "+dept);
		System.out.println("Roll no: "+rollno);
	}
	public static void main(String[] args) {
		StudentDetails objChild=new StudentDetails();
		objChild.getDetails("Tiffani","ECE",001);
		objChild.display();
	}

}
