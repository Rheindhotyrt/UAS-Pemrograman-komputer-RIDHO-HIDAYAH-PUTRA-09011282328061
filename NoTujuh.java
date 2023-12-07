import java.util.Scanner;

public class NoTujuh {

    static String[] judulBuku = new String[100];
    static String[] penulisBuku = new String[100];
    static int[] tahunTerbitBuku = new int[100];
    static boolean[] statusPeminjaman = new boolean[100];
    static int jumlahBuku = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("=== Perpustakaan Sederhana ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Daftar Buku");
            System.out.println("3. Pinjam Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-3): ");
            pilihan = scanner.nextInt();
              System.out.printf("\n");

            switch (pilihan) {
                case 1:
                    tambahBuku();
                    break;
                case 2:
                    lihatDaftarBuku();
                    break;
                case 3:
                    pinjamBuku();
                    break;
            }

        } while (pilihan != 0);

        System.out.println("Program selesai.");

    }

    static void tambahBuku() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan judul buku: ");
        judulBuku[jumlahBuku] = scanner.nextLine();
        System.out.print("Masukkan penulis buku: ");
        penulisBuku[jumlahBuku] = scanner.nextLine();
        System.out.print("Masukkan tahun terbit buku: ");
        tahunTerbitBuku[jumlahBuku] = scanner.nextInt();
        statusPeminjaman[jumlahBuku] = false;

        jumlahBuku++;

        System.out.println("Buku berhasil ditambahkan.");
          System.out.printf("\n");
    }

    static void lihatDaftarBuku() {
        if (jumlahBuku == 0) {
            System.out.println("Belum ada buku yang ditambahkan.");
        } else {
            System.out.println("Daftar Buku:");
            for (int i = 0; i < jumlahBuku; i++) {
                System.out.println((i + 1) + ". " + judulBuku[i] + " ("
                        + penulisBuku[i] + ", " + tahunTerbitBuku[i] + ")");
                System.out.println("   Status Peminjaman: " +
                        (statusPeminjaman[i] ? "Dipinjam" : "Tersedia"));
            }
        }
          System.out.println();
    }

    static void pinjamBuku() {
        Scanner scanner = new Scanner(System.in);

        lihatDaftarBuku();

        System.out.print("Masukkan nomor buku yang ingin dipinjam: ");
        int nomorBuku = scanner.nextInt();

        if (nomorBuku > 0 && nomorBuku <= jumlahBuku) {
            if (!statusPeminjaman[nomorBuku - 1]) {
                statusPeminjaman[nomorBuku - 1] = true;
                System.out.println("Buku berhasil dipinjam.");
            } else {
                System.out.println("Buku sedang dipinjam. Tidak dapat dipinjam kembali.");
            }
        } else {
            System.out.println("Nomor buku tidak valid.");
        }
    System.out.println();       
    }
}
