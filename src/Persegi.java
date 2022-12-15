public class Persegi implements BangunDatar {

    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    public String tampilkanLuas() {
        return String.format("%.2f x %.2f = %.2f", sisi, sisi, hitungLuas());
    }
    
    public String tampilkanKeliling() {
        return String.format("4 x %.2f = %.2f", sisi, hitungKeliling());
    }

}
