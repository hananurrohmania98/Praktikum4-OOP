public class Utama {
    public static void main(String[] args) {

        BangunDatar bangunDatar = new BangunDatar();
        Persegi persegi = new Persegi(5);
        Segitiga segitiga = new Segitiga(3, 5);
        Lingkaran lingkaran = new Lingkaran(28);

        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("keliling persegi: " + persegi.keliling());
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
        System.out.println("Luas lingkaran: " + lingkaran.luas());
        System.out.println("keliling lingkaran: " + lingkaran.keliling());
    }
}
