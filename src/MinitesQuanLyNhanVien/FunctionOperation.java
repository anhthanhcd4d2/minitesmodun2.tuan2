package MinitesQuanLyNhanVien;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionOperation {
    public static final String EMPLOYEE_MOTHER = "Mã Nhân viên ";
    public static final String SPACE = "\t";
    public static final String AGE = "tuổi ";
    public static final String PHONE = "phone ";
    public static final String GMAIL = "gmail ";
    public static final String NAME = "tên ";
    public static final String STAFF_NUMBER = " nhân viên số\t ";
    public static final String STAFF_NUMBER_ADD = "Chọn số lượng nhân viên mới muốn thêm: ";
    public static final String TYPE_STAFF = "Chọn kiểu nhân viên muốn thêm: \n";
    public static final String SELECT_1_FULLTIME = "FULLTIME: 1\n";
    public static final String SELECT_2_FULLTIME = "PARTIME: 2\n";
    public static final String SELECT = "Chọn:";
    public static final String THANK_YOU = "Cám ơn bạn đã sử dụng ";

    public static final String ID_STAFF = "Mã Nhân Viên: ";
    public static final String SHOW_POSITION = "Hiển Thị vị trí thứ %d:";
    public static final String DOWN_THE_LINE = "\n\n";
    public static final String MONEY_BASIC = "Tiền Cơ Bản: ";
    public static final String MONEY_BONUS = "Tiền Thưởng: ";
    public static final String MONEY_PUNISH = "Tiền Phạt: ";
    public static final String HOUR = "Giờ làm";

    //cong 2 mang vs nhau
    public Staff[] addArray(Staff[] listStaff, Staff[] arr2) {
        int total = listStaff.length + arr2.length;
        int cout = 0;
        Staff[] result = new Staff[total];
        for (int i = 0; i < listStaff.length; i++) {
            result[cout] = listStaff[i];
            cout++;
        }
        for (int i = 0; i < arr2.length; i++) {
            result[cout] = arr2[i];
            cout++;
        }
        return result;
    }

    // hiển thị danh sách  nhân viên
    public void showEntireList(Staff[] listStaff) {
        for (int i = 0; i < listStaff.length; i++) {
            if (listStaff[i] instanceof StaffFullTime) {
                System.out.printf(SHOW_POSITION + DOWN_THE_LINE, (i + 1));
                System.out.println(ID_STAFF + listStaff[i].getMaNhanVien());
                System.out.println(NAME + listStaff[i].getName());
                System.out.println(GMAIL + listStaff[i].getGmail());
                System.out.println(AGE + listStaff[i].getAge());
                System.out.println(PHONE + listStaff[i].getPhone());
                System.out.println(MONEY_BASIC + ((StaffFullTime) listStaff[i]).getLuongCung());
                System.out.println(MONEY_BONUS + ((StaffFullTime) listStaff[i]).getTienThuong());
                System.out.println(MONEY_PUNISH + ((StaffFullTime) listStaff[i]).getTienPhat());
            }
            if (listStaff[i] instanceof StaffParTime) {
                System.out.printf(SHOW_POSITION + DOWN_THE_LINE, (i + 1));
                System.out.println(ID_STAFF + listStaff[i].getMaNhanVien());
                System.out.println(NAME + listStaff[i].getName());
                System.out.println(GMAIL + listStaff[i].getGmail());
                System.out.println(AGE + listStaff[i].getAge());
                System.out.println(PHONE + listStaff[i].getPhone());
                System.out.println(HOUR + ((StaffParTime) listStaff[i]).getHour());
            }
        }
    }
    //tính Tông Tiền toàn bộ fulltime
    public int salaryOfAllEmployeesFullTime(Staff[] listStaff) {
        int averageWage = 0;
        int count = 0;
        for (int i = 0; i < listStaff.length; i++) {
            if (listStaff[i] instanceof StaffFullTime) {
                averageWage += listStaff[i].tinhLuong();
                count++;
            }
        }
        return averageWage;
    }
    //tính Tông Tiền toàn bộ partime
    public int salaryOfAllEmployeesParTime(Staff[] listStaff) {
        int averageWage = 0;
        int count = 0;
        for (int i = 0; i < listStaff.length; i++) {
            if (listStaff[i] instanceof StaffParTime) {
                averageWage += listStaff[i].tinhLuong();
                count++;
            }
        }
        return averageWage;
    }

    // Tính trung bình full time
    public double averagedWageFullTime(Staff[] listStaff) {
        int count = 0;
        double medium = 0;
        for (int i = 0; i < listStaff.length; i++) {
            if (listStaff[i] instanceof StaffFullTime) {
                count++;
            }
        }
        medium += salaryOfAllEmployeesFullTime(listStaff)/count;
        return medium;
    }

    // Tính trung bình par time
    public double averagedWageParTime(Staff[] listStaff) {
        int count = 0;
        double medium = 0;
        for (int i = 0; i < listStaff.length; i++) {
            if (listStaff[i] instanceof StaffParTime) {
                count++;
            }
        }
        medium += salaryOfAllEmployeesParTime(listStaff) / count;
        return medium;
    }

    // liệt kê nhân viên có lương thấp hơn mức trung bình fulTime
    public void lowSalaryFullTimeEmployee(Staff[] listStaff) {
        for (int i = 0; i < listStaff.length; i++) {
            if (listStaff[i] instanceof StaffFullTime) {
                double total = ((StaffFullTime) listStaff[i]).getLuongCung() + (((StaffFullTime) listStaff[i]).getTienThuong() - ((StaffFullTime) listStaff[i]).getTienPhat());
                if (averagedWageFullTime(listStaff) <= total) {
                    System.out.println(SHOW_POSITION + (i + 1));
                    System.out.println(ID_STAFF + listStaff[i].getMaNhanVien());
                    System.out.println(NAME + listStaff[i].getName());
                    System.out.println(MONEY_BASIC + ((StaffFullTime) listStaff[i]).getLuongCung());
                    System.out.println(MONEY_BONUS + ((StaffFullTime) listStaff[i]).getTienThuong());
                    System.out.println(MONEY_PUNISH + ((StaffFullTime) listStaff[i]).getTienPhat());
                }
            }
        }
    }

    // nhập lương cho nhân viên full time
    public void nhapTienChoNhanVienFullTime(Staff[] listStaff, int basic, int bonus, int punish) {
        for (int i = 0; i < listStaff.length; i++) {
            if (listStaff[i] instanceof StaffFullTime) {
                ((StaffFullTime) listStaff[i]).setLuongCung(basic);
                ((StaffFullTime) listStaff[i]).setTienPhat(punish);
                ((StaffFullTime) listStaff[i]).setTienThuong(bonus);
            }
        }
    }

    // nhập lương cho nhân viên partime
    public void nhapTienChoNhanVienParTime(Staff[] listStaff, double hour) {
        for (int i = 0; i < listStaff.length; i++) {
            if (listStaff[i] instanceof StaffParTime) {
                ((StaffParTime) listStaff[i]).setHour(hour);
            }
        }
    }
    // arraylist
    //hiển thi
    public void showlistStaff(ArrayList<Staff> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(STAFF_NUMBER + (i + 1));
            System.out.println(EMPLOYEE_MOTHER + arrayList.get(i).getMaNhanVien());
            System.out.println(NAME + arrayList.get(i).getName());
            System.out.println(GMAIL + arrayList.get(i).getGmail());
            System.out.println(AGE + arrayList.get(i).getAge());
            System.out.println(PHONE + arrayList.get(i).getPhone());
            System.out.println(arrayList.get(i));
            // hoi tai sao ghi chi show arraylist.get se hien day du thong tin ma k hien
        }
    }
    // tính tiền từng nhân viên
    public void salaryPerPerson(ArrayList<Staff>arrayList,int maNhanVien, int choose){
        double money=0;
        if (choose==1) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) instanceof StaffFullTime) {
                    int check = arrayList.get(i).getMaNhanVien();
                    if (maNhanVien == check) {
                        System.out.println(arrayList.get(i));
                        System.out.println(arrayList.get(i).tinhLuong());
                    }
                }
            }
        }
        if (choose==2){
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) instanceof StaffParTime) {
                    int check = arrayList.get(i).getMaNhanVien();
                    if (maNhanVien == check) {
                        System.out.println(arrayList.get(i));
                        System.out.println(arrayList.get(i).tinhLuong());
                    }
                }
            }
        }
    }
    public void sapXepTienLuong(Staff[]listStaff){
        ArrayList<Staff> newlist = new ArrayList<>(Arrays.asList(listStaff));//chuyển arr thành ArrayList
        for (int i = 0; i < newlist.size(); i++) {
            newlist.sort((o1, o2) -> o1.getMaNhanVien()-o2.getMaNhanVien() );// hoi chi kieeu anh cach hoat dong cua  xap xep mang,
            System.out.println(newlist.get(i));
        }
    }
}