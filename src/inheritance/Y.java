package inheritance;

public class Y extends X {
	public void meth2() {
		System.out.println("child class");
	}

	public static void main(String[] args) {
		Y y =new Y();
		y.meth1();
		y.meth2();
		
	}

}
