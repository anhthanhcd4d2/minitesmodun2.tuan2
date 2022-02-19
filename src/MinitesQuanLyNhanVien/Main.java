package MinitesQuanLyNhanVien;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FunctionOperation functionOperation = new FunctionOperation();
        ArrayList<Staff> newStaff= new ArrayList<Staff>();
        int size = 10;
        Staff[] listStaff = new Staff[size];
        // nhân viên full time;
        listStaff[0] = new StaffFullTime(0, "Nguyễn văn Thành", "anhthanh17a1@gmail.com", 23, "0975864353");
        listStaff[1] = new StaffFullTime(1, "Tô Việt Anh", "Tovietanh@gmail.com", 23, "0961742730");
        listStaff[2] = new StaffFullTime(2, "Nguyễn Thị Ánh", "Nguyenthianh@gmail.com", 22, "965478542");
        listStaff[3] = new StaffFullTime(3, "Dương Xuân Bách", "duongxuanbach@gmail.com", 23, "965478542");
        listStaff[4] = new StaffFullTime(4, "Nguyễn Thu Huyền", "nguyenthuhuyen@gmail.com", 24, "965478542");
        //nhận viên partime;
        listStaff[5] = new StaffParTime(0, "Trần Thành Đạt", "Tranthanhdat@gmail.com", 25, "965478542");
        listStaff[6] = new StaffParTime(1, "Nguyễn Phan Giang", "Nguyenphangiang@gmail.com", 24, "965478542");
        listStaff[7] = new StaffParTime(2, "Trần Quốc Khánh", "Tranquockhanh@gmail.com", 23, "965478542");
        listStaff[8] = new StaffParTime(3, "Lê Minh Quân", "Leminhquan@gmail.com", 22, "965478542");
        listStaff[9] = new StaffParTime(4, "Nguyễn Thế Cảnh", "Nguyenthecanh@gmail.com", 21, "965478542");
        // mảng lưu danh sách  bảng lương nhân viên passTime và FullTime;
        int check;
        do {
            System.out.println(SELECT);
            check = scanner.nextInt();
            if (check == 0) {
                functionOperation.showEntireList(listStaff);
            }
            if (check == 1) {
                int sire, choose;
                System.out.println(TYPE_STAFF + SELECT_1_FULLTIME + SELECT_2_FULLTIME);
                System.out.println(SELECT);
                choose = scanner.nextInt();
                System.out.println(STAFF_NUMBER_ADD);
                sire = scanner.nextInt();
                //tạo mảng  với  độ dài  đã nhâp
                Staff[] listStarff = new Staff[sire];
                int age;
                String name;
                String gmail;
                String phone;
                int maNhanVien;
                if (choose == 1) {
                    for (int i = 0; i < listStarff.length; i++) {
                        System.out.println(STAFF_NUMBER + (i + 1));
                        System.out.println(EMPLOYEE_MOTHER + SPACE + NAME + SPACE + GMAIL + SPACE + AGE + SPACE + PHONE + SPACE);
                        maNhanVien = scanner.nextInt();
                        name = scanner.next();
                        gmail = scanner.next();
                        age = scanner.nextInt();
                        phone = scanner.next();
                        listStarff[i] = new StaffFullTime(maNhanVien, name, gmail, age, phone);
                    }
                } else if (choose == 2) {
                    for (int i = 0; i < listStarff.length; i++) {
                        System.out.println(STAFF_NUMBER + (i + 1));
                        System.out.println(EMPLOYEE_MOTHER + SPACE + NAME + SPACE + GMAIL + SPACE + AGE + SPACE + PHONE + SPACE);
                        maNhanVien = scanner.nextInt();
                        name = scanner.next();
                        gmail = scanner.next();
                        age = scanner.nextInt();
                        phone = scanner.next();
                        listStarff[i] = new StaffParTime(maNhanVien, name, gmail, age, phone);
                    }
                }
                // CHO  mảng cũ tham chiếu đến mảng nhân viên mới;
                listStaff = functionOperation.addArray(listStaff, listStarff);
            }
//             tính tiền toàn công ty
            if (check == 2) {
                int total = functionOperation.salaryOfAllEmployeesFullTime(listStaff) +
                        functionOperation.salaryOfAllEmployeesParTime(listStaff);
                System.out.println(total);
            }// tính  trung bình fastime
            if (check == 3) {
                double total = functionOperation.averagedWageParTime(listStaff);
                System.out.println(total);
            }
            if (check == 4) {
                // tính trung bình full time
                double total = functionOperation.averagedWageFullTime(listStaff);
                System.out.println(total);
            }
            if (check == 5) {
                // liệt kê nhân viên có lương thấp hơn mức trung bình fulTime
                functionOperation.lowSalaryFullTimeEmployee(listStaff);
            }
            if (check == 6) {
                //nhập lương cho nhân viên,
                int basic, bonus, punish;
                double hour;
                int choose;
                System.out.println(TYPE_STAFF + SELECT_1_FULLTIME + SELECT_2_FULLTIME);
                System.out.println(SELECT);
                choose = scanner.nextInt();
                if (choose == 1) {
                    // nhập lương cho nhân viên fulltime
                    for (int i = 0; i < listStaff.length; i++) {
                        if (listStaff[i] instanceof StaffFullTime) {
                            System.out.println(STAFF_NUMBER + (i + 1));
                            System.out.println(EMPLOYEE_MOTHER + listStaff[i].getMaNhanVien());
                            System.out.println(NAME + listStaff[i].getName());
                            basic = scanner.nextInt();
                            bonus = scanner.nextInt();
                            punish = scanner.nextInt();
                            functionOperation.nhapTienChoNhanVienFullTime(listStaff, basic, bonus, punish);
                        }
                    }
                }
                if (choose == 2) {
                    // nhập lương cho nhân viên pastime
                    for (int i = 0; i < listStaff.length; i++) {
                        if (listStaff[i] instanceof StaffParTime) {
                            System.out.println(STAFF_NUMBER + (i + 1));
                            System.out.println(EMPLOYEE_MOTHER + listStaff[i].getMaNhanVien());
                            System.out.println(NAME + listStaff[i].getName());
                            hour = scanner.nextDouble();
                            functionOperation.nhapTienChoNhanVienParTime(listStaff, hour);
                        }
                    }
                }
            }
            if (check==7){
                // thêm mới kiểu arrraylist;
                //chạy kiểu ArrayList
                System.out.println(newStaff.size());
                int numberOf, choose;
                System.out.println(TYPE_STAFF + SELECT_1_FULLTIME + SELECT_2_FULLTIME);
                System.out.println(SELECT);
                choose = scanner.nextInt();
                System.out.println(STAFF_NUMBER_ADD);
                numberOf = scanner.nextInt();
                int age;
                String name;
                String gmail;
                String phone;
                int maNhanVien;
                if (choose == 1) {
                    for (int i = 0; i < 1; i++) {
                        System.out.println(STAFF_NUMBER + (i + 1));
                        System.out.println(EMPLOYEE_MOTHER + SPACE + NAME + SPACE + GMAIL + SPACE + AGE + SPACE + PHONE + SPACE);
                        maNhanVien = scanner.nextInt();
                        name = scanner.next();
                        gmail = scanner.next();
                        age = scanner.nextInt();
                        phone = scanner.next();
                        newStaff.add(new StaffFullTime(maNhanVien,name,gmail,age,phone));
                    }
                } else if (choose == 2) {
                    for (int i = 0; i < 1; i++) {
                        System.out.println(STAFF_NUMBER + (i + 1));
                        System.out.println(EMPLOYEE_MOTHER + SPACE + NAME + SPACE + GMAIL + SPACE + AGE + SPACE + PHONE + SPACE);
                        maNhanVien = scanner.nextInt();
                        name = scanner.next();
                        gmail = scanner.next();
                        age = scanner.nextInt();
                        phone = scanner.next();
                        newStaff.add(new StaffParTime(maNhanVien, name, gmail, age, phone));
                    }
                }
                // tạo 1 mảng mới lớp nhân viên sau đó cho độ dài bằng mảng ArrayList
                Staff[]listStraffnew= new Staff[newStaff.size()];
                // dùng phương pháp toString để đổi mảng ArrayList thành listStraffnew
                newStaff.toArray(listStraffnew);
                // cộng mảng  CHO  mảng cũ tham chiếu đến mảng nhân viên mới;
                listStaff = functionOperation.addArray(listStaff,listStraffnew);
            }
            if (check==8){
                //hiển thị danh sách nhân viên
                ArrayList<Staff> newlist= new ArrayList<>(Arrays.asList(listStaff));
                for (int i = 0; i < newlist.size(); i++) {
                    System.out.println(STAFF_NUMBER + (i + 1));
                    System.out.println(EMPLOYEE_MOTHER+newlist.get(i).getMaNhanVien());
                    System.out.println(NAME+newlist.get(i).getName());
                    System.out.println(GMAIL+newlist.get(i).getGmail());
                    System.out.println(AGE+newlist.get(i).getAge());
                    System.out.println(PHONE+newlist.get(i).getPhone());
                    System.out.println(newlist.get(i));
                }
            }
            if (check==9){
                ArrayList<Staff> newlist= new ArrayList<>(Arrays.asList(listStaff));
                for (int i = 0; i <newlist.size() ; i++) {
                    System.out.println(newlist.get(i).tinhLuong());
                    newlist.get(i).tinhLuong();
                    Staff[] finalListStaff = listStaff;
                    newlist.sort((o1, o2) -> functionOperation.salaryOfAllEmployeesFullTime(finalListStaff)- functionOperation.salaryOfAllEmployeesParTime(finalListStaff));
                    // hoi chi kieeu anh cach hoat dong cua  xap xep mang,
                    System.out.println(newlist.get(i).getName());
                }
            }
        } while (check < 20);
        System.out.println(THANK_YOU);
    }
}