import java.util.*;
import java.lang.Math;

public class GajihKaryawan {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int nIK;
        String Nama;
        float gajipokok;
        double hasil;
        System.out.println("Masukan Nama ");
        nama = input.nextLine();
        System.out.println("Masukan Nik ");
        nIK = input.nextInt();
        System.out.println("Masukan Gaji Pokok ");
        gajipokok = input.nextFloat();
        hasil =  (gajipokok+(0.05 * gajipokok) + (0.1 * gajipokok)) -(0.025*gajipokok) ;
        System.out.println("Nama : " +nama);
        System.out.println("Nik : " +nIK);
        System.out.println("Gajih Bersih  : " +hasil);

    }
}