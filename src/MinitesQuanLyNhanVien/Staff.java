package MinitesQuanLyNhanVien;

public abstract class Staff {
    public static final String STAFF = "NhanVien{";
    public static final String ID_STAFF = "maNhanVien=";
    public static final String NAME = ", name='";
    public static final String GMAIL = ", gmail='";
    public static final String AGE = ", age=";
    public static final String PHONE = ", phone=";
    public static final char CHAR = '}';
    private int maNhanVien;
    private String name;
    private String gmail;
    private int age;
    private String phone;

    public Staff(int manNhanVien, String name) {
    }

    public Staff(int maNhanVien, String name, String gmail, int age, String phone) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public abstract double tinhLuong();
    @Override
    public String toString() {
        return STAFF +
                ID_STAFF + maNhanVien +
                NAME + name + '\'' +
                GMAIL + gmail + '\'' +
                AGE + age +
                PHONE + phone +
                CHAR;
    }
}
