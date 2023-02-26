package Ontap_For;

import java.util.Scanner;

public class baitoan_onFor {
	public static double tinhS(int x, int n) {
		double s = 0;
		double mau = 0;
		try {
			for(int i = 1; i <= n; i++) {
				double tu = Math.pow(x, i);
				mau = mau + i;
				s = s + tu / mau;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return s;
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Mời bạn nhập x: ");
			int x = sc.nextInt();
			System.out.print("Mời bạn nhập n: ");
			int n = sc.nextInt();
			double s = tinhS(x, n);
			System.out.println("S("+ x +", "+ n +")= " + s);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
