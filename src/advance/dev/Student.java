package advance.dev;

public class Student extends Person {
	float markToan;
	float markLy;
	float markHoa;
	String maSinhVien;
	String lop;
	public Student(String ten, int tuoi, String number, float markToan, float markLy, float markHoa, String maSinhVien,
			String std) {
		super(ten, tuoi, number);
		this.markToan = markToan;
		this.markLy = markLy;
		this.markHoa = markHoa;
		this.maSinhVien = maSinhVien;
		this.lop = lop;
	}
	public float diemTrungBinh() {
		return (markToan + markLy+ markHoa)/3;
	}
	@Override
	public String toString() {
		return String.format("Ten sinh vien: %s,Tuoi: %d, Diem toan la: %f, Diem ly la: %f, Diem hoa la: %f, Ma Sinh Vien: %s, Lop: %s, Diem trung binh la: %f", ten, tuoi, markToan, markLy, markHoa, maSinhVien, lop, diemTrungBinh());
	}
}