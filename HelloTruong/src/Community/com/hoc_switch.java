package Community.com;

import java.util.Scanner;

public class hoc_switch {

	public static void main(String[] args) {
		try (var sc = new Scanner(System.in)) {
			System.out.print("Mời bạn nhập tháng:");
			int month = sc.nextInt();
			
			// switch classic
//		switch (month) {
//			case 1:
//				System.out.println("Tháng lẻ");
//				break;
//			case 2:
//				System.out.println("Tháng chẳn");
//				break;
//			case 3:
//				System.out.println("Tháng lẻ");
//				break;
//			case 4:
//				System.out.println("Tháng chẳn");
//				break;
//			case 5:
//				System.out.println("Tháng lẻ");
//				break;
//			case 6:
//				System.out.println("Tháng chẳn");
//				break;
//			case 7:
//				System.out.println("Tháng lẻ");
//				break;
//			case 8:
//				System.out.println("Tháng chẳn");
//				break;
//			case 9:
//				System.out.println("Tháng lẻ");
//				break;
//			case 10:
//				System.out.println("Tháng chẳn");
//				break;
//			case 11:
//				System.out.println("Tháng lẻ");
//				break;
//			case 12:
//				System.out.println("Tháng chẳn");
//				break;
//			default:
//				System.err.println("Bạn nhập sai tháng");
//				break;
//		}
			
			//switch biến thể
			switch (month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 9:
				case 11:
					System.out.println("Tháng lẻ");
					break;
				case 4:
				case 6:
				case 8:
				case 10:
				case 12:
					System.out.println("Tháng chẳn");
					break;
				case 2:
					System.out.print("Mời bạn nhập năm:");
					int year = sc.nextInt();
					String result = (year % 4 == 0 && year % 100 !=0 || year % 400 == 0 ) ? "Năm nhuần tháng 2 có 29 ngày" : "Tháng 2 có 28 ngày ";
					System.out.println("Kết quả tháng 2: "+ result);
					break;
				default:
					System.err.println("Bạn nhập sai tháng");
				break;
			}
		}
	}
}
