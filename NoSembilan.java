import java.util.Stack;

public class NoSembilan {

    public static boolean cekUrutanKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (char karakter : ekspresi.toCharArray()) {
            if (karakter == '(' || karakter == '{' || karakter == '[') {
                stack.push(karakter);
            } else if (karakter == ')' || karakter == '}' || karakter == ']') {
                if (stack.isEmpty() || !urutanKurungCocok(stack.pop(), karakter)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean urutanKurungCocok(char buka, char tutup) {
        return (buka == '(' && tutup == ')') ||
               (buka == '{' && tutup == '}') ||
               (buka == '[' && tutup == ']');
    }

    public static void main(String[] args) {
        String ekspresi1 = "(a + b) * (c - d)";
        String ekspresi2 = "{[a + b] * (c - d)}";
        String ekspresi3 = "((a + b) * (c - d)";
        String ekspresi4 = "a + b) * (c - d)";

        System.out.println("Ekspresi 1: " + (cekUrutanKurung(ekspresi1) ? "Benar" : "Salah"));
        System.out.println("Ekspresi 2: " + (cekUrutanKurung(ekspresi2) ? "Benar" : "Salah"));
        System.out.println("Ekspresi 3: " + (cekUrutanKurung(ekspresi3) ? "Benar" : "Salah"));
        System.out.println("Ekspresi 4: " + (cekUrutanKurung(ekspresi4) ? "Benar" : "Salah"));
    }
}
