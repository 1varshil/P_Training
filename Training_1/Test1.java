
abstract class Animal {
	
	String name;
	int age;
	public abstract void makeSound();
}

class Dog1 extends Animal
{
	 public void makeSound()
	 {
		 System.out.println("Bhau Bhau");
	 }
}

class Cat1 extends Animal{
	public void makeSound() {
		System.out.println("Myau Myau");
	}
}

class Test1{
	
	public static void main(String args[])
	{
		Dog1 d1 = new Dog1();
		Cat1 c1 = new Cat1();
//		d1.makeSound();
		c1.makeSound();
		
		
	}
}
