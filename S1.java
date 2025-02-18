import java.util.Scanner;
import java.math.BigInteger;

public class S1 {
    static void ReadNilai(BigInteger[] Nilai, byte N) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            String input = scanner.next(); // Baca input sebagai String
            try {
                // Coba untuk mengonversi input ke long
                long longValue = Long.parseLong(input);
                Nilai[i] = BigInteger.valueOf(longValue); // Simpan sebagai BigInteger
            } catch (NumberFormatException e) {
                // Jika input melebihi batas long, simpan sebagai BigInteger
                Nilai[i] = new BigInteger(input);
            }
        }
        System.out.println(" ");
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan jumlah case : ");
        byte N = scanner.nextByte();
        BigInteger[] Nilai = new BigInteger[N]; // Ubah tipe array menjadi BigInteger

        ReadNilai(Nilai, N);

        for (int i = 0; i < N; i++) 
        {
            if (Nilai[i].compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && Nilai[i].compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0)
            {
                System.out.println(Nilai[i] + " can be fitted in: ");
            }

            // Mengecek apakah nilai dapat dimasukkan ke dalam tipe data yang lebih kecil
            if (Nilai[i].compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 && Nilai[i].compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) 
            {
                System.out.println("byte");
            }
            if (Nilai[i].compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 && Nilai[i].compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) 
            {
                System.out.println("short");
            }
            if (Nilai[i].compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 && Nilai[i].compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) 
            {
                System.out.println("integer");
            }
            if (Nilai[i].compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && Nilai[i].compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) 
            {
                System.out.println("long");
            } 
            else 
            {
                System.out.println(Nilai[i] + " can't be fitted anywhere");
            }

            System.out.println(" ");
        }

        scanner.close();
    }
}