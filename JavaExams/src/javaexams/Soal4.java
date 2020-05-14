/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexams;

/**
 *
 * @author Arif Sholehuddin
 */
public class Soal4 {
    public void run(){
        System.out.println("================== Soal 4 ==================\n");
        String str = "Overloading adalah feature yang digunakan untuk"
                + "\ndapat mendeklarasikan dua buah method dengan nama"
                + "\nyang sama tetapi memiliki parameter yang berbeda,"
                + "\ntujuan overloading adalah untuk memudahkan penggunaan"
                + "\nmethod dengan fungsi yang hampir sama."
                + "\ncontoh :"
                + "\n\n public String GetValueString(){"
                + "\n   // TODO code application logic here"
                + "\n }"
                + "\n\n public String GetValueString(String param){"
                + "\n   // TODO code application logic here"
                + "\n }"
                + "\n\nOverriding adalah sebuah teknik untuk membuat"
                + "\nmethod subclass sama dengan method superclass (parent)"
                + "\nparameter sama tetapi implementasinya berbeda."
                + "\nada beberapa aturan ketika menggunakan overriding seperti :"
                + "\n1. parameter pada subclass harus sama dengan superclass (parent)"
                + "\n2. hak akses pada subclass tidak boleh lebih ketat dari suprclass (parent)"
                + "\ncontoh :"
                + "\n\n public class hewan {"
                + "\n   public void bergerak(){"
                + "\n       System.out.println('Hewan bergerak.')"
                + "\n   }"
                + "\n }"
                + "\n\n public class sapi extends hewan {"
                + "\n   public void bergerak(){"
                + "\n       System.out.println('Sapi bergerak.')"
                + "\n   }"
                + "\n }";
        System.out.println(str);
        System.out.println("\n============================================");
    }
}
