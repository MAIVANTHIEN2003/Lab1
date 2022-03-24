package Session3.lab1;

import java.util.Scanner;

public class GiaoVien extends Person{
    public String Danhsach;
    public float Mucluong;
    public int Somon;
    public String Cacmon;

    public String getDanhsach() {
        return Danhsach;
    }

    public void setDanhsach(String danhsach) {
        Danhsach = danhsach;
    }

    public float getMucluong() {
        return Mucluong;
    }

    public void setMucluong(float mucluong) {
        Mucluong = mucluong;
    }

    public int getSomon() {
        return Somon;
    }

    public void setSomon(int somon) {
        Somon = somon;
    }

    public String getCacmon() {
        return Cacmon;
    }

    public void setCacmon(String cacmon) {
        Cacmon = cacmon;
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

    public  void TT(){
        System.out.println("\t Moi nhap danh sach lop:");
        Danhsach = sc.next();
        System.out.println("\t Moi nhap muc luong: ");
        Mucluong = sc.nextFloat();
        System.out.println("\t Moi nhap so mon giang day:");
        Somon = sc.nextInt();
        System.out.println("Nhap cac mon can giang day:");
        Cacmon = sc.next();
    }
    public void In(){
        System.out.println("\t Thong tin danh sach lop (GVCN: Trinh Quang Hoa): ");
        System.out.println("\t Danh sach lop T2108M: " + Danhsach);
        System.out.println("\t Muc luong:"+ Mucluong);
        System.out.println("\t So mon giang day:"+ Somon);
        System.out.println("\t Cac mom can day:" +Cacmon);

        System.out.println("\t \t \tEnd!");
    }
}
