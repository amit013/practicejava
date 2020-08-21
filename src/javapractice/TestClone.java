package javapractice;

public class TestClone implements Cloneable{
	int id;
	String name;
	
	public TestClone(int id, String name) {
		
		this.id=id;
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		TestClone obj1=new TestClone(10,"name");
//		obj1.id=10;
//		obj1.name="name";
		
	
		TestClone obj2=(TestClone) obj1.clone();
		System.out.println(obj2.id);
		System.out.println(obj2.name);
	}

}
