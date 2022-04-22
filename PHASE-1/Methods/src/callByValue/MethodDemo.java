package callByValue;

public class MethodDemo {
	int val = 150;
	int operation(int val) {
		val = val * 10 / 100;
		return val;
	}

	public static void main(String[] args) {
		MethodDemo d = new MethodDemo();
		
		System.out.println("Before operation of data "+ d.val);
		d.operation(100);
		System.out.println("After operation of data "+ d.val);
		
	}

}
