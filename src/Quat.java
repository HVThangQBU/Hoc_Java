public class Quat {
    String thuongHieu;
    String loai;
    float gia;
    int congSuat;
    int capDo;
    boolean quayNgang;

    public Quat(String thuongHieu, String loai, float gia, int congSuat) {
        this.thuongHieu = thuongHieu;
        this.loai = loai;
        this.gia = gia;
        this.congSuat = congSuat;
        this.capDo = 0;
        this.quayNgang = false;
    }
    void chuyenSo(int so){
        if(so >=0){
        this.capDo = so;
        }else{
            System.out.println("so khong hop le");
        }
    }
    void chuyenTrangThaiQuay(){
        this.quayNgang = !this.quayNgang;

    }
    void bat(){
        if(this.capDo ==0){
            chuyenSo(1);
        }
    }
    void tat(){
        chuyenSo(0);
    }

    @Override
    public String toString() {
        return "Quat{" +
                "thuongHieu='" + thuongHieu + '\'' +
                ", loai='" + loai + '\'' +
                ", gia=" + gia +
                ", congSuat=" + congSuat +
                ", capDo=" + capDo +
                ", quayNgang=" + quayNgang +
                '}';
    }
    void hienThi(){
        System.out.println(this);
    }
    public static void main(String[] args){
        Quat q1 = new Quat("sam sung", "quan dung",20000,30);
        q1.chuyenTrangThaiQuay();
        q1.hienThi();
        q1.bat();
        q1.hienThi();
    }
}
