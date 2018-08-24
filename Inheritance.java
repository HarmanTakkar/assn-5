class Animal
{
	String breed="Small Spitz";
	String color="Brown";
	public void speak()
	{
		System.out.println("Animal Breed -"+breed);
		System.out.println("Animal Color -"+color);	
	}
}
class Dog extends Animal
{
	public void speak()
	{
		System.out.println("Barking...");
	}
}
class Cat extends Animal
{
	public void speak()
	{
		System.out.println("Meowing...");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.speak();
		a=new Dog();
		a.speak();
		a=new Cat();
		a.speak();
		
		

	}

}
