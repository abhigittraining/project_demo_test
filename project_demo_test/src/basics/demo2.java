package basics;

public class demo2 {

	public void addition() {
		int a = 100;
		int b = 100;
		int sum = a + b;
		System.out.println(sum);
	}
	
	public void subtraction() {
		int a = 100;
		int b = 50;
		int sum = a - b;
		System.out.println(sum);
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		demo2 obj = new demo2();
		obj.addition();
		obj.subtraction();
	}
}
