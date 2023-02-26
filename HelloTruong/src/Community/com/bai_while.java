package Community.com;

import java.util.Scanner;

public class bai_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời bạn nhập 1 số: ");
		int number = sc.nextInt();
		int giaiThua = 1;
		int i = 1;
		
		// Cú pháp vòng lặp While
//		while(i <= number) {
//			giaiThua = giaiThua * i;
//			i++;
//		}
//		System.out.println("Kết quả: "+ number + "! "+ giaiThua);
		
		// Cú pháp vòng lặp do while
		do {
			giaiThua = giaiThua * i;
			i++;
		}while(i <= number);
		System.out.println("Kết quả: "+ number + "! "+ giaiThua);
	}
}
