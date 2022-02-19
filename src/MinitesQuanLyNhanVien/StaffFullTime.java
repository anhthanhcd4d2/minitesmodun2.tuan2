package MinitesQuanLyNhanVien;

public class StaffFullTime extends Staff {
    private double luongCung=3500000;
    private double tienThuong=0;
    private double tienPhat=0;


    public StaffFullTime(int maNhanVien, String name, String gmail, int age, String phone) {
        super(maNhanVien, name, gmail, age,phone);
    }

    public StaffFullTime(int maNhanVien, String name, String gmail, int age, String phone, double luongCung, double tienThuong, double tienPhat) {
        super(maNhanVien, name, gmail, age,phone);
        if (luongCung>0)
        this.luongCung = luongCung;
        else this.luongCung=3500000;
        if (tienThuong>0)
        this.tienThuong = tienThuong;
        else this.tienThuong=0;
        this.tienPhat = tienPhat;
    }
    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {

        if (luongCung>0)
            this.luongCung = luongCung;
        else this.luongCung=3500000;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        if (tienThuong>0)
            this.tienThuong = tienThuong;
        else this.tienThuong=0;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    @Override
    public double tinhLuong() {
        int averageWage=0;
        averageWage += luongCung +(tienThuong-tienPhat);
        return averageWage;
    }
    @Override
    public String toString() {
        return "NhaVienFulLTime{" +
                "luongCung=" + luongCung +
                ", tienThuong=" + tienThuong +
                ", tienPhat=" + tienPhat +
                '}';
    }
}
