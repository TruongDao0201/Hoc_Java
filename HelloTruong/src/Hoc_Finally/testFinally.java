package Hoc_Finally;

public class testFinally {

	public static void main(String[] args) {
		// try catch dùng để bắt lỗi or chặn lỗi trong viết code để tránh ảnh hưởng đến hệ thống   
		try {
			int x = 5;
			int y = 0;
			int z = x / y;
			System.out.println("Đã thực thi phép tính");
			System.out.println("z = "+ z);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("có lỗi rồi");
		}
		// finally cho dù lỗi hay không lỗi nó vẫn chạy câu lệnh
		finally {
			System.out.println("Xin cảm ơn!");
		}
		System.out.println("Kết thúc");
	}

}
