package MinitesQuanLyNhanVien;

import java.util.Scanner;

public class FunctionOperation {
//    Scanner scanner=new Scanner(System.in);
//    private int maNhanVien;
//    private String name;
//    private String gmail;
//    private int age;
//    private int phone;
//    private double luongCung;

    public  NhanVien[] moreStaff (NhanVien[]lissStaff){
        Scanner scanner=new Scanner(System.in);
         int numberOf,choose;
        System.out.println("Chọn kiểu nhân viên muốn thêm: \n" +"fullTime: 1\n" +"pasTime: 2");
        System.out.println("Chọn:");
        choose=scanner.nextInt();
        System.out.println("Chọn số lượng nhân viên mới muốn thêm: ");
        numberOf=scanner.nextInt();
        //tạo mảng  với  độ dài  đã nhâp
        NhanVien[]arr= new NhanVien[numberOf];
        if (choose==1){
            moreStaffFullTime(scanner, arr);
        }else if (choose==2){
            moreStaffPasTime(scanner, arr);
        }
        addArray(lissStaff,arr);
        return arr;
    }
    private void moreStaffPasTime(Scanner scanner, NhanVien[] arr) {
        int maNhanVien;
        int age;
        int phone;
        String name;
        String gmail;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mã Nhân viên "+(i+1)+"\t"+"tên "+(i+1)+"\t"+"gmail "+(i+1)+"\t"+"tuổi "+(i+1)+"\t"+"phone "+(i+1)+"\t");
            maNhanVien= scanner.nextInt();
            name= scanner.next();
            gmail= scanner.next();
            age= scanner.nextInt();
            phone= scanner.nextInt();
            // gán giá trị cho đối tượng
            arr[i]= new NhaVienFulLTime(maNhanVien,name,gmail,age,phone);
            // hiển thị thông tin nv mới
            System.out.println("hiển thị tên mới thêm "+(i+1));
            System.out.println("Mã nv: "+ arr[i].getMaNhanVien());
            System.out.println("name: "+ arr[i].getName());
            System.out.println("gmail: "+ arr[i].getGmail());
            System.out.println("tuổi: "+ arr[i].getAge());
            System.out.println("phone: "+ arr[i].getPhone()+"\n");
        }
    }

    private void moreStaffFullTime(Scanner scanner, NhanVien[] arr) {
        int age;
        String name;
        String gmail;
        int phone;
        int maNhanVien;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("MãNhânviên "+(i+1)+"\t"+"tên "+(i+1)+"\t"+"gmail "+(i+1)+"\t"+"tuổi "+(i+1)+"\t"+"phone "+(i+1)+"\t");
            maNhanVien= scanner.nextInt();
            name= scanner.next();
            gmail= scanner.next();
            age= scanner.nextInt();
            phone= scanner.nextInt();
            // gán giá trị cho đối tượng
                arr[i]= new NhaVienFulLTime(maNhanVien,name,gmail,age,phone);
                // hiển thị thông tin nv mới
            System.out.println("hiển thị tên mới thêm "+(i+1));
                System.out.println("Mã nv: "+ arr[i].getMaNhanVien());
                System.out.println("name: "+ arr[i].getName());
                System.out.println("gmail: "+ arr[i].getGmail());
                System.out.println("tuổi: "+ arr[i].getAge());
                System.out.println("phone: "+ arr[i].getPhone()+"\n");
        }
    }
    public NhanVien[] addArray(NhanVien[]arr1,NhanVien[]arr2){
        //arr1 là mảng cũ, arr 2 là mảng mới thêm, result là mảng mới với độ dài của 2 mảng 1,2
    int total= arr1.length+arr2.length;
    int cout=0;
    NhanVien[]result =new NhanVien[total];
        for (int i = 0; i < arr1.length; i++) {
            result[cout]=arr1[i];
            cout++;
        }
        for (int i = 0 ; i <arr2.length ; i++) {
            result[cout]= arr2[i];
        }
        arr1=result;
        return arr1;
    }
    public void showEntireList(NhanVien[]listStaff){
        for (int i = 0; i < listStaff.length; i++) {
            System.out.printf("Hiển Thị vị trí thứ %d:\n\n",(i+1));
            System.out.printf("mã nhân viên: %d \n tên nhân viên: %s \n Gmail: %s\n Tuổi: %d\n Phone: %d",listStaff[i].getMaNhanVien(),listStaff[i].getName(),listStaff[i].getGmail(),listStaff[i].getAge(),listStaff[i].getPhone());
        }
    }

}
