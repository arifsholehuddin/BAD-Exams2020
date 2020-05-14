/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexams;

import java.util.*;

/**
 *
 * @author Arif Sholehuddin
 */
public class Soal8 {
    public void run() {
        System.out.println("================== Soal 8 ==================\n");
        List data = new ArrayList();
        data.add("Hari");
        data.add("ini");
        data.add("Kita");
        data.add("belajar");
        data.add("Java.");
        System.out.println("Data pada list : "+data);
        Object[] dataArr = data.toArray();
        String result = new String();
        for (Object dataArray : dataArr) {
            result += dataArray+" ";
        }
        System.out.println("Setelah di gabung menjadi : "+result);
        
        // Dapat Menggunakan fungsi join pada string
        //String str = String.join(" ", data);
        //System.out.println("Setelah di gabung menjadi : "+str);
        
        System.out.println("\n============================================");
    }
}
