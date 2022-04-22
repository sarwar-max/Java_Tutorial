package simpleMethod;

public class MethodDemo {
	
	public int sum(int x, int y) {
		int res = x + y;
		return res;
	}

	public static void main(String[] args) {
		
		MethodDemo res = new MethodDemo();
		
		int ans = res.sum(8, 6);
		
		System.out.println("result = "+ ans);
	}
	

}
