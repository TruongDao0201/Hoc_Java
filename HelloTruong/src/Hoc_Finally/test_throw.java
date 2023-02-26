package Hoc_Finally;

import java.util.Scanner;

public class test_throw {
	// throw dùng để đưa lỗi để xử lý ở một nơi khác 
	public static double ptBac1 (int a, int b) throws Exception {
		double result = 0;
		try {	
			result = -b / a;
		}
		catch(Exception ex) {
			throw ex;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời bạn nhập a: ");
		int a = sc.nextInt();
		System.out.print("Mời bạn nhập b: ");
		int b = sc.nextInt();
		
		try {
			double ketqua = ptBac1(a, b);
			System.out.println("Kết quả: "+ ketqua);
		} catch (Exception e) {
			System.out.println("Đã có lỗi! Im sorry");
			e.printStackTrace();
			
		}
		finally {
			System.out.println("Kết thúc");
		}
	}
}
