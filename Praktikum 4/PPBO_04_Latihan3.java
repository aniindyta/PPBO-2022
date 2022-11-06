// Nama : Anindita Putri Kirani
// NIM  : M0521012

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan3 {
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
                // double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
                int hasil = bil1 / bil2;
                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            } catch (ArithmeticException e) {
                System.out.println("Pembagian dengan 0 tidak dapat dilakukan");
            }
        }

        sc.close();
    }
}

// Pembagian bilangan dengan 0 seharusnya tidak dapat dilakukan. Tambahkan catch statement
// tambahan untuk menangani pembagian dengan 0 pada source code tersebut!

/* 
    Pembagian bilangan dengan 0 seharusnya tidak dapat dilakukan. Oleh karena itu kita dapat
    menambahkan code code exception handling untuk menangani pembagian dengan 0 pada source
    code diatas.
    
    catch (ArithmeticException e) {
                System.out.println("Tidak boleh membagi dengan 0 (nol)");
            }

    Selain itu, kita juga perlu mengubah double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
    menjadi int hasil = bil1 / bil2;
    Hal tersebut dikarenakan tipe data double dapat melakukan pembagian dengan 0.
    Sehingga, apabila tidak diubah maka tidak akan ada error dan exception tidak akan terjadi.
*/
