package MinitesQuanLyNhanVien;

public abstract class NhanVien {
    protected int maNhanVien;
    protected String name;
    protected String gmail;
    protected int age;
    private int phone;

    public NhanVien(int manNhanVien, String name) {
    }

    public NhanVien(int maNhanVien, String name, String gmail, int age, int phone) {
        this.maNhanVien = maNhanVien;
        this.name = name;
        this.gmail = gmail;
        this.age = age;
        this.phone = phone;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public abstract double tinhLuong();

}
