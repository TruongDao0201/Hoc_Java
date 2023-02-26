package ThuVien;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Thuvien_Dulieuso {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Mời bạn nhập điểm toán:");
//		double toan = sc.nextDouble();
//		System.out.print("Mời bạn nhập điểm lý:");
//		double ly = sc.nextDouble();
//		System.out.print("Mời bạn nhập điểm hóa:");
//		double hoa = sc.nextDouble();
//		
//		double dtb = (toan + ly + hoa) / 3;
//		System.out.println("Điểm trung bình:"+ dtb);
//		
//		// Cách sử dụng thư viện DecimalFormat để có kết quả đẹp hơn
//		DecimalFormat dcf = new DecimalFormat("#,##");
//		System.out.println("Điểm trunng bình đã chỉnh lại:" + dcf.format(dtb));
		
		//Cách sử dụng thư viện DecimalFormatSymbols thường dùng cho tiền tệ or con số lớn
		int x = 56000000;
		DecimalFormat dcf = new DecimalFormat("#,###");
		DecimalFormatSymbols dcfs = new DecimalFormatSymbols(Locale.getDefault());
		dcfs.setGroupingSeparator('.'); // lệnh chỉnh sửa ký tự hiển thị 
		dcf.setDecimalFormatSymbols(dcfs);
		System.out.println("Kết quả x chưa chỉnh sửa: " + x);
		System.out.println("Kết quả biến x đã chỉnh sửa: " + dcf.format(x));
	}

}
