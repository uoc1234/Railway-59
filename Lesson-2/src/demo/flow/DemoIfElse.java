package demo.flow;

public class DemoIfElse {

	public static void main(String[] args) {
		int x = 20;
		int y = 10;

		if (x > y) {
			System.out.println("X là số lớn hơn");
		} else if (y > x) {
			System.out.println("Y là số lớn hơn");
		} else if (x == y) {
			System.out.println("X bằng Y");
		} else {
			System.out.println("Các trường hợp còn lại");
		}


		if (x > y) {
			System.out.println("X là số lớn hơn");
		} else {
			System.out.println("Y là số lớn hơn");
		}

		// Ternary (toán tử 3 ngôi)
		String results;
		results = (x > y) ? "X là số lớn hơn" : "Y là số lớn hơn hoặc bằng";
	}

}