/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexams;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Arif Sholehuddin
 */
public class Soal3 {
    public void run(){
        System.out.println("================== Soal 3 ==================\n");
        try{
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse("30/03/2020");
            String format = "EEEE, dd MMMM yyyy";
            Locale local = new Locale("id", "ID");;
            String result = reFormatDate(date, format, local);
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("\n============================================");
    }
    
    public String reFormatDate(Date date, String format, Locale local){
        String result = null;
        SimpleDateFormat formatter = null;
        if (local == null) {
            formatter = new SimpleDateFormat(format);
        } else {
            formatter = new SimpleDateFormat(format, local);
        }
 
        result = formatter.format(date);
        return result;
    }
}
