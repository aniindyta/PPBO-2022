// Nama : Anindita Putri Kirani
// NIM  : M0521012

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2;
        boolean lanjut = true;
        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama : ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua : ");
                bil2 = sc.nextInt();
                double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            }
        }

        sc.close();
    }
}

// Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER. 
// Jelaskan perbedaannya dengan source code sebelumnya (Latihan1)!
// Jawab: 
/* 
   Pada source code Latihan2 ini, program menggunakan exception handling dimana program akan menangkap
   exception kemudian mengulang kembali kode yang ada di dalam try {...}, sehingga program tetap berjalan
   karena ada yang menangani exception. Oleh sebab itu, apabila kita menginputkan huruf pada variabel 
   bil1 atau bil2 program akan tetap berlanjut dengan mengulang kode yang ada di dalam try {...}.
   Sedangkan pada source code sebelumnya (Latihan2) tidak menggunakan exception handling dimana ketika
   kita menginputkan huruf pada variabel bil1 atau bil2 maka akan terjadi InputMismatch dan program akan
   berhenti.

*/
