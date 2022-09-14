public class BT_8_9_Quat {
    String thuongHieu;
    String loai;
    float gia;
    int congSuat;
    int capDo;
    boolean quayNgang;

    public BT_8_9_Quat(String thuongHieu, String loai, float gia, int congSuat) {
        this.thuongHieu = thuongHieu;
        this.loai = loai;
        this.gia = gia;
        this.congSuat = congSuat;
        this.quayNgang = false;
        this.capDo = 0;
    }
    public void chuyenSo(int capDo) {
        this.capDo = capDo;
    }
    public void chuyenTrangThaiQuay() {
        this.quayNgang=this.quayNgang?false:true;
        if (this.quayNgang){
            System.out.println("quat quay ngang");
        }else {
           System.out.println("quat khong quay ngang");}
    }
    public void bat(){
        System.out.println("quat duoc bat");
    }
    public void tat(){
        System.out.println("quat duoc tat");
    }
    public void hienThi(){
        System.out.println("quat co thuong hieu la: "+thuongHieu+", loat: "+loai+", gia: "+gia+", cong suat: "+congSuat);
    }
    public void display(){
        System.out.println("quat co thuong hieu la: "+thuongHieu+", loat: "+loai+", gia: "+gia+", cong suat: "+congSuat+", cap do: "+this.capDo+", trang thai: "+quayNgang);
    }
    public static void main(String[]args){
        BT_8_9_Quat quat = new BT_8_9_Quat("samsung","quat",2200000,250);
        BT_8_9_Quat quat2 = new BT_8_9_Quat("sony","quat tran", 1500000, 140);
        quat.bat();
        quat.hienThi();
        quat.chuyenSo(3);
        quat2.display();
        quat2.chuyenSo(0);
        quat2.display();
        quat2.chuyenSo(1);
        quat2.chuyenTrangThaiQuay();
        quat2.display();
        quat2.chuyenTrangThaiQuay();
        quat2.display();


    }
}
