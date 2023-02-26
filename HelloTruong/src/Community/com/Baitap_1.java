package Community.com;

import java.util.Scanner;

public class Baitap_1 {

	public static void main(String[] args) {
		
//		System.out.print("Mời bạn nhập số a: ");
//		int a = new Scanner(System.in).nextInt();
//		
//		System.out.print("Mời bạn nhập số b: ");
//		int b = new Scanner(System.in).nextInt();
//		
//		int Tong = 0;
//		Tong = a + b;
//		System.out.println("Tổng là: "+ Tong);
		
		// Phần nhập liệu
		System.out.print("Mời bạn nhập họ tên: ");
		String Hoten = new Scanner(System.in).nextLine();
		System.out.print("Mời bạn nhập giới tính: ");
		String Gioitinh = new Scanner(System.in).nextLine();
		System.out.print("Mời bạn nhập công việc:  ");
		String Congviec = new Scanner(System.in).nextLine();
		System.out.print("Mời bạn nhập tuổi: ");
		int Tuoi = new Scanner(System.in).nextInt();
		//Render
		System.out.println("\n");
		System.out.println("Họ tên: "+ Hoten);
		System.out.println("Giới tính: "+ Gioitinh);
		System.out.println("Công việc: "+ Congviec);
		System.out.println("Tuổi: " + Tuoi + " tuổi");
	}
}
