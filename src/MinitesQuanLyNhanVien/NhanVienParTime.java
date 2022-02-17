package MinitesQuanLyNhanVien;

public class NhanVienParTime extends NhanVien {
   private double hour;
    public NhanVienParTime(int maNhanVien,String name, String gmail,int age,int phone) {
        super(maNhanVien, name, gmail, age, phone);
    }
    public NhanVienParTime(int maNhanvien, String name ,double hour) {
        super(maNhanvien,name);
        this.hour = hour;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public double tinhLuong() {
        double minute = hour*60;
        double oneMinuteMoney =1.68;
        return minute*oneMinuteMoney;
    }
}
