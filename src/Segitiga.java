abstract class Segitiga implements BangunDatar {

	protected double alas;
	protected double tinggi;

	public Segitiga(double alas, double tinggi) {
		this.alas = alas;
		this.tinggi = tinggi;
	}

	public double getAlas() {
		return alas;
	}

	public void setAlas(double alas) {
		this.alas = alas;
	}

	public double getTinggi() {
		return tinggi;
	}

	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}

	public double hitungLuas() {
		return 0.5 * alas * tinggi;
	}

	public double hitungKeliling() {
		return 0;
	}

	public String tampilkanLuas() {
		return String.format("1/2 x %.2f x %.2f = %.2f", alas, tinggi, hitungLuas());
	}

	public String tampilkanKeliling() {
		return null;
	}
	
}