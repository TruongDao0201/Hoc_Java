package ThuVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class baitap_NhapThangNam {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int yearNow = cal.get(Calendar.YEAR);
		
		System.out.print("Moi nhap năm sinh (dd/MM/yyyy):");
		String ns = new Scanner(System.in).nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date birtday = sdf.parse(ns);
			// Đổi ngày tháng năm
			cal.setTime(birtday);
			int yearNS = cal.get(Calendar.YEAR);
			
			int tuoi = yearNow - yearNS;
			System.out.println("Tuổi của bạn:" + tuoi);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
