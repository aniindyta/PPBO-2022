// Nama : Anindita Putri Kirani
// NIM : M0521012

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PPBO_05_Latihan3 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        char Char1 = Input.next().charAt(0);
        char Char2 = Input.next().charAt(0);
        
        if (Char1 > Char2) {
            char Temp = Char2;
            Char2 = Char1;
            Char1 = Temp;
        }
        
        String Output = "";
        
        while (Char1 <= Char2) {
            Output += Char1;
            Char1++;
        }
        
        System.out.print(Output);
        
    }
}