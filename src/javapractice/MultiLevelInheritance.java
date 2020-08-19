package javapractice;
class Animal{
	void eat() {
		System.out.println("Eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking");
	}
}
class Puppy extends Dog{
	void weep() {
		System.out.println("meow meow..");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy c = new Puppy();
		c.eat();
		c.weep();
		c.bark();
		
	}

}
