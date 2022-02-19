package MinitesQuanLyNhanVien;

public class FunctionOperation {

    public static final String ID_STAFF = "Mã Nhân Viên: ";
    public static final String NAME = "tên: ";
    public static final String GMAIL = "gmail: ";
    public static final String AGE = "tuổi: ";
    public static final String PHONE = "phone: ";
    public static final String SHOW_POSITION = "Hiển Thị vị trí thứ %d:";
    public static final String DOWN_THE_LINE = "\n\n";
    public static final String MONEY_BASIC = "Tiền Cơ Bản: ";
    public static final String MONEY_BONUS = "Tiền Thưởng: ";
    public static final String MONEY_PUNISH = "Tiền Phạt: ";
    public static final String HOUR = "Giờ làm";

    //cong 2 mang vs nhau
    public Staff[] addArray(Staff[]listStaff, Staff[]arr2){
        int total= listStaff.length + arr2.length;
        int cout=0;
        Staff[]result = new Staff[total];
        for (int i = 0; i < listStaff.length; i++) {
            result[cout]=listStaff[i];
            cout++;
        }
        for (int i = 0 ; i <arr2.length ; i++) {
            result[cout]= arr2[i];
            cout++;
        }
        return result;
    }
    // hiển thị danh sách  nhân viên
    public void showEntireList(Staff[]listStaff){
        for (int i = 0; i < listStaff.length; i++) {
            if (listStaff[i] instanceof StaffFullTime){
            System.out.printf(SHOW_POSITION + DOWN_THE_LINE,(i+1));
            System.out.println(ID_STAFF +listStaff[i].getMaNhanVien());
            System.out.println(NAME +listStaff[i].getName());
            System.out.println(GMAIL +listStaff[i].getGmail());
            System.out.println(AGE +listStaff[i].getAge());
            System.out.println(PHONE +listStaff[i].getPhone());
            System.out.println(MONEY_BASIC +((StaffFullTime)listStaff[i]).getLuongCung());
            System.out.println(MONEY_BONUS +((StaffFullTime)listStaff[i]).getTienThuong());
            System.out.println(MONEY_PUNISH +((StaffFullTime)listStaff[i]).getTienPhat());
            }if (listStaff[i] instanceof StaffParTime){
                System.out.printf(SHOW_POSITION + DOWN_THE_LINE,(i+1));
                System.out.println(ID_STAFF +listStaff[i].getMaNhanVien());
                System.out.println(NAME +listStaff[i].getName());
                System.out.println(GMAIL +listStaff[i].getGmail());
                System.out.println(AGE +listStaff[i].getAge());
                System.out.println(PHONE +listStaff[i].getPhone());
                System.out.println(HOUR +((StaffParTime)listStaff[i]).getHour());
            }
        }
    }
    //tính Tông Tiền toàn bộ fulltime
    public int salaryOfAllEmployeesFullTime(Staff[]listStaff){
        int averageWage=0;
        int count=0;
        for (int i = 0; i < listStaff.length ;i++) {
            if(listStaff[i]instanceof StaffFullTime){
               averageWage += listStaff[i].tinhLuong();
                count++;
            }
        }
        return  averageWage;
    }
    //tính Tông Tiền toàn bộ partime
    public int salaryOfAllEmployeesParTime(Staff[]listStaff){
        int averageWage=0;
        int count=0;
        for (int i = 0; i < listStaff.length ;i++) {
            if(listStaff[i]instanceof StaffParTime){
                averageWage += listStaff[i].tinhLuong();
                count++;
            }
        }
        return  averageWage;
    }
    // Tính trung bình full time
    public double averagedWageFullTime(Staff[]listStaff) {
        int count= 0;
        double medium=0;
        for (int i = 0; i < listStaff.length ;i++) {
            if(listStaff[i] instanceof StaffFullTime){
                count++;
            }
        } medium += salaryOfAllEmployeesFullTime(listStaff)/count;
        return medium;
    }
    // Tính trung bình par time
    public double averagedWageParTime(Staff[] listStaff) {
        int count= 0;
        double medium=0;
        for (int i = 0; i < listStaff.length ;i++) {
            if(listStaff[i] instanceof StaffParTime){
                count++;
            }
        } medium += salaryOfAllEmployeesParTime(listStaff)/count;
        return medium;
    }
    // liệt kê nhân viên có lương thấp hơn mức trung bình fulTime
    public  void lowSalaryFullTimeEmployee(Staff[]listStaff){
        for (int i = 0; i < listStaff.length ;i++) {
            if(listStaff[i] instanceof StaffFullTime){
                double total = ((StaffFullTime) listStaff[i]).getLuongCung()+(((StaffFullTime) listStaff[i]).getTienThuong()-((StaffFullTime) listStaff[i]).getTienPhat());
                if (averagedWageFullTime(listStaff)<=total){
                    System.out.println(SHOW_POSITION+(i+1));
                    System.out.println(ID_STAFF+ listStaff[i].getMaNhanVien());
                    System.out.println(NAME+ listStaff[i].getName());
                    System.out.println(MONEY_BASIC +((StaffFullTime) listStaff[i]).getLuongCung());
                    System.out.println(MONEY_BONUS +((StaffFullTime) listStaff[i]).getTienThuong());
                    System.out.println(MONEY_PUNISH +((StaffFullTime) listStaff[i]).getTienPhat());
                };
            }
        }
    }
    // nhập lương cho nhân viên full time
    public void nhapTienChoNhanVienFullTime(Staff[]listStaff, int basic ,int bonus, int  punish){
            for (int i = 0; i < listStaff.length ;i++) {
                if (listStaff[i] instanceof StaffFullTime) {
                    ((StaffFullTime) listStaff[i]).setLuongCung(basic);
                    ((StaffFullTime) listStaff[i]).setTienPhat(punish);
                    ((StaffFullTime) listStaff[i]).setTienThuong(bonus);
                }
        }
    }
    // nhập lương cho nhân viên partime
    public void nhapTienChoNhanVienParTime(Staff[]listStaff,double hour){
        for (int i = 0; i < listStaff.length ;i++) {
            if (listStaff[i] instanceof StaffParTime) {
                ((StaffParTime) listStaff[i]).setHour(hour);
            }
        }
    }
    public int hieutes(){
        int o1 = 0;
        int o2 = 0;
        return  o1 - o2;
    }
}
//    public void xapXepLuongFullTimeTangLen(Staff[]listStaff){
//        int cout=0;
//        for (int i = 0; i < listStaff.length; i++) {
//            if (listStaff[i] instanceof StaffFullTime){
//                    cout++;
//                }
//        }//5,7,3,9,2,6,8
//        Staff[]arr = new Staff[5];
//        double temp = listStaff[0].tinhLuong();
//            for (int i = 0; i < cout; i++) {
//                if (listStaff[i] instanceof StaffFullTime){
//                    if ( temp>listStaff[i+1].tinhLuong()){
//                        temp=listStaff[i+1].tinhLuong();
//                        arr[i]=listStaff[i+1];
//                    }
//                }
//            }
//    }
//}
