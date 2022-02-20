package MinitesQuanLyNhanVien;

import MinitesQuanLyNhanVien.FunctionOperation;
import MinitesQuanLyNhanVien.Staff;
import MinitesQuanLyNhanVien.StaffFullTime;
import MinitesQuanLyNhanVien.StaffParTime;

import java.util.ArrayList;
import java.util.Arrays;
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
    public static final String TYPE_STAFF1 = "Chọn kiểu nhân viên Tính Lương: \n";
    public static final String SELECT_1_FULLTIME = "FULLTIME: 1\n";
    public static final String SELECT_2_FULLTIME = "PARTIME: 2\n";
    public static final String SELECT = "Chọn:";
    public static final String SELECT1 = "Chọn ứng Dụng : ";
    public static final String THANK_YOU = "Cám ơn bạn đã sử dụng ";
    public static final String RESELECT = "Vui Lòng trọn đúng ứng dụng";
    public static final String THONG_BAO = "Chọn 1 để sử dụng 21 để thoát ứng dụng";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FunctionOperation functionOperation = new FunctionOperation();
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
        System.out.println("chọn ứng dụng 0- hiển thị danh sách nhân viên ");
        System.out.println("chọn ứng dụng 1- thêm nhân viên mới ");
        System.out.println("chọn ứng dụng 2- Tính tiền toàn công ty  ");
        System.out.println("chọn ứng dụng 3- tính trung bình farTime ");
        System.out.println("chọn ứng dụng 4- tính trung bình fullTime  ");
        System.out.println("chọn ứng dụng 5- liệt kê nhân viên có lương thấp hơn mức trung bình fulTime ");
        System.out.println("chọn ứng dụng 6- Nhập Lương cho nhân viên ");
        System.out.println("chọn ứng dụng 7- thêm nhân viên mới theo kiểu arraylis ");
        System.out.println("chọn ứng dụng 8- hiển thị ");
        System.out.println("chọn ứng dụng 9- sắp xếp thứ tự lương ");
        System.out.println("chọn ứng dụng 10- tính tiền từng nhân viên theo mã nhân viên ");
        System.out.println("chọn ứng dụng 11- đóng ứng dụng ");
        int check;
        //thêm nhân viên mới
        do {
            System.out.println(SELECT1);
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
            if (check == 2) {
                //   tính tiền toàn công ty
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
                            System.out.println(EMPLOYEE_MOTHER + listStaff[i].getMaNhanVien());
                            System.out.println(NAME + listStaff[i].getName());
                            hour = scanner.nextDouble();
                            functionOperation.nhapTienChoNhanVienParTime(listStaff, hour);
                        }
                    }
                }
            }
            // LÀM THEO ArrayList
            if (check == 7) {
                // them mới nhân viên
                ArrayList<Staff> addnewStaff = new ArrayList<Staff>();
                System.out.println(addnewStaff.size());
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
                    //cho mặc định ấn 1 lần là thêm 1  nhân viên :))
                    for (int i = 0; i < 1; i++) {
                        System.out.println(STAFF_NUMBER + (i + 1));
                        System.out.println(EMPLOYEE_MOTHER + SPACE + NAME + SPACE + GMAIL + SPACE + AGE + SPACE + PHONE + SPACE);
                        maNhanVien = scanner.nextInt();
                        name = scanner.next();
                        gmail = scanner.next();
                        age = scanner.nextInt();
                        phone = scanner.next();
                        addnewStaff.add(new StaffFullTime(maNhanVien, name, gmail, age, phone));
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
                        addnewStaff.add(new StaffParTime(maNhanVien, name, gmail, age, phone));
                    }
                }
                // tạo 1 mảng mới lớp nhân viên sau đó cho độ dài bằng mảng ArrayList
                Staff[] listStraffnew = new Staff[addnewStaff.size()];
                // dùng phương pháp toString để đổi mảng ArrayList thành listStraffnew
                addnewStaff.toArray(listStraffnew);
                // cộng mảng  CHO  mảng cũ tham chiếu đến mảng nhân viên mới;
                listStaff = functionOperation.addArray(listStaff, listStraffnew);
            }
            if (check == 8) {
                //hiển thị danh sách nhân viên
                ArrayList<Staff> newlistStaff = new ArrayList<>(Arrays.asList(listStaff));// chuyển arr thành ArrayList
                functionOperation.showlistStaff(newlistStaff);
            }
            if (check == 9) {
                //chưa hoàn thành
                functionOperation.sapXepTienLuong(listStaff);
            }
            if (check == 10) {
                // tính  tiền từng nhân viên theo mã nhân viên
                int maNhanVien;
                int choose;
                System.out.println(TYPE_STAFF1 + SELECT_1_FULLTIME + SELECT_2_FULLTIME);
                System.out.println(SELECT);
                choose = scanner.nextInt();
                System.out.println(EMPLOYEE_MOTHER);
                maNhanVien = scanner.nextInt();
                ArrayList<Staff> newlistStaff = new ArrayList<>(Arrays.asList(listStaff));
                functionOperation.salaryPerPerson(newlistStaff, maNhanVien, choose);
            }
        } while (check < 11);
        System.out.println(THANK_YOU);
    }
}
