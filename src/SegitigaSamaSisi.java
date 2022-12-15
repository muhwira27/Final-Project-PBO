public class SegitigaSamaSisi extends Segitiga {
	
    private double sisi;

    public SegitigaSamaSisi(double tinggi, double sisi) {
    	super(sisi, tinggi);
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
        return 3 * sisi; 
    }

    @Override
    public String tampilkanKeliling() {
        return String.format("2 * %.2f = %.2f", sisi, hitungKeliling());
    }

}
  