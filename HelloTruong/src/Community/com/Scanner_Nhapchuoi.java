package Community.com;

import java.util.Scanner;

public class Scanner_Nhapchuoi {

	public static void main(String[] args) {
		System.out.print("Mời bạn nhập chuỗi:");
		// Cú pháp nhập chuỗi từ bàn phím, áp dụng cách nhập liên tục giữa chuỗi và số
		String sc = new Scanner (System.in).nextLine();
		System.out.print("Mời bạn nhập số:");
		// Cú pháp nhập số từ bàn phím, áp dụng cách nhập liên tục giữa chuỗi và số
		int so = new Scanner (System.in).nextInt();
		System.out.println("Họ tên: " + sc);
		System.out.println("Tuổi: " + so);
	}
}
