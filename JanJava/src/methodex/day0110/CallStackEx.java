package methodex.day0110;

public class CallStackEx {

	static void first() {
		second();
	}

	static void second() {
		System.out.println("second");
	}

	public static void main(String[] args) {
		first();
	}

}
