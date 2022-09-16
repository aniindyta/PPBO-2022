import java.text.DecimalFormat;

// Nama : Anindita Putri Kirani
// NIM  : M0521012

public class PPBO_02_Latihan1 {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.0;
        float c = 4.3f;

        double jumlahBilangan = Double.valueOf(a) + b + Double.valueOf(c);

        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println(df.format(jumlahBilangan));
    }
}

// ubah variabel a dan c ke tipe data double
// jumlahkan variabel a, b, dan c
// tampilkan hasil penjumlahan ketiga variabel

/*
 * Output yang diharapkan:
    17.3
 */