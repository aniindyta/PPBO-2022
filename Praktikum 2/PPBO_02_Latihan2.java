// Nama : Anindita Putri Kirani
// NIM  : M0521012

public class PPBO_02_Latihan2 {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String args[]) {
        // KURS_DOLLAR = 13500; -> Error
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}

/*  

Apa yang salah dengan source code tersebut?
Jawaban : Karena adanya percobaan untuk melakukan pengubahan nilai pada variabel ber-keyword final.
          Keyword final sendiri digunakan untuk pendeklarasian yang absolut (mutlak) sehingga 
          tidak dapat dilakukan pengubahan nilai.

Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
Jawaban : Penggunaan keyword static sebelum keyword final sendiri merupakan deklarasi static variable.
          Static variable sendiri merupakan variabel statis yang jumlah copy-nya hanya ada satu saja 
          selama aplikasi dijalankan. Misalkan apabila terdapat sebuah class dan class tersebut memiliki 
          seratus instance, tetap saja static variable dari class tersebut hanya ada satu saja di memori. 
          Oleh sebab itu, static variable juga sering dikenal dengan istilah class variable.
          Dengan demikian static ini merupakan keyword untuk membuat variabel yang dapat diakses langsung 
          dari dalam class tanpa harus menginisiasi objek terlebih dahulu. 
          Contohnya :
          NamaObject.namaStaticVariabel
          
          Sedangkan apabila tidak dideklarasikan menggunakan keyword static maka deklarasi ini merupakan
          instance variable. Dinamakan instance variable karena variabel tersebut adalah milik dari tiap 
          instance / object dari suatu class. Artinya, apabila sebuah class memiliki instance variable dengan
          nama 'A' maka tiap instance dari class tersebut akan memiliki variable 'A' sendiri-sendiri.
          Dengan demikian, deklarasi ini juga memungkinkan untuk dimasukkan ke dalam constructor.

          Penggunaan static final disini dimaksudkan untuk mendeklarasikan konstanta.
          Konstanta sendiri merupakan tempat untuk menyimpan nilai yang bersifat tetap dan tidak berubah.

*/
