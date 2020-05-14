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
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Soal1 soal1 = new Soal1();
        soal1.run();
        
        Soal2 soal2 = new Soal2();
        soal2.run();
        
        Soal3 soal3 = new Soal3();
        soal3.run();
        
        Soal4 soal4 = new Soal4();
        soal4.run();
        
        Soal5 soal5 = new Soal5();
        soal5.run();
        
        Soal6 soal6 = new Soal6();
        soal6.run();
        
        Soal7 soal7 = new Soal7(5);
        soal7.run();
        
        Soal8 soal8 = new Soal8();
        soal8.run();
        
        Soal9 soal9 = new Soal9();
        soal9.run();
        
        Soal10 soal10 = new Soal10();
        soal10.setVisible(true);
    }
}
