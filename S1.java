import java.util.Scanner;
import java.math.BigInteger;

public class S1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Membaca jumlah test case
        scanner.nextLine(); // Newline setelah angka N

        String[] numbers = new String[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextLine(); // Membaca angka sebagai string
        }

        for (int i = 0; i < N; i++) {
            String number = numbers[i];

            try {
                BigInteger num = new BigInteger(number);
                int bitLength = num.bitLength();

                // Cek apakah dapat dimasukkan dalam tipe long
                if (bitLength <= 63) {
                    System.out.println(number + " can be fitted in:");
                    System.out.println("* long");
                }

                // Cek apakah dapat dimasukkan dalam tipe int
                if (bitLength <= 31) {
                    System.out.println("* int");
                }

                // Cek apakah dapat dimasukkan dalam tipe short
                if (bitLength <= 15) {
                    System.out.println("* short");
                }

                // Cek apakah dapat dimasukkan dalam tipe byte
                if (bitLength <= 7) {
                    System.out.println("* byte");
                }

                // Jika tidak dapat dimasukkan dalam tipe data apapun
                if (bitLength > 63) {
                    System.out.println(number + " can't be fitted anywhere.");
                }
            } catch (Exception e) {
                System.out.println(number + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}
