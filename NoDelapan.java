import java.util.Scanner;

public class NoDelapan {

    static String[] usernames = new String[100];
    static String[] passwords = new String[100];
    static boolean[] statusAktif = new boolean[100];
    static int jumlahAkun = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println();
            System.out.println("=== Manajemen Akun Pengguna ===");
            System.out.println("1. Tambah Akun");
            System.out.println("2. Lihat Daftar Akun");
            System.out.println("3. Aktifkan Akun");
            System.out.println("4. Nonaktifkan Akun");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-4): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    tambahAkun();
                    break;
                case 2:
                    lihatDaftarAkun();
                    break;
                case 3:
                    aktifkanAkun();
                    break;
                case 4:
                    nonaktifkanAkun();
                    break;
            }

        } while (pilihan != 0);

        System.out.println("Program selesai.");

    }

    static void tambahAkun() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        usernames[jumlahAkun] = input.nextLine();
        System.out.print("Masukkan password: ");
        passwords[jumlahAkun] = input.nextLine();
        statusAktif[jumlahAkun] = false;

    jumlahAkun++;

        System.out.println("Akun berhasil ditambahkan.");
    }

    static void lihatDaftarAkun() {
        if (jumlahAkun == 0) {
            System.out.println("Belum ada akun yang ditambahkan.");
        } else {
            System.out.println("Daftar Akun:");
            for (int i = 0; i < jumlahAkun; i++) {
                System.out.println((i + 1) + ". " + usernames[i] + " - " +
                        (statusAktif[i] ? "Aktif" : "Nonaktif"));
            }
        }
    }

    static void aktifkanAkun() {
        Scanner input = new Scanner(System.in);

        lihatDaftarAkun();

        System.out.print("Masukkan nomor akun yang ingin diaktifkan: ");
        int nomorAkun = input.nextInt();

        if (nomorAkun > 0 && nomorAkun <= jumlahAkun) {
            if (!statusAktif[nomorAkun - 1]) {
                statusAktif[nomorAkun - 1] = true;
                System.out.println("Akun berhasil diaktifkan.");           
            } else {
                System.out.println("Akun sudah aktif.");
            }
        } else {
            System.out.println("Nomor akun tidak valid.");
        }
    } 
    
    static void nonaktifkanAkun() {
        Scanner input = new Scanner(System.in);

        lihatDaftarAkun();

        System.out.print("Masukkan nomor akun yang ingin dinonaktifkan: ");
        int nomorAkun = input.nextInt();

        if (nomorAkun > 0 && nomorAkun <= jumlahAkun) {
            if (statusAktif[nomorAkun - 1]) {
                statusAktif[nomorAkun - 1] = false;
                System.out.println("Akun berhasil dinonaktifkan.");
            } else {
                System.out.println("Akun sudah nonaktif.");
            }
        } else {
            System.out.println("Nomor akun tidak valid.");
        }
    }
}