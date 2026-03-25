public class Mahasiswa {
    private String nama;
    private int nilai1, nilai2, nilai3;

    public Mahasiswa(String nama, int nilai1, int nilai2, int nilai3) {
        this.nama = nama;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
    }

    public double hitungRataRata() {
        return (nilai1 + nilai2 + nilai3) / 3.0;
    }

    public void tampilkanHasil() {
        System.out.println("Nama       : " + nama);
        System.out.println("Nilai 1    : " + nilai1);
        System.out.println("Nilai 2    : " + nilai2);
        System.out.println("Nilai 3    : " + nilai3);
        System.out.println("Rata-rata  : " + hitungRataRata());
    }

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Sasi", 80, 85, 90);
        m1.tampilkanHasil();
    }
}
