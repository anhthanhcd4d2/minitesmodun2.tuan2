package MinitesQuanLyNhanVien;

public class BangLuongFullTime extends NhaVienFulLTime{

    public BangLuongFullTime(int manNhanVien, String name, double luongCung, double tienThuong, double tienPhat) {
        super(manNhanVien, name, luongCung, tienThuong, tienPhat);
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong();
    }
}
