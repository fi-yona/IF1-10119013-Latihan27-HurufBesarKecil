/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan27.hurufbesarkecil;

/**
 *
 * @author Fiona Avila
 */

import java.util.Scanner;


public class IF110119013Latihan27HurufBesarKecil {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        String inputKalimat = scan.next();
        System.out.println();
        
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Huruf besar : ".concat(inputKalimat.toUpperCase()));
        System.out.println("Huruf kecil : ".concat(inputKalimat.toLowerCase())); 
    }
    
}
