package HocChuoi;

public class sosanh_chuoi {

	public static void main(String[] args) {
		String s1 = "TRUONG";
		String s2 = "truong";
		// compareTo so sánh chuỗi có phân biệt in hoa - in thường
		int kq = s1.compareTo(s2);
		System.out.println(kq);
		// compareToIgnoreCase không phân biệt chữ in hoa - in thường
		int kq2 = s1.compareToIgnoreCase(s2);
		System.out.println(kq2);
		// so sánh equal không có phân biệt in hoa - in thường
		if(s1.equals(s2)) {
			System.out.println("s1 != s2");
		}else {
			System.out.println("s1 == s2");
		}
		// so sáng equalsIngnoreCase có phân biệt in hoa - in thường 
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("s1 != s2");
		}else {
			System.out.println("s1 == s2");
		}
	}
}
