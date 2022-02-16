package MinitesQuanLyNhanVien;

import java.util.Scanner;

public class FunctionOperation {
    Scanner scanner=new Scanner(System.in);
    protected int maNhanVien;
    protected String name;
    protected String gmail;
    protected int age;
    private int phone;
    private int numberOf,choose,cout=0;
    private double luongCung;
    public  NhanVien[] moreStaff (NhanVien[]lissStaff){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Chọn kiểu nhân viên muốn thêm: \n" +"fullTime: 1\n" +"pasTime: 2");
        System.out.println("Chọn:");
        choose=scanner.nextInt();
        //chạy vòng lặp lấy mã nhân viên hiện có;
        for (int i = 0; i < lissStaff.length; i++) {
            if (choose==1){
                if (lissStaff[i] instanceof NhaVienFulLTime) {
                    cout++;
                }
            }
        }System.out.printf("Mã nhân viên hiện có là:\t %s - %s\n",lissStaff[0].getMaNhanVien(),lissStaff[lissStaff.length-1].getMaNhanVien());
        System.out.println("Chọn số lượng nhân viên mới muốn thêm: ");
        numberOf=scanner.nextInt();
        NhanVien[]newarray= new NhanVien[numberOf];
        if (choose==1){
            for (int i = 0; i < newarray.length; i++) {
                System.out.println("Mã Nhân viên "+(i+1)+"\t"+"tên "+(i+1)+"\t"+"gmail "+(i+1)+"\t"+"tuổi "+(i+1)+"\t"+"phone "+(i+1)+"\t");
                maNhanVien=scanner.nextInt();
                name=scanner.next();
                gmail=scanner.next();
                age=scanner.nextInt();
                phone=scanner.nextInt();
                // gán giá trị cho đối tượng
                    newarray[i]= new NhaVienFulLTime(maNhanVien,name,gmail,age,phone);
                    // hiển thị thông tin nv mới
                System.out.println("hiển thị tên mới thêm "+(i+1));
                    System.out.println("Mã nv: "+newarray[i].getMaNhanVien());
                    System.out.println("name: "+newarray[i].getName());
                    System.out.println("gmail: "+newarray[i].getGmail());
                    System.out.println("tuổi: "+newarray[i].getAge());
                    System.out.println("phone: "+newarray[i].getPhone()+"\n");
            }
        }
        return newarray;
    }
}
