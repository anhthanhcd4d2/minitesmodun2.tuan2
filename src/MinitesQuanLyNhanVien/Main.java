package MinitesQuanLyNhanVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        FunctionOperation functionOperation =new FunctionOperation();
        // nhân viên full time;
        NhaVienFulLTime fulLTime  =new NhaVienFulLTime(0,"343","2423423",23,965478542);
        NhaVienFulLTime fulLTime1 =new NhaVienFulLTime(1,"Tô Việt Anh","Tovietanh@gmail.com",21,965478542);
        NhaVienFulLTime fulLTime2 =new NhaVienFulLTime(2,"Nguyễn Thị Ánh","Nguyenthianh@gmail.com",22,965478542);
        NhaVienFulLTime fulLTime3 =new NhaVienFulLTime(3,"Dương Xuân Bách","duongxuanbach@gmail.com",23,965478542);
        NhaVienFulLTime fulLTime4 =new NhaVienFulLTime(4,"Nguyễn Thu Huyền","nguyenthuhuyen@gmail.com",24,965478542);
        //nhận viên partime;
        NhanVienParTime parTime   =new NhanVienParTime(0,"Trần Thành Đạt","Tranthanhdat@gmail.com",25,965478542);
        NhanVienParTime parTime1  =new NhanVienParTime(1,"Nguyễn Phan Giang","Nguyenphangiang@gmail.com",24,965478542);
        NhanVienParTime parTime2  =new NhanVienParTime(2,"Trần Quốc Khánh","Tranquockhanh@gmail.com",23,965478542);
        NhanVienParTime parTime3  =new NhanVienParTime(3,"Lê Minh Quân","Leminhquan@gmail.com",22,965478542);
        NhanVienParTime parTime4  =new NhanVienParTime(4,"Nguyễn Thế Cảnh","Nguyenthecanh@gmail.com",21,965478542);
        // liss danh sách fullTime và ParTime
        NhanVien[]lissNhanVien={fulLTime,fulLTime1,fulLTime2,fulLTime3,fulLTime4,parTime,parTime1,parTime2,parTime3,parTime4};
        functionOperation.moreStaff(lissNhanVien);
    }

}
