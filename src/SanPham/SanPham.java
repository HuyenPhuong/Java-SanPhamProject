package SanPham;

public class SanPham {

	private int maSanPham;
	private String tenSanPham;
	private double giaBan, soLuong;
	double tongTien;

	public int getMa() {
		return maSanPham;
	}

	public String getName() {
		return tenSanPham;
	}

	public double getGia() {
		return giaBan;
	}

	public double getTongTien() {
		return tongTien;
	}
	
	public double getSoLuong() {
		return soLuong;
	}

	public void setMa(int maSanPham) {
		this.maSanPham = maSanPham;
	}

	public void setName(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public void setGia(double giaBan) {
		this.giaBan = giaBan;
	}

	public void setSoLuong(double soLuong) {
		this.soLuong = soLuong;
	}
	
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public double thanhTien(double giaBan, double soLuong) {
		double tongtien = 0;

		if (soLuong > 20) {
			tongtien = giaBan * soLuong * 0.15;
		} else {
			tongtien = giaBan * soLuong;

		}

		return tongtien;
	}

	public SanPham(int maSanPham, String tenSanPham, double giaBan, double soLuong, double tongTien) {
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.giaBan = giaBan;
		this.soLuong = soLuong;
		this.tongTien = thanhTien(giaBan, soLuong);
	}

}
