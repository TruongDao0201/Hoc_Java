package PT_Bac2;

import java.util.Scanner;

public class Phuong_Trinh_Bac_2 {
	/**
	 * 
	 * @param a - hệ số a
	 * @param b - hệ số b
	 * @param c - hệ số c
	 * Phương Trình Bậc 2: ax^2 + bx + c = 0
	 */
	public static void PhuongTrinhBac2(double a, double b, double c) {
		if(a == 0) {
			System.out.println("Phương trinh bậc 1");
			if(b == 0  && c == 0) {
				System.out.println("Phường trình vô số nghiệm");
			}
			else if(b == 0 && c != 0) {
				System.out.println("Phường trình vô nghiệm");
			}else {
				//Phương trình bậc 1: bx + c = 0 => x = -c/b
				System.out.println("Phương trình bậc 1 có kết quả: "+ (-c/b));
			}
			
		}else {
			// Phương trình bậc 2
			double delta = b*b - 4*a*c;
			
			if(delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			}
			else if(delta == 0) {
				System.out.println("Phương trình có nghiệm kép x1 = x2: "+ (-b / (2 * a) ));
			}
			else {
				double x1 = (-b - Math.sqrt(delta)) / (2 * a);
				double x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có 2 nghiệm phân biệt");
				System.out.println("x1 = "+ x1);
				System.out.println("x2 = "+ x2);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.print("Mời bạn nhập số a: ");
			double a = sc.nextDouble();
			System.out.print("Mời bạn nhập số b: ");
			double b = sc.nextDouble();
			System.out.print("Mời bạn nhập số c: ");
			double c = sc.nextDouble();
			PhuongTrinhBac2(a, b, c);
			
			System.out.println("Bạn có muốn tiếp tục co/khong:");
			String line = new Scanner(System.in).nextLine();
			if(line.equalsIgnoreCase("khong")) {
				break;
			}
		}while(true);
		System.out.println("Chương trình đã kết thúc!");
	}
}
