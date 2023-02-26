package HocMang;

import java.util.Random;
import java.util.Scanner;

public class baitap_Mangr {
	static int arr[];
	public static void menu() {
		System.out.println();
		System.out.println("----------Cac Chuong Trinh-----------");
		System.out.println("1. Nhap mang");
		System.out.println("2. Xuat mang");
		System.out.println("3. Tong mang");
		System.out.println("4. Tim k trong mang");
		System.out.println("5. Tim so lon nhat");
		System.out.println("6. Tim so nho nhat");
		System.out.println("7. Sap xep cac so nguyen to");
		System.out.println("8. Sap xep tang dan");
		System.out.println("9. Sap xep giam dan");
		System.out.println("10. Thoat chuong trinh");
		System.out.println("----------Het-----------");
		System.out.println();
		System.out.print("Moi ban chon chuc nang: ");
		int select = new Scanner(System.in).nextInt();
		switch(select) {
		case 1:
			nhapMang();
			break;
		case 2:
			xuatMang();
			break;
		case 3:
			tongMang();
			break;
		case 4:
			timMang();
			break;
		case 5:
			soLonNhat();
			break;
		case 6:
			soNhoNhat();
			break;
		case 7:
			sapxepNguyenTo();
			break;
		case 8:
			xepTangDan();
			break;
		case 9:
			xepNhoDan();
			break;
		case 10:
			System.err.println("Cam on da dung chuong trinh");
			System.exit(0);
		default:
			System.out.println("Ban nhap lua chon sai");
			break;
		}
	}

	private static void sapxepNguyenTo() {
		// TODO Auto-generated method stub

	}

	private static void xepNhoDan() {
		// TODO Auto-generated method stub

	}

	private static void xepTangDan() {
		// TODO Auto-generated method stub

	}

	private static void soNhoNhat() {
		// TODO Auto-generated method stub

	}

	private static void soLonNhat() {
		// TODO Auto-generated method stub

	}

	private static void timMang() {
		// TODO Auto-generated method stub

	}

	private static void tongMang() {
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("======> Tong mang: "+ sum);
	}

	private static void xuatMang() {
		System.out.println("======> Cac phan tu trong mang:");
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+ "\t");
		}
		System.out.println();
	}

	private static void nhapMang() {
		System.out.print("======> Moi nhap so phan tu: ");
		int n = new Scanner(System.in).nextInt();
		arr = new int[n];
		Random rd = new Random();
		for(int i=0; i < n; i++) {
			arr[i] = rd.nextInt(50);
		}
	}

	
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}
}
