package MinitesQuanLyNhanVien;

class StaffParTime extends Staff {
    public static final String STAFF_PASTIME = "NhanVienParTime{";
    public static final String HOUR = "hour=";
    public static final char DONG = '}';
    private double hour=0;
    public StaffParTime(int maNhanVien, String name, String gmail, int age, String phone) {
        super(maNhanVien, name, gmail, age, phone);
    }
    public StaffParTime(int maNhanVien, String name, String gmail, int age, String phone, double hour) {
        super(maNhanVien, name, gmail, age, phone);
        if (hour>=0)
            this.hour = hour;
        else  this.hour=0;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        if (hour>=0)
        this.hour = hour;
        else  this.hour=0;
    }
    @Override
    public double tinhLuong() {
        double  oneMinuteMoney  =hour*100000;

        return oneMinuteMoney;
    }
    @Override
    public String toString() {
        return STAFF_PASTIME +
                HOUR + hour +
                DONG;
    }
}
