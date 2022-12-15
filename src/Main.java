import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void createFile(String fileName) {

        try {
            File file = new File("D:/Final Project PBO/txt/" + fileName);
            if (file.createNewFile()) {
              System.out.println("Membuat file: " + file.getName());
            } else {
              System.out.println("File sudah ada.");
            }
        } catch (IOException e) {
            System.out.println("Terjadi error saat membuat file.");
            e.printStackTrace();
        }

    }

    public static void writeFile(String fileName, String text) {

        try {
            FileWriter myWriter = new FileWriter("D:/Final Project PBO/txt/" + fileName, true);
            myWriter.write(text);
            myWriter.close();
            System.out.println("Sukses menyimpan data.");
        } catch (IOException e) {
            System.out.println("Terjadi error saat menyimpan data.");
            e.printStackTrace();
        }

    }

    public static String getTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String time = now.format(format);

        return String.format("(%s)", time);
    }

    public static void calculatePersegi() {
        System.out.print("\nMasukkan sisi persegi: "); 
        double sisi = input.nextDouble();

        Persegi persegi = new Persegi(sisi);

        String namaFile = "persegi.txt";
        String text = getTime() + "\n"
               + "Sisi = " + persegi.getSisi() + "\n"
               + "Luas = " + persegi.tampilkanLuas() + "\n"
               + "Keliling = "  + persegi.tampilkanKeliling() + "\n\n";

        System.out.println(text);
        createFile(namaFile);
        writeFile(namaFile, text);
    }

    public static void calculatePersegiPanjang() {

        System.out.print("\nMasukkan panjang: "); 
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar: "); 
        double lebar = input.nextDouble();

        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        String namaFile = "persegi_panjang.txt";
        String text = getTime() + "\n"
               + "Panjang = " + persegiPanjang.getPanjang() + ", "
               + "Lebar = " + persegiPanjang.getLebar() + "\n"
               + "Luas = " + persegiPanjang.tampilkanLuas() + "\n"
               + "Keliling = "  + persegiPanjang.tampilkanKeliling() + "\n\n";

        System.out.println(text);
        createFile(namaFile);
        writeFile(namaFile, text);
    }

    public static void calculateLingkaran() {

        System.out.print("\nMasukkan jari-jari lingkaran: "); 
        double jari2 = input.nextDouble();

        Lingkaran lingkaran = new Lingkaran(jari2);

        String namaFile = "lingkaran.txt";
        String text = getTime() + "\n"
               + "Jari-jari = " + lingkaran.getjari2() + "\n"
               + "Luas = " + lingkaran.tampilkanLuas() + "\n"
               + "Luas setengah lingkaran = " + lingkaran.tampilkanLuasSetengah() + "\n"
               + "Keliling = "  + lingkaran.tampilkanKeliling() + "\n\n";

        System.out.println(text);
        createFile(namaFile);
        writeFile(namaFile, text);
    }

    public static void calculateSegitigaSamaKaki() {

        System.out.print("\nMasukkan panjang alas: "); 
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi: "); 
        double tinggi = input.nextDouble();
        System.out.print("Masukkan panjang sisi: "); 
        double sisi = input.nextDouble();

        SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki(alas, tinggi, sisi);

        String namaFile = "segitiga_sama_kaki.txt";
        String text = getTime() + "\n"
               + "Alas = " + segitigaSamaKaki.getAlas() + ", Tinggi = " + segitigaSamaKaki.getTinggi()
               + ", Sisi = " + segitigaSamaKaki.getSisi() + "\n"
               + "Luas = " + segitigaSamaKaki.tampilkanLuas() + "\n"
               + "Keliling = "  + segitigaSamaKaki.tampilkanKeliling() + "\n\n";

        System.out.println(text);
        createFile(namaFile);
        writeFile(namaFile, text);
    }

    public static void calculateSegitigaSamaSisi() {

        System.out.print("\nMasukkan tinggi: "); 
        double tinggi = input.nextDouble();
        System.out.print("Masukkan panjang sisi: "); 
        double sisi = input.nextDouble();

        SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi(tinggi, sisi);

        String namaFile = "segitiga_sama_sisi.txt";
        String text = getTime() + "\n"
               + "Tinggi = " + segitigaSamaSisi.getTinggi() + ", Sisi = " + segitigaSamaSisi.getSisi() + "\n"
               + "Luas = " + segitigaSamaSisi.tampilkanLuas() + "\n"
               + "Keliling = "  + segitigaSamaSisi.tampilkanKeliling() + "\n\n";

        System.out.println(text);
        createFile(namaFile);
        writeFile(namaFile, text);
    }

    public static void calculateSegitigaSikuSiku() {

        System.out.print("\nMasukkan panjang alas: "); 
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi: "); 
        double tinggi = input.nextDouble();
        System.out.print("Masukkan panjang sisi miring: "); 
        double sisiMiring = input.nextDouble();

        SegitigaSikuSiku segitigaSikuSiku = new SegitigaSikuSiku(alas, tinggi, sisiMiring);

        String namaFile = "segitiga_siku_siku.txt";
        String text = getTime() + "\n"
               + "Alas = " + segitigaSikuSiku.getAlas() + ", Tinggi = " + segitigaSikuSiku.getTinggi()
               + ", Sisi miring = " + segitigaSikuSiku.getSisiMiring() + "\n"
               + "Luas = " + segitigaSikuSiku.tampilkanLuas() + "\n"
               + "Keliling = "  + segitigaSikuSiku.tampilkanKeliling() + "\n\n";

        System.out.println(text);
        createFile(namaFile);
        writeFile(namaFile, text);
    }

    public static void selectSegitiga() {
        String pilihan;

        do {
            System.out.println("\nPilih Segitiga:\n1. Segitiga Sama Kaki\n2. Segitiga Sama Sisi\n3. Segitiga Siku Siku");
            System.out.print("Masukkan pilihan (1..3): ");
            pilihan = input.next();

            if(pilihan.equals("1")) {
                calculateSegitigaSamaKaki();
            } else if (pilihan.equals("2")){
                calculateSegitigaSamaSisi();
            } else if (pilihan.equals("3")) {
                calculateSegitigaSikuSiku();
            } else {
                System.out.println("Pilihan tidak valid, silahkan pilih antara 1 - 3.");
                pilihan = "4";
            }
        } while(pilihan.equals("4")); 
    }

    public static boolean getLanjut(String message) {
        System.out.print(message);
        String pilihan = input.next();

        while (!pilihan.equalsIgnoreCase("y") && !pilihan.equalsIgnoreCase("n")) {
            System.out.println("Input tidak valid. Silahkan pilih y atau n");       
            System.out.print(message);
            pilihan = input.next();
        }

        System.out.println();

        return pilihan.equalsIgnoreCase("y");
    }

    public static void main(String[] args) {

        String pilihan;
        boolean lanjut = true;
        
        while(lanjut) {
            System.out.println("Pilih Bangun Datar:\n1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran");
            System.out.print("Masukkan pilihan (1..4): ");
            pilihan = input.next();
    
            switch (pilihan) {
                case "1":
                    calculatePersegi();
                    break;
                
                case "2":
                    calculatePersegiPanjang();
                    break;
    
                case "3":
                    selectSegitiga();
                    break;
    
                case "4":
                    calculateLingkaran();
                    break;
    
                default:
                    System.out.println("Input tidak valid. Silahkan pilih antara 1 - 4");
                    break;
            }

            lanjut = getLanjut("\nApakah Anda ingin melanjutkan (y/n)? ");
        }

        input.close();

    }


}
