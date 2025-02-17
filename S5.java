import java.util.Scanner;

public class S5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            // Membaca input string A dan B
            String A = sc.nextLine().trim();  // Menambahkan trim() untuk menghapus whitespace
            String B = sc.nextLine().trim();

            // 1. Menjumlahkan panjang kedua string
            int sumOfLengths = A.length() + B.length();
            System.out.println(sumOfLengths);

            // 2. Mengecek apakah A lebih besar secara leksikografis dari B
            if (A.compareTo(B) > 0) 
            {
                System.out.println("Yes");
            } 
            else 
            {
                System.out.println("No");
            }

            // 3. Mengubah huruf pertama menjadi kapital dan menampilkan hasil
            String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
            String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
            System.out.println(capitalizedA + " " + capitalizedB);
        }
    }
}
