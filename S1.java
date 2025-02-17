import java.util.Scanner;
import java.math.BigInteger;

class S1
{
    public static void Main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan jumlah case : ");
        byte N = scanner.nextByte();
        long Nilai[] = {};

        for(int i = 0; i < N; i++)
        {
            Nilai[i] = scanner.nextLong();
            byte DataCheck = (byte) Nilai[i];
        }

        for(int i = 0; i < N; i++)
        {
            
        }
        

        scanner.close();
    }
}