import java.util.Scanner;
public class NoEnam {
    
        public static void main(String[] args) {
            Scanner masukan = new Scanner(System.in);
    
            System.out.print("Masukkan kata atau frase: ");
            String input = masukan.nextLine();
    
            if (isPalindrom(input)) {
                System.out.println("Palindrom: Ya");
            } else {
                System.out.println("Palindrom: Tidak");
            }
    
        }
    
      
        public static boolean isPalindrom(String str) {
            String cleanStr = str.replaceAll("\\s", "").toLowerCase();
    
            int left = 0;
            int right = cleanStr.length() - 1;
    
            while (left < right) {
                if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
    
            return true;
        }
    }
     

