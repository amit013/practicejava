package javapractice;

class CustomWrapper {
	private int a;
	CustomWrapper(){}
	CustomWrapper(int a){
		this.a=a;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
@Override
public String toString() {
	return Integer.toString(a);
}
}

public class CheckCustomWrapper{
	public static void main(String[] args) {
		CustomWrapper obj=new CustomWrapper(10);
		System.out.println(obj);
	}
}
