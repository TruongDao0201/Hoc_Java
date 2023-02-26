package HocChuoi;

public class baitap_BaiHat {

	public static String tenBaiHatCoMp3(String music) {
		int vtCuoi = music.lastIndexOf("/");
		String tenMucsic = music.substring(vtCuoi+1);
		return tenMucsic;
	}
	public static String tenBaiHatKhongMp3(String music) {
		int vtCuoi = music.lastIndexOf("/");
		int vtTiep = music.lastIndexOf(".");
		String tenBaiHat = music.substring(vtCuoi+1, vtTiep);
		return tenBaiHat;
	}
	
	public static void main(String[] args) {
		String music = "D:/mucsic/bolero/thattinhca.mp3";
		
		String kq1 = tenBaiHatCoMp3(music);
		System.out.println(kq1);
		
		String kq2 = tenBaiHatKhongMp3(music);
		System.out.println(kq2);
	}
}
