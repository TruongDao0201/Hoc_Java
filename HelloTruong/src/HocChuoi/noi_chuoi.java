package HocChuoi;

public class noi_chuoi {

	public static void main(String[] args) {
		String s1 = "Hạnh Phúc";
		String s2 = "Vô thường";
		
		// Nối chuỗi bằng dấu + => nhưng khi xử lý data lớn, nối chuỗi dấu + sẽ sinh ra obj chuỗi nên xử lý lâu 
		String s3 = s1 + " " + s2;
		System.out.println(s3);
		
		// Nỗi chuỗi bằng StringBuilder khuyến khích sử dụng khi xử lý tập tin lớn (data lớn)
		StringBuilder sb = new StringBuilder();
		sb.append(s1);
		sb.append(" ");
		sb.append(s2);
		System.out.println(sb.toString());
		
		// Nối chuỗi trong lớp StringBuilder
		StringBuilder sb1 = new StringBuilder("Đào");
		sb1.insert(3, " Huy Trường");
		System.out.println(sb1.toString());
	}
}
