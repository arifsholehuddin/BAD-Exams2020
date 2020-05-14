/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexams;

import java.io.*;
import java.nio.file.*;

/**
 *
 * @author Arif Sholehuddin
 */
public class Soal5 {
    public void run() {
        System.out.println("================== Soal 5 ==================\n");
        System.out.println("Posisi Path Berada Pada C:\\Java\\");
        File dir = new File("C:\\Java\\BAD.txt");
        File newFile = new File("C:\\Java\\GantiNama.txt");
        System.out.println("Nama File Sebelum di ubah : "+dir.getName());
        dir.renameTo(newFile);
        newFile.setReadOnly();
        System.out.println("Nama File setelah di ubah : "+newFile.getName());
        if (!newFile.canWrite()) {
            System.out.println(newFile.getName() + " is readonly.");
        }
        System.out.println("\n============================================");
    }
}
