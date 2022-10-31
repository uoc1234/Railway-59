public class DemoTypeCasting {

	public static void main(String[] args) {
//		Nới rộng (widening): Là quá trình làm tròn số từ kiểu dữ liệu có kích thước nhỏ hơn
//		sang kiểu có kích thước lớn hơn. Kiểu biến đổi này không làm mất thông tin.
//		Ví dụ chuyển từ int sang float. Chuyển kiểu loại này có thế được thực hiện ngầm định bởi trình biên dịch.

		int i = 100;
		long l = i;    // không yêu cầu chỉ định ép kiểu
		float f = l;   // không yêu cầu chỉ định ép kiểu
		System.out.println("Giá trị Int: " + i); // Giá trị Int: 100
		System.out.println("Giá trị Long: " + l); // Giá trị Long: 100
		System.out.println("Giá trị Float:  " + f); // Giá trị Float: 100.0

//		Thu hẹp (narrowwing): Là quá trình làm tròn số từ kiểu dữ liệu có kích thước lớn hơn sang kiểu có
//		kích thước nhỏ hơn. Kiểu biến đổi này có thể làm mất thông tin như ví dụ ở trên. Chuyển kiểu loại này
//		không thể thực hiện ngầm định bởi trình biên dịch, người dùng phải thực hiện chuyển kiểu tường minh.
		double d = 100.04;
		long l2 = (long) d; // yêu cầu chỉ định kiểu dữ liệu (long)
		int i2 = (int) l; // yêu cầu chỉ định kiểu dữ liệu (int)

		System.out.println("Giá trị Double: " + d);
		System.out.println("Giá trị Long: " + l2);
		System.out.println("Giá trị Int:  " + i2);


	}

}
