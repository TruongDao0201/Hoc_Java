package Community.com;

public class ToanTu {

	public static void main(String[] args) {
		double DTB = 8;
		System.out.println("Điểm trung bình: " + (DTB > 7 ? "Học tốt" : "Học tệ"));	//áp dụng toán tử 3 ngôi
		
		// Toán tử so sánh
		boolean kq = (5<7) || (7>8) || (9==9);
		System.out.println("Kết quả: " + kq);
		boolean kq2 = (5<7) && (7>8) && (9==9);
		System.out.println("Kết quả: "+ kq2);
	}
}
