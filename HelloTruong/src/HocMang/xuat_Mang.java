package HocMang;

import java.util.Scanner;

public class xuat_Mang {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int arrNumber[];
		System.out.print("Mời bạn nhập số lượng bộ nhớ cho mảng: ");

		// Cấp bộ nhớ cho mảng do user nhập
		int n = sc.nextInt();
		arrNumber= new int[n];
		System.out.println();
		// Chuyển giá trị cho mảng
		for(int i=0; i < arrNumber.length; i++ ) {
			System.out.print("Mời bạn nhập giá trị cho arrNumber["+ i +"]: ");
			arrNumber[i] = sc.nextInt();
		}
		System.out.println();
		// Xuất giá trị trong mảng
		System.out.println("Giá trị của mảng arrNumber:");
		for(int i=0; i < arrNumber.length; i++) {
		System.out.print(arrNumber[i] + "\t");
		}
		System.out.println();
		
		// Cách xuất giá trị mảng từng bộ nhớ mảng
		String chuoi[] = {"Đào Huy Trường", "25 tuổi", "Nam", "Công Nghệ Thông Tin"};
		for(String i: chuoi) {
			System.out.println(i);
		}
		// Cách thay đổi giá trị trong mảng
		System.out.println("Mảng đã thay đổi giá trị chuoi[2]:");
		for(int i=0; i < chuoi.length; i++) {
			chuoi[2] = "Nữ";
			System.out.println(chuoi[i]);
		}
	}
}
