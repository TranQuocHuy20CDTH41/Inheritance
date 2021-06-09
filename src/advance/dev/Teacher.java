package advance.dev;

public class Teacher extends Person {
	String maGiaoVien;
	float heSoLuong;
	public Teacher(String ten, int tuoi, String number, String maGiaoVien, float heSoLuong) {
		super(ten, tuoi, number);
		this.maGiaoVien = maGiaoVien;
		this.heSoLuong = heSoLuong;
	}
	public float tinhLuong() {
		return 1500000 * heSoLuong;
	}
	@Override
	public String toString() {
		return String.format("Ten giao vien: %s, Tuoi: %d, Ma giao vien la: %s, He so luong la: %f, Luong la: %f", ten, tuoi, maGiaoVien, heSoLuong, tinhLuong());
	}
}
