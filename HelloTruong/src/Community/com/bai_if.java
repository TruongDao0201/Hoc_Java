package Community.com;

import java.util.Scanner;

public class bai_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời bạn nhập tháng:");
		int month = sc.nextInt();
		if(month == 0) {
			System.out.println("Bạn đã nhập sai");
		}
		else if (month == 1 || month == 3 || month == 7 ) {
			System.out.println("Tháng " + month + " có 31 ngày" );
		}
		else if(month == 2) {
			System.out.println("Tháng" + month + " có 28 hoặc 29 ngày" );
		}
		else
		{
			System.out.println("Tháng " + month + " có 30 ngày" );
		}
		// Toán tử 3 ngôi
		String a = (month % 2 == 0) ? "Tháng chẳn" : "Tháng lẻ";
		System.out.println("Kết quả chẳn lẻ: " + a );
	}

}
