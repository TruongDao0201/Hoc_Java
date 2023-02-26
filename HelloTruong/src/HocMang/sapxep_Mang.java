package HocMang;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sapxep_Mang {
	public static void BubbleSort(int arrNumber[]) {
		int i, j;
		for(i = 0; i < arrNumber.length - 1; i++ ) {
			for(j = arrNumber.length - 1; j > i; j--) {
				if(arrNumber[j] < arrNumber[j-1]) {
					int temp = arrNumber[j];
					arrNumber[j] = arrNumber[j-1];
					arrNumber[j-1] = temp;
				}
			}
		}
	}
	public static void nhapMang(int arrNumber[]) {
		Random rd = new Random();
		for(int i=0; i < arrNumber.length; i++ ) {
			arrNumber[i] = rd.nextInt(50);
		}
	}
	public static void xuatMang(int arrNumber[]) {
		for(int i=0; i < arrNumber.length; i++) {
			System.out.print(arrNumber[i] + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrNumber[];
		System.out.print("Mời nhập phần tử mảng: ");
		int n = sc.nextInt();
		arrNumber = new int[n];
		nhapMang(arrNumber);
		System.out.print("Các giá trị trong mảng: ");
		xuatMang(arrNumber);
		// Dùng ham để sắp xếp
		BubbleSort(arrNumber);
		System.out.println("Mảng được sắp xếp:");
		xuatMang(arrNumber);
		// Dùng phương thức có sẵn của java Array.sort()
		Arrays.sort(arrNumber);
		System.out.println("Mảng được sắp xếp từ Array.sort: ");
		xuatMang(arrNumber);
	}
}
