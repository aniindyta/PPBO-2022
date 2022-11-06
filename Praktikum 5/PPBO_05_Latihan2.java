// Nama : Anindita Putri Kirani
// NIM : M0521012

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PPBO_05_Latihan2 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        String Kata = Input.nextLine();
        
        String StringPattern1 = "[AaIiUuEeOo].*";
        String StringPattern2 = ".*(ng)";
        
        Input.close();
            
        if (Kata.matches(StringPattern1)){
            System.out.print(1);
        } else if (Kata.matches(StringPattern2)) {
            System.out.print(2);
        } else {
            System.out.print(-1);
        }
        
    }
}