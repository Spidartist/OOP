
public class NhanVien {
	private static double LUONG_MAX = 750d;
	private String tenNhanVien;
	public double luongCoBan;
	public double heSoLuong;
	public double tinhLuong() {
		double luongHienTai = this.getLuongCoBan();
		double heSoLuong = this.getHeSoLuong();
		return luongHienTai*heSoLuong;
	}
	public boolean tangLuong(double change) {
		double luongHienTai = this.getLuongCoBan();
		double heSoLuong = this.getHeSoLuong();
		double max_luong = this.getLUONG_MAX();
		this.setHeSoLuong(heSoLuong + change);
		if (tinhLuong()>max_luong) {
			this.setHeSoLuong(heSoLuong - change);
			return false;
		}else {
			return true;
		}
	}
	
	public void inTTin() {
		System.out.print(getTenNhanVien());
		System.out.print(getHeSoLuong());
	}
	
	public double getLUONG_MAX() {
		return LUONG_MAX;
	}
	public void setLUONG_MAX(double lUONG_MAX) {
		LUONG_MAX = lUONG_MAX;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
}
