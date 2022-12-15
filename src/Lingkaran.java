public class Lingkaran implements BangunDatar {

    final double phi = 3.14;
    private double jari2;

    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }

    public double getjari2() {
        return jari2;
    }

    public void setjari2(double jari2) {
        this.jari2 = jari2;
    }

    public double hitungLuas() {
        return phi * (jari2 * jari2);
    }

    public double hitungLuasSetengah() { 
        LuasSetengahLingkaran lingkaran = (double jari2) -> (phi * (jari2 * jari2)) / 2;

        return lingkaran.hitungLuasSetengahLingkaran(jari2);
    }

    public double hitungKeliling() {
        return 2 * phi * jari2;
    }

    public String tampilkanLuas() {
        return String.format("Luas = %.2f x (%.2f x %.2f) = %.2f", phi, jari2, jari2, hitungLuas());
    }

    public String tampilkanLuasSetengah() {
        return String.format("Luas = (%.2f x (%.2f x %.2f)) / 2 = %.2f", phi, jari2, jari2, hitungLuasSetengah());
    }

    public String tampilkanKeliling() {
        return String.format("2 x %.2f x %.2f = %.2f", phi, jari2, hitungKeliling());
    }
    
}
