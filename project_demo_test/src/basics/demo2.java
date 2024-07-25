package basics;

public class demo2 {

	public void addition() {
		int a = 100;
		int b = 100;
		int add = a + b;
		System.out.println(add);
	}
	
	public void subtraction() {
		int a = 100;
		int b = 50;
		int sub = a - b;
		System.out.println(sub);
		System.out.println("hello");
	}
	
	public void multiplication() {
		int a = 100;
		int b = 50;
		int multi = a * b;
		System.out.println(multi);
		System.out.println("hello");
	}
	
	public void division() {
		int a = 100;
		int b = 50;
		int div = a / b;
		System.out.println(div);
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		demo2 obj = new demo2();
		obj.addition();
		obj.subtraction();
	}
}
