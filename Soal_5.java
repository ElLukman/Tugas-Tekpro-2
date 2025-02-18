import java.util.Scanner;

public class Soal_5 {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        String A,B;
        A = scanner.next();
        B = scanner.next();

        System.out.println(A.length()+B.length());


        if(A.compareTo(B)>0)
        {
            System.out.println("yes");

        }
        else
        {
            System.out.println("no");
        }

        A = toTitleCase(A);
        B = toTitleCase(B);

        System.out.println(A + " " + B);

    }

    public static String toTitleCase(String s)
    {
        char[] newS = s.toCharArray();
        newS[0] = Character.toUpperCase(newS[0]);
        return String.valueOf(newS);
    }

}