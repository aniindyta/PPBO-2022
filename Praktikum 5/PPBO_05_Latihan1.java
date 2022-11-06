// Nama : Anindita Putri Kirani
// NIM : M0521012

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class PPBO_05_Latihan1 {
    public static void main(String args[] ) throws Exception {
        Scanner Input = new Scanner(System.in);
        
        String Kalimat = Input.nextLine();
        
        for (int x = 0 ; x < Kalimat.length() ; x++) {
            if (x % 3 == 0) {
                System.out.print(Kalimat.charAt(x));
            }
        }
    }
}