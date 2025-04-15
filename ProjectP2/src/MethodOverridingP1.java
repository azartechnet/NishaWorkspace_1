//Parent class
class Animal
{
	void sound()
	{
		System.out.println("Animal makes a sound");
	}
}
//child class
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dog barks");
	}
}
public class MethodOverridingP1 {

	public static void main(String[] args) {
		
		Animal my1=new Animal();
		Animal my2=new Dog();
		my1.sound();
		my2.sound();

	}

}
