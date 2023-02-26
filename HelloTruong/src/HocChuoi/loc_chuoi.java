package HocChuoi;

public class loc_chuoi {

	public static void main(String[] args) {
		String s = "Đào Huy Trường Dễ Thương";
		// lọc chuỗi từ vị trí trái sang phải
		String s1 = s.substring(8);
		System.out.println(s1);
		// lọc chuỗi có 2 đối số
		String s2 = s.substring(8, 14);
		System.out.println(s2);
		// lọc chuỗi 2 đối số khi đối số đầu là 0
		String s3 = s.substring(0, 14);
		System.out.println(s3);
	}

}
