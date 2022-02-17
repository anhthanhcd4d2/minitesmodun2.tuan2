package MinitesQuanLyNhanVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        FunctionOperation functionOperation =new FunctionOperation();
        int size=10;
        int choose;
        NhanVien[]lissNhanVien= new NhanVien[size];
        // nhân viên full time;
        lissNhanVien[0] =new NhaVienFulLTime(0,"Nguyễn văn Thành","anhthanh17a1@gmail.com",23,965478542);
        lissNhanVien[1] =new NhaVienFulLTime(1,"Tô Việt Anh","Tovietanh@gmail.com",21,965478542);
        lissNhanVien[2] =new NhaVienFulLTime(2,"Nguyễn Thị Ánh","Nguyenthianh@gmail.com",22,965478542);
        lissNhanVien[3] =new NhaVienFulLTime(3,"Dương Xuân Bách","duongxuanbach@gmail.com",23,965478542);
        lissNhanVien[4] =new NhaVienFulLTime(4,"Nguyễn Thu Huyền","nguyenthuhuyen@gmail.com",24,965478542);
        //nhận viên partime;
        lissNhanVien[5] =new NhanVienParTime(0,"Trần Thành Đạt","Tranthanhdat@gmail.com",25,965478542);
        lissNhanVien[6] =new NhanVienParTime(1,"Nguyễn Phan Giang","Nguyenphangiang@gmail.com",24,965478542);
        lissNhanVien[7] =new NhanVienParTime(2,"Trần Quốc Khánh","Tranquockhanh@gmail.com",23,965478542);
        lissNhanVien[8] =new NhanVienParTime(3,"Lê Minh Quân","Leminhquan@gmail.com",22,965478542);
        lissNhanVien[9] =new NhanVienParTime(4,"Nguyễn Thế Cảnh","Nguyenthecanh@gmail.com",21,965478542);
        // mảng lưu danh sách  bảng lương nhân viên passTime và FullTime;
        NhanVien[] listEmployeeSalary =new NhanVien[size];
        // bảng lương nhân viên fullTime
        listEmployeeSalary[0]= new BangLuongFullTime(0,"nguyễn văn thành",3500000,500000,600000);
        listEmployeeSalary[1]= new BangLuongFullTime(1,"nguyễn thị ánh",3500000,1000000,500000);
        listEmployeeSalary[2]= new BangLuongFullTime(2,"Tô Việt Anh",3500000,1500000,400000);
        listEmployeeSalary[3]= new BangLuongFullTime(3,"Dka Kiều Anh",3500000,2000000,300000);
        listEmployeeSalary[4]= new BangLuongFullTime(4,"Nguyễn thu Huyền",3500000,2500000,200000);
        //Bảng Lương Nhân Viên Pastime
        listEmployeeSalary[5]=new BangLuongPassTime(0,"Nguyễn văn A",24.6);
        listEmployeeSalary[6]=new BangLuongPassTime(1,"Nguyễn văn B",2.5);
        listEmployeeSalary[7]=new BangLuongPassTime(2,"Nguyễn văn C",4.7);
        listEmployeeSalary[8]=new BangLuongPassTime(3,"Nguyễn Văn D",5.7);
        listEmployeeSalary[9]=new BangLuongPassTime(4,"Nguyễn văn E",6.4);
        //thêm nhân viên
//        do{
//            System.out.println("Danh sách chức năng: \n");
//            System.out.println("Chức năng số 1: hiển thị danh sách nhân viên ");
//            System.out.println("chức năng số 2: hiển thị thêm nhân viên mới ");
//            System.out.println("chạy chức năng:\n");
//            choose=scanner.nextInt();
//            if (choose>5){
//                System.out.println("vi lòng chọn đúng chức năng");}
//        }while(choose>5);
        //thêm nhân viên mới
//        functionOperation.moreStaff(lissNhanVien);
        //show danh sách nhân viên hiên tại
        System.out.println("Tong tien:\t"+functionOperation.salaryOfAllEmployees(listEmployeeSalary));
        System.out.println("tien trung binh:\t "+functionOperation.averagedWageFullTime(listEmployeeSalary));
    }

}
