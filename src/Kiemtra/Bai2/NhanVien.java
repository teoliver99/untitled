package Kiemtra.Bai2;




    abstract class NhanVien {
        protected String maNV;
        protected String hoTen;
        protected String namSinh;
        protected String diaChi;

        public NhanVien(String maNV, String hoTen, String namSinh, String diaChi) {
            this.maNV = maNV;
            this.hoTen = hoTen;
            this.namSinh = namSinh;
            this.diaChi = diaChi;
        }

        public String getMaNV() {
            return maNV;
        }

        public String getHoTen() {
            return hoTen;
        }

        public String getNamSinh() {
            return namSinh;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public void setNamSinh(String namSinh) {
            this.namSinh = namSinh;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }

        public abstract String moTaCongViec();

        @Override
        public String toString() {
            return "Ma nhan vien: " + maNV + ", Ho ten: " + hoTen + ", Nam sinh: " + namSinh + ", Dia chi: " + diaChi;
        }
    }

    class KyThuat extends NhanVien {
        private String chuyenNganh;

        public KyThuat(String maNV, String hoTen, String namSinh, String diaChi, String chuyenNganh) {
            super(maNV, hoTen, namSinh, diaChi);
            this.chuyenNganh = chuyenNganh;
        }

        public String getChuyenNganh() {
            return chuyenNganh;
        }

        public void setChuyenNganh(String chuyenNganh) {
            this.chuyenNganh = chuyenNganh;
        }

        @Override
        public String moTaCongViec() {
            return "Thuc hien cac cong viec ky thuat";
        }

        @Override
        public String toString() {
            return super.toString() + ", Chuyen nganh: " + chuyenNganh;
        }
    }


