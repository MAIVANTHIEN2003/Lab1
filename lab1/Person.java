package Session3.lab1;

import java.util.Scanner;

public class Person {
    public String Ten;
    public String  Gioitinh;
    public String Ngaysinh;
    public String Diachi;

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        Ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    Scanner sc = new Scanner(System.in);
    public void TT(){
        System.out.println("\t Moi nhap Ten: " );
        Ten = sc.nextLine();
        System.out.println("\t Moi nhap Gioi Tinh: ");
        Gioitinh = sc.nextLine();
        System.out.println("\t Moi nhap Ngay Sinh :");
        Ngaysinh = sc.nextLine();
        System.out.println("\t Moi nhap Dia Chi: ");
        Diachi = sc.nextLine();
    }
    public void In(){
        System.out.println("\t Duoi day la thong tin cua sinh vien "+ Ten);
        System.out.println("\t Ten: \t "+ Ten  );
        System.out.println("\t Gioi tinh:\t" + Gioitinh);
        System.out.println("\t Ngay sinh: \t" + Ngaysinh);
        System.out.println("\t Dia chi:\t" + Diachi);
        System.out.println("\t \t \t|||");
        System.out.println("\t \t The more");
        System.out.println("\t \t \t|||");
    }


}
