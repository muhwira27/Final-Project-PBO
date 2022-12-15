public class SegitigaSamaKaki extends Segitiga {
	
    private double sisi;

    public SegitigaSamaKaki(double alas, double tinggi, double sisi) {
    	super(alas, tinggi);
      	this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling() {
        return (2 * sisi) + alas; 
    }

    @Override
    public String tampilkanKeliling() {
        return String.format("(2 * %.2f) + %.2f = %.2f", sisi, alas, hitungKeliling());
    }

}
  