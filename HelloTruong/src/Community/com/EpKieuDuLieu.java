package Community.com;

public class EpKieuDuLieu {

	public static void main(String[] args) {
		System.out.println(1/2); // Chưa ép kiểu
		System.out.println(1.0/2); // Dùng số để ra data đúng
		System.out.println((double)1/2); // Ép kiểu
		
		double x = (double)10/3;
		System.out.println("X = "+ x);
	}	
}