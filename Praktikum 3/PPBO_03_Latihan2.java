// Nama : Anindita Putri Kirani
// NIM  : M0521012

import java.util.Scanner;

class PPBO_03_Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = sc.nextInt();

        /*
        Algoritma Tahun Kabisat
        1. Jika angka tahun itu habis dibagi 400, maka tahun itu sudah pasti tahun kabisat.
        2. Jika angka tahun itu tidak habis dibagi 400 tetapi habis dibagi 100, 
        maka tahun itu sudah pasti bukan merupakan tahun kabisat.
        3. Jika angka tahun itu tidak habis dibagi 400, tidak habis dibagi 100 akan tetapi 
        habis dibagi 4, maka tahun itu merupakan tahun kabisat.
        4. Jika angka tahun tidak habis dibagi 400, tidak habis dibagi 100, 
        dan tidak habis dibagi 4, maka tahun tersebut bukan merupakan tahun kabisat.
         */
        
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println(+ year + " is a leap year.");
                } else {
                    System.out.println(+ year + " is not a leap year.");
                }
            } else {
                System.out.println(+ year + " is a leap year.");
            }
        } else {
            System.out.println(+ year + " is not a leap year.");
        }

        sc.close();
    }
}

// Buatlah conditional statement untuk melakukan pengecekan terhadap input variabel 'year'
// Cek apakah input merupakan tahun kabisat
// Jika tahun kabisat, berikat output '... is a leap year'
// Jika bukan tahun kabisat, berikan output '... is not a leap year'
// ... di atas maksudnya adalah nilai variabel 'year' yang diinputkan

// Contoh 
// input : 2020
// output : 2020 is a leap year

// Contoh
// input : 2031
// output : 2031 is not a leap year