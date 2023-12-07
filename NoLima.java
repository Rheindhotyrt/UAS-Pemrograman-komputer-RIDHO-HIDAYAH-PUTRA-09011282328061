import java.util.Scanner;
public class NoLima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = input.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = input.nextDouble();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan nomor operasi: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                penjumlahan(bilangan1, bilangan2);
                break;
            case 2:
                pengurangan(bilangan1, bilangan2);
                break;
            case 3:
                perkalian(bilangan1, bilangan2);
                break;
            case 4:
                pembagian(bilangan1, bilangan2);
                break;
            default:
                System.out.println("Operasi tidak valid");
        }
    }

    public static void penjumlahan(double a, double b) {
        double hasil = a + b;
        System.out.println("Hasil penjumlahan: " + hasil);
    }

    public static void pengurangan(double a, double b) {
        double hasil = a - b;
        System.out.println("Hasil pengurangan: " + hasil);
    }

    public static void perkalian(double a, double b) {
        double hasil = a * b;
        System.out.println("Hasil perkalian: " + hasil);
    }

    public static void pembagian(double a, double b) {
        if (b != 0) {
            double hasil = a / b;
            System.out.println("Hasil pembagian: " + hasil);
        } else {
            System.out.println("Pembagian oleh nol tidak valid");
        }
    }
}


