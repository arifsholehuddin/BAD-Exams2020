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
public class Soal6 {
    public void run() {
        System.out.println("================== Soal 6 ==================\n");
        String str = "Handle Exception adalah mekanisme yang digunakan"
                + "\nuntuk menangani error yang terjadi pada aplikasi"
                + "\nsaat runtime(berjalan) atau biasa disebut"
                + "\nruntime error."
                + "\ncontohnya ketika aplikasi ingin mengakses sebuah"
                + "\narray menggunakan index yang out of bonds, maka"
                + "\nakan terjadi runtime error dengan ArrayIndexOutOfBoundsException."
                + "\njika error ini tidak ditangani maka program akan berhenti"
                + "\nsecara tidak normal."
                + "\njava menyediakan fitur handling exception secara built-in"
                + "\ndalam bentuk keyword try,catch dan finally, selain itu pada"
                + "\njava kita dapat membuat exception baru sesuai dengan kebutuhan."
                + "\nbeberapa yang dapat dikendalikan dengan handle exception :"
                + "\n1. Arithmatic Exception"
                + "\n   untuk menangani kesalahan pada perhitungan aritmatika."
                + "\n2. Null Pointer Exception"
                + "\n   ketika sebuah method mencoba mengakses objek yang null."
                + "\n3. Number Format Exception"
                + "\n   ketika melakukan casting tipe data yang ditidak dapat dilakukan."
                + "\n4. IO Exception"
                + "\n   ketika memasukan inputan yang tidak sesuai.";
        System.out.println(str);
        System.out.println("\n============================================");
    }
}
