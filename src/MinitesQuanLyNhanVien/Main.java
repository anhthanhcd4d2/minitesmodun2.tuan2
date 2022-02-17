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
        lissNhanVien[0] =new NhaVienFulLTime(0,"343","2423423",23,965478542);
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
        functionOperation.moreStaff(lissNhanVien);
    }

}
