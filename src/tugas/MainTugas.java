// Nama : Fadel Saputra
// NPM  : 2410010274

package tugas;

public class MainTugas {

    public static void main(String[] args) {

        String[] mataKuliah = {
            "Pemrograman Berorientasi Objek",
            "Struktur Data",
            "Basis Data"
        };

        System.out.println("== Mata Kuliah ==");

        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        kelas.tambahMahasiswa(new Mahasiswa("Jaya", "001", 80));
        kelas.tambahMahasiswa(new Mahasiswa("Adam", "002", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Awa", "003", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Liya", "004", 70));
        kelas.tambahMahasiswa(new Mahasiswa("Anas", "005", 45));

        kelas.tampilkanSemua();

        System.out.println();
        System.out.println("Rata-rata nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());

        System.out.println();

        kelas.tambahMahasiswa(new Mahasiswa("Aldy", "006", 85));

        System.out.println(
            "Jumlah data terbaru : " +
            kelas.jumlahMahasiswa()
        );
    }
}