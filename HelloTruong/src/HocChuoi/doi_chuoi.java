package HocChuoi;

public class doi_chuoi {

	public static void main(String[] args) {
		String chuoi1 = "Trường rất đẹp trai";
		// replace thay đổi chuỗi toàn bộ
		chuoi1 = chuoi1.replace("Trường", "Huy");
		System.out.println(chuoi1);
		// replaceFirst thay đổi chuỗi đầu tiên 
		String chuoi2 = "Trường rất đẹp trai, Trường rất giỏi";
		chuoi2 = chuoi2.replaceFirst("Trường", "Huy");
		System.out.println(chuoi2);
	}
}
