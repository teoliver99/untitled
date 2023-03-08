package Kiemtra.bai3;

public class TestMain3 {
    public static void main(String[] args) {
        VanBan v1 = new VanBan();
        v1.setNoiDung("  Chao mung MOi ngUoi dEn VOI Lop Java  ");
        // Số từ = 9
        System.out.println(v1.demSoTu());
        // Chuyển sang văn bản chuẩn
        v1.setNoiDung(v1.chuanHoaVanBan());
        System.out.println(v1);

        // Viết thường toàn bộ
        v1.setNoiDung(v1.vietThuongToanBo());
        System.out.println(v1);

        // Viết hoa toàn bộ
        v1.setNoiDung(v1.vietHoaToanBo());
        System.out.println(v1);

        // Viết hoa các từ đầu tiên
        v1.setNoiDung(v1.vietHoaMoiTuDauTien());
        System.out.println(v1);
    }
}
