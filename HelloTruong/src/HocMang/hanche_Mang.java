package HocMang;

public class hanche_Mang {

	public static void main(String[] args) {
		// hạn chế chèn nối mãng thuần ở vị trí cuối 
				int arrNumber1[] = {2, 4, 5, 6};
				int arrNumber2[] = new int [arrNumber1.length+1];
				for(int i=0; i < arrNumber1.length; i++) {
					arrNumber2[i] = arrNumber1[i];
					arrNumber2[arrNumber2.length-1] = 1;
				}
				for(int i=0; i < arrNumber2.length; i++) {
					System.out.print(arrNumber2[i]+ "\t");
				}
				// Ngoài ra còn các hạn chế như xóa vị trí mảng, sửa giá trị vị trí tự chọn trong mảng
	}

}
