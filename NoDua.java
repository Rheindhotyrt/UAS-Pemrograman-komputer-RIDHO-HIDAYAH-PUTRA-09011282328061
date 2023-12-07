import java.util.Scanner;

public class NoDua {

    public static void main(String[] args) {
        
        String username = "ridhohp";
        String password = "1234";

    
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = input.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = input.nextLine();

       
        if (inputUsername.equals(username)&&inputPassword.equals(password)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }

    
    }
}
