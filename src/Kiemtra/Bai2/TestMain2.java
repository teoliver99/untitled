package Kiemtra.Bai2;

import java.util.Scanner;

public class TestMain2 {

        public static void main(String[] args) {
            NhanVien nhanVien1 = new KyThuat("TP1234", "Nguyen Van A", "01/01/2000", "Ha Noi", "Khoa hoc may tinh");
            System.out.println(nhanVien1.toString());
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap ma nhan vien: ");
            String maNV = scanner.nextLine();
            System.out.print("Nhap ho ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Nhap nam sinh: ");
            String namSinh = scanner.nextLine();
            System.out.print("Nhap dia chi: ");
            String diaChi = scanner.nextLine();
            System.out.print("Nhap chuyen nganh: ");
            String chuyenNganh = scanner.nextLine();
            NhanVien nhanVien2 = new KyThuat(maNV, hoTen, namSinh, diaChi, chuyenNganh);
            System.out.println(nhanVien2.toString());
        }
    }
