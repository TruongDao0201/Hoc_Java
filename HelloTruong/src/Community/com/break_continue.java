package Community.com;

import java.util.Scanner;

public class break_continue {

	public static void main(String[] args) {
		// dùng Break thoát hẳn vòng lặp
//		while(true) {
//			System.out.print("Mời bạn nhập 1 số: ");
//			int num = new Scanner(System.in).nextInt();
//			
//			String ketQua = (num % 2 == 0) ? "Là số chẳn" : "Là số lẻ";
//			System.out.println("Kết quả: "+ ketQua);
//			
//			System.out.print("Bạn có tiếp tục c/k: ");
//			String chuoi = new Scanner(System.in).nextLine();
//			if(chuoi.equalsIgnoreCase("k")) {
//				break;
//			}
//		}
//		System.out.println("Chương trình kết thúc!");
//		
		
		// Dùng continue thoát khỏi vòng lập
		for (int i = 0; i < 10; i++) {
			if(i % 3 == 0)
				continue;
			System.out.println("Kết quả i: "+ i);
		}	
	}	
}
