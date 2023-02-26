package HocChuoi;

public class hoa_thuong {

	public static void main(String[] args) {
		// toUpperCase in thường => in hoa
		String s1 = "dao huy truong";
		String kq =s1.toUpperCase();
		System.out.println(kq);
		
		// in thường => in hoa ở vị trí bất kì
		String S1 = s1.replaceFirst((s1.charAt(0)+""),
				(s1.charAt(0)+"").toUpperCase());
		System.out.println(S1);
		
		// toLowerCase in hoa => in thường
		String s2 = "DAO HUY TRUONG";
		String kq1 = s2.toLowerCase();
		System.out.println(kq1);
		
		// in hoa => in thường ở vị trí bất kì
		String S2 = s2.replaceFirst((s2.charAt(0)+""),
				(s2.charAt(0)+"").toLowerCase());
		System.out.println(S2);
		
		// Sử dụng toCharArray để chuỗi thành mảng => lấy vị trí bất kì để in hoa or in thường
		String s3 = "Hanh Phuc Vo Thuong";
		char[] arr = s3.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			System.out.printf((arr[0]+"").toLowerCase());
		}
	}
}
