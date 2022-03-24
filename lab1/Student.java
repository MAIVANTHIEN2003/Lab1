package Session3.lab1;

import java.util.Scanner;

public class Student extends  Person{
    public int Masv;
    public int Diemthi;
    public String Email;

    public int getMasv() {
        return Masv;
    }

    public void setMasv(int masv) {
        Masv = masv;
    }

    public int getDiemthi() {
        return Diemthi;
    }

    public void setDiemthi(int diemthi) {
        Diemthi = diemthi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public Scanner getSc() {
        return sc;
    }

    @Override
    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    Scanner sc = new Scanner(System.in);

    public void TT(){
        System.out.println("\t Moi nhap ma sinh vien: ");
        Masv = sc.nextInt();
        System.out.println("\t Moi nhap diem thi: ");
        Diemthi = sc.nextInt();
        System.out.println("\t Moi nhap Email: ");
        Email = sc.next();
    }
    public void In(){
        System.out.println("\t Thong tin diem so cua sinh vien:" );
        System.out.println("\t Ma sinh vien: \t" + Masv);
        System.out.println("\t Diem thi: \t" + Diemthi);
        System.out.println("\t Email : \t" + Email);
        if (Diemthi < 8){
            System.out.println("\t Sinh vien khong du tieu chuan dat hoc bong.");
        }else {
            System.out.println("\t Sinh vien du tieu chuan  dat hoc bong.");
        }
        System.out.println("\t \t \t|||");
        System.out.println("\t \t The more");
        System.out.println("\t \t \t|||");
    }


}
