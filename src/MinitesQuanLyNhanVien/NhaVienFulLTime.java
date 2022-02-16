package MinitesQuanLyNhanVien;

public class NhaVienFulLTime extends NhanVien {
    private double luongCung;
    private double tienThuong;
    private double tienPhat;


    public NhaVienFulLTime(int maNhanVien, String name, String gmail, int age, int phone) {
        super(maNhanVien, name, gmail, age, phone);
        this.luongCung = luongCung;
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;

    }

    public NhaVienFulLTime(double luongCung, double tienThuong, double tienPhat) {
        this.luongCung = luongCung;
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    @Override
    public double tinhLuong() {
        return luongCung +(tienThuong-tienPhat);
    }
}
