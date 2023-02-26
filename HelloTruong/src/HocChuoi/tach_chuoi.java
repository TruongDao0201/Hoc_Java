package HocChuoi;

public class tach_chuoi {

	public static void main(String[] args) {
		String sv = "Đào Huy Trường;Nam;25 tuổi;DHCNTT";
		// trong mọi trường hợp nên dùng 2 dấu "\\" để đánh dấu rằng tách chuỗi bằng ký tự đó
		String [] arr = sv.split("\\;");
		
		// Khi biết chính xác độ dài của chuỗi
		if(arr.length == 4) {
			System.out.println("Tên: "+ arr[0]);
			System.out.println("Giới tính: "+ arr[1]);
			System.out.println("Tuổi: "+ arr[2]);
			System.out.println("Lớp học: "+ arr[3]);
		}else {
			System.out.println("Sai cú pháp");
		}
		System.out.println("--------------------------------------------------");
		// Phương pháp linh hoạt hơn khi sử dụng vòng lặp for
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------------------------------------------------");
		// Cách dùng vòng lặp for đối tượng chỉ áp dụng cho JDK 1.5
		for(String obj: arr) {
			System.out.println(obj);
		}
	}
}
