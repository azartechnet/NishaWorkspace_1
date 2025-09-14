class Student
{
	int id;
	String name;
	
	Student()
	{
		System.out.println("Default constructor");
	}
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("Your param constructor is::"+id+""+name);
	}
	Student(Student s)
	{
		id=s.id;
		name=s.name;
		System.out.println("Copy Constructor");
		
	}
	void display()
	{
		System.out.println("Your value is::"+id+""+name);
	}
}
public class ConstructorP1 {

	public static void main(String[] args) {
		
		new Student();
		Student s2=new Student(1001,"azar");
		
		Student s3=new Student(s2);
		s3.display();
		

	}

}
