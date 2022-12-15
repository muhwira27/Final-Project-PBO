public class SegitigaSikuSiku extends Segitiga {
	
    private double sisiMiring;

    public SegitigaSikuSiku(double alas, double tinggi, double sisiMiring) {
    	super(alas, tinggi);
      	this.sisiMiring = sisiMiring;
    }

    public double getSisiMiring() {
        return sisiMiring;
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double hitungKeliling() {
        return alas + tinggi + sisiMiring; 
    }

    @Override
    public String tampilkanKeliling() {
        return String.format("%.2f + %.2f + %.2f = %.2f",alas, tinggi, sisiMiring, hitungKeliling());
    }

}
  