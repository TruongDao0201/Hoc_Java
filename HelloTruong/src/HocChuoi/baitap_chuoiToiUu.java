package HocChuoi;

import java.util.Scanner;

public class baitap_chuoiToiUu {
	public static String toiUu (String chuoi) {
		String chuoiToiUu = chuoi;
		// lệnh xóa khoảng trắng trái - phải của chuỗi
		chuoiToiUu = chuoiToiUu.trim();
		String arrWord[] = chuoiToiUu.split(" ");
		chuoiToiUu = "";

		for(String word: arrWord) {
			String newWord = word.toLowerCase();
			if(newWord.length() > 0) {
				// lệnh lấy ký tự đầu viết hoa
				newWord = newWord.replaceFirst(newWord.charAt(0)+"", 
						(newWord.charAt(0)+"").toUpperCase());
				chuoiToiUu += newWord + " ";
			}
		}
		return chuoiToiUu.trim();
	}	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Mời bạn nhập chuỗi: ");
			String chuoi = sc.nextLine();	
			String chuoiToiuu = toiUu(chuoi);
			System.out.println(chuoiToiuu);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
