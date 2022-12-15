public class PersegiPanjang implements BangunDatar{

    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public String tampilkanLuas() {
        return String.format("%.2f x %.2f = %.2f", panjang, lebar, hitungLuas());
    }
    
    public String tampilkanKeliling() {
        return String.format("2 x (%.2f x %.2f) = %.2f", panjang, lebar, hitungKeliling());
    }

}
