import java.util.*;
public class NoSatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int hargabarang = 10000;

       System.out.print("Masukan Jumlah Barang Yang di Inginkan:");
       int jumlahBarang = input.nextInt();

       int totalHarga = hargabarang * jumlahBarang;
        System.out.println("Total harga: " + totalHarga);
      
        if (jumlahBarang <= 5 ){
        System.out.println("Harga Setelah Diskon: " + totalHarga);
       }else if (jumlahBarang <= 10){
          System.out.println((totalHarga) - totalHarga * 0.05);
       }else if (jumlahBarang <= 20){
        System.out.print("Harga Setelah Diskon: ");
        System.out.println((totalHarga) - totalHarga * 0.10);
       }else{
        System.out.print("Harga Setelah Diskon: ");
          System.out.println((totalHarga) - totalHarga * 0.20);
       }
    }    
}