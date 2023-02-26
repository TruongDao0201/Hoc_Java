package HocChuoi;

import java.util.StringTokenizer;

public class TimChuoi {

	public static void main(String[] args) {
		String s = "Đào Huy Trường Dễ Thương, Huy Trường là số 1 trong họ Đào uy tín";
		// indexOf là hàm tìm vị trí chuối từ đầu tiên trở xuống
		int vt1 = s.indexOf("Huy");
		System.out.println("Vị trí [Huy]: "+ vt1);
		// lastindexOf là hàm tìm vị trí chuỗi từ dưới lên
		int vt2 = s.lastIndexOf("Huy");
		System.out.println("Vị trí [Huy]: "+ vt2);
		// contains là hàm tìm chuỗi trong một dãy chuỗi
		if(s.contains("Dat") == true) {
			System.out.println("có chữ Dat trong chuỗi");
		}
		else {
			System.out.println("không có chữ Dat trong chuỗi");
		}

		if(vt1 == -1) {
			System.out.println("không tìm thấy vị trí chữ Huy");
		}
		else {
			System.out.println("Có tìm thấy vị trí chữ Huy");
		}
		
		// Cách đếm số lần xuất hiện chuỗi thì sử dụng hàm StringTokenNize
		StringTokenizer token = new StringTokenizer(s);
		int dem = 0;
		while(token.hasMoreTokens()) {
			String value = token.nextToken();
			// contains là so sánh tìm miễn sao có chuỗi, Equals là tìm phãi giống chĩnh xác chuỗi 
			if(value.contains("uy")) {
				dem++;
			}
		}
		System.out.println("Số lần xuất hiện chữ Trường trong dãy: "+ dem);
	}
}
