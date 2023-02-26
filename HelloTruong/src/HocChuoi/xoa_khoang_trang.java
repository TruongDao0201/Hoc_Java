package HocChuoi;

public class xoa_khoang_trang {

	public static void main(String[] args) {
		String s = " Đào Huy Trường Rất Đẹp Trai ";
		System.out.println("Chiều dài chuỗi: "+ s.length());
		// Hàm trim xóa khoảng trắng cả trái và phải
		s = s.trim();
		System.out.println("Chiều dài chuỗi đã xóa khoảng trắng: "+ s.length());
		
		// Phương thức xóa khoảng trắng bên trái
		String s1 = " Nguyễn thị thu là mẹ ";
		@SuppressWarnings("unused")
		int vtLeft = 0;
		int i = 0;
		for(i = 0; i < s1.length(); i++) {
			char chuoi1 = s1.charAt(i);
			if(chuoi1 == ' ') {
				vtLeft = i;
			}else {
				break;
			}
		}
		System.out.println("Chiều dài chuỗi: "+ s1.length()+ s1);
		s1 = s1.substring(i);
		System.out.println("Chiều dài chuỗi đã xóa khoảng trắng: "+ s1.length()+ s1);
		
		//Phương thức xóa khoảng trắng bên phải
		String s2 = " Đào Văn Còn là ba ";
		int vtRight = 0;
		i=0;
		for(i = s2.length()-1; i >= 0; i-- ) {
			char chuoi2 = s2.charAt(i);
			if(chuoi2 == ' ') {
				vtRight = i;
			}
			else {
				break;
			}
		}
		System.out.println("Chiều dài chuỗi: "+ s2.length()+ s2);
		s2 = s2.substring(0, vtRight);
		System.out.println("Chiều dài chuỗi đã xóa khoảng trắng: "+s2);
	}
}
