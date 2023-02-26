package Community.com;

import java.util.Scanner;

public class bai_For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập số: ");
		int number = sc.nextInt();
		int giaiThua = 1;
		
		for(int i = 1; i <= number; i++ ) {
			giaiThua = giaiThua * i;
		}
		System.out.println("Kết quả: "+ number + "! là: "+ giaiThua );
	}
}
