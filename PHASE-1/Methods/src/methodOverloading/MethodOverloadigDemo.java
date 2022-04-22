package methodOverloading;

class Add{
	void sum(int x, int y) {
		System.out.println("Total= "+ (x + y));
	}
	void sum(int x, int y, int z) {
		System.out.println("Total= "+ (x + y + z));
	}
	
}

public class MethodOverloadigDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add add = new Add();
		add.sum(5, 4);
		add.sum(2, 5, 3);

	}

}

