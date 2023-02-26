package HocChuoi;

import java.util.Scanner;

public class baitap_testPanlyndrome {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Mời bạn nhập chuỗi: ");
			String chuoi = sc.nextLine();
			char arr[] = chuoi.toCharArray();
			Boolean flag = true;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] != arr[arr.length-1-i]) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.println(chuoi + " là Panlyndrome");
			}else{
				System.out.println(chuoi + " không phải Panlyndrome");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
