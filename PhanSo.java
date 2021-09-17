public class PhanSo {
    private int tu, mau;

    public PhanSo(int tu, int mau) { 
        super();
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void toiGianPhanSo() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }

    public void congPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("tong 2 phan so = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }

    public void truPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoHieu = new PhanSo(ts, ms);
        phanSoHieu.toiGianPhanSo();
        System.out.println("hieu 2 phan so = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
    }

    public void nhanPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoTich = new PhanSo(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("tich 2 phan so = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }

    public void chiaPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        PhanSo phanSoThuong = new PhanSo(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("thuong 2 phan so = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }

    public void inPhanSo () {
        System.out.println("Phan so: (" + tu + "/" + mau +")");
    }

    public void nghichDaoPhanSo(){
        int temp;
        temp = tu;
        tu = mau;
        mau = temp;
        System.out.println("Phan so sau khi nghich dao la: (" + tu +"/" + mau +")");
    }

    public static void main(String[] args) {
        PhanSo a =new PhanSo(1, 2);
        PhanSo b = new PhanSo(3, 4);
        a.inPhanSo();
        b.inPhanSo();
        a.nghichDaoPhanSo();
        b.nghichDaoPhanSo();
        a.congPhanSo(b);
        a.truPhanSo(b);
        a.nhanPhanSo(b);
        a.chiaPhanSo(b);
    }

}