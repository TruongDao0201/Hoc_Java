package PhepToan_Switch;

import java.util.Scanner;

public class Renluyen_Switch {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.print("Mời bạn nhập số a: ");
				int a = sc.nextInt();
				System.out.print("Mời bạn nhập số b: ");
				int b = sc.nextInt();
				System.out.print("Mời bạn nhập phép toán: ");
				char ch = new Scanner(System.in).nextLine().charAt(0);

				switch(ch) {
				case '+':
					System.out.println(a + "+" + b + "=" + (a+b));
					break;
				case '-':
					System.out.println(a + "-" + b + "=" + (a-b));
					break;	
				case '*':
					System.out.println(a + "*" + b + " = " + (a*b));
					break;
				case '/':
					if(b==0) {
						System.out.println("Mẫu số = 0 => Không tính được!");
					}
					else {
						System.out.println(a + "/" + b + "=" + (a * 0.1/b));
					}
					break;
				default:
					System.out.println("Bạn nhập sai phép toán!");
					break;
				}
				System.out.print("Bận có muốn tiếp tục c/k: ");
				String line = new Scanner(System.in).nextLine();
				if(line.equalsIgnoreCase("k")) {
					System.out.println("Chương trình kết thúc!");
					break;
				}
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
