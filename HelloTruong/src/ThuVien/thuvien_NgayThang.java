package ThuVien;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class thuvien_NgayThang {

	public static void main(String[] args) {
		// Thư viện Calenda sử dụng code ngày tháng năm
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		System.out.println("Xuất năm: " + year);
		int month = cal.get(Calendar.MONTH);
		System.out.println("Xuất tháng: " + (month+1));
		int day = cal.get(Calendar.DATE);
		System.out.println("Xuất ngày: " + day);
		
		// Thay đổi ngày tháng năm của hệ thống theo ý user = hàm set
		cal.set(Calendar.YEAR, 1998);
		cal.set(Calendar.MONTH, 1-1);
		cal.set(Calendar.DATE, 2);
		
		
		// Lấy ngày tháng năm
		Date date = cal.getTime();
		System.out.println(date);
		
		// Cách chỉnh ngày tháng năm theo định dạng khu vực
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(date));
		
		// Định dạng ngày tháng có giờ phút giay (HH là dạng 24 giờ - hh là dạng giờ default);
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf2.format(date));
		
		// Định dạng ngày tháng có giờ phút giay phân biệt PM or AM (cú pháp aaa)
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
		System.out.println(sdf3.format(date));
	}

}
