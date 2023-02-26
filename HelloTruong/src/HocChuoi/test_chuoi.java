package HocChuoi;

public class test_chuoi {

	public static void main(String[] args) {
		String s1 = new String();
		String s2 = new String("Đào Huy Trường");
		String s3 = "Đào Huy Trường";
		System.out.println("Độ dài s1: "+ s1.length());
		System.out.println("Độ dài s2: "+ s2.length());
		System.out.println("Độ dài s3: "+ s3.length());
		
		if(s2 == s3) {
			System.out.println("s2 = s3");
		}
		else {
			System.out.println("s2 không bằng s3");
		}
		
		if(s2.equals(s3)) {
			System.out.println("giá trị s2 = giá trị s3");
		}
		else {
			System.out.println("giá trị s2 không bằng giá trị s3");
		}
	}
}
