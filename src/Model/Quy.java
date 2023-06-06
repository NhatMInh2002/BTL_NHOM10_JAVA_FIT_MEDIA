
package Model;


public class Quy {
    private String maQuy;
    private String tenHD;
    private String thoiGian;
    static public double tongQuy;

    public Quy() {
    }

    public Quy(String maQuy, String tenHD, String thoiGian) {
        this.maQuy = maQuy;
        this.tenHD = tenHD;
        this.thoiGian = thoiGian;
    }

    public String getMaQuy() {
        return maQuy;
    }

    public String getTenHD() {
        return tenHD;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public static double getTongQuy() {
        return tongQuy;
    }

    public void setMaQuy(String maQuy) {
        this.maQuy = maQuy;
    }

    public void setTenHD(String tenHD) {
        this.tenHD = tenHD;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public static void setTongQuy(double tongQuy) {
        Quy.tongQuy = tongQuy;
    }
}
