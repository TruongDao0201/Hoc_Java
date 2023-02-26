package Community.com;

public class GhiChu {
	// ví dụ commnent 1 dòng
	/**
	 * Tính tổng: a + b = 0
	 * @param a - Hệ số a
	 * @param b - Hệ số b
	 */
	public static void PhuongTrinhBac1 (int a, int b) {
		var tong = a + b; 
		System.out.println("Tổng là: " + tong);
	}
	public static void main(String[] args) {
		PhuongTrinhBac1(5, 10);
	}
}

