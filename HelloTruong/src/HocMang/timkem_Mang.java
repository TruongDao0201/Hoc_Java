package HocMang;

import java.util.Scanner;

public class timkem_Mang {
	//Hàm nhập giá trị vào mảng
	public static void nhapMang (int arrNumber[]) {
		try {
			var sc = new Scanner(System.in);
			for(int i=0; i < arrNumber.length; i++) {
				System.out.print("arrNumber["+i+"] = ");
				arrNumber[i] = sc.nextInt();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	// Hàm xuất mảng
	public static void xuatMang (int arrNumber[]) {
		for(int i=0; i < arrNumber.length; i++) {
			System.out.print(arrNumber[i] + "\t");
		}
		System.out.println();
	}
	// Hàm tìm kiếm k có bằng giá trị trong mảng
	public static void timKiem(int arrNumber[], int k) {
		// Cờ tìm kiếm 
		boolean timThay = false;
		for(int i=0; i < arrNumber.length; i++) {
			if(arrNumber[i] == k) {
				timThay = true;
				break;
			}
		}
		// toán tử 3 ngôi cho điều kiện if
		String kq = (timThay == true) ? "Có giá trị "+k+" trong mảng" : ""+k+" không có trong mảng";
		System.out.println(kq);
	}
	// Tìm kiếm số lần k xuất hiện trong mảng
	public static void timSoLanXuatHien(int arrNumber[], int x) {
		String giatri = "";
		int sl = 0;
		for(int i=0; i < arrNumber.length; i++) {
			if(arrNumber[i] == x) {
				giatri += i + "; " ;
				sl++;
			}
		}
		if(giatri.length() > 0) {
			System.out.println("Tìm thấy "+x+" xuất hiện "+sl+" lần trong mảng ");
			System.out.println("Các vị trí là: "+ sl);
		}
	}
	
	public static void main(String[] args) {
		try{
			var sc = new Scanner(System.in);
			System.out.print("Mời bạn nhập số phần tử trong mảng: ");
			int n = sc.nextInt();
			int arrNumber[] = new int[n];
			System.out.println("Mời bạn nhập giá trị vào mảng: ");
			nhapMang(arrNumber);
			System.out.println("Các giá trị trong mảng: ");
			xuatMang(arrNumber);
			System.out.println("Mời bạn nhập giá trị cần so sánh: ");
			int k = sc.nextInt();
			System.out.print("Kết quả tìm kiếm => ");
			timKiem(arrNumber, k);
			System.out.print("Mời bạn giá trị cần tìm: ");
			int x = sc.nextInt();
			timSoLanXuatHien(arrNumber, x);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
