
public class DemoError {
	public static void main(String[] args) {
		DemoError e1 = new DemoError();
		e1.processProactive(0);
		e1.processReactive(0);

	}

	double processReactive(int input) {
		try {
			return 10 / input;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return -1;
	}

	double processProactive(int input) { // ทำก่อนerror
		// Fail fast
		if (input == 0) {
			return -1;
		}
		return 10 / input;

	}

}
