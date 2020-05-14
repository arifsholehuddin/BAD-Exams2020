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
public class Soal7 {
    private String[] stack;
    private int top;
    private int iteration;

    public Soal7(int size) {
        stack = new String[size];
        top = -1;
        iteration = 0;
    }

    public void push(String value) {
        stack[++top] = value;
        iteration++;
    }

    public void pop() {
        int index = 4;
        String[] anotherArray = new String[stack.length - 1];
        System.arraycopy(stack, 0, anotherArray, 0, index);
        System.arraycopy(stack, index + 1, 
                         anotherArray, index, 
                         stack.length - index - 1);
        stack = anotherArray;
    }

    public void peek() {
        String result = new String();
        for (int i = 0; i < stack.length; i++) {
            result += stack[i];
            if (i != stack.length - 1) {
                result += ", ";
            }
        }
        System.out.println(result);
    }
   
    public void run() {
        System.out.println("================== Soal 7 ==================\n");
        Soal7 s = new Soal7(5);
        
        System.out.println("Memasukan Data Mata Kuliah [BAD,STATISTIKA,MATEMATIKA,AGAMA,KEWARGANEGARAAN]");
        s.push("BAD");
        s.push("STATISTIKA");
        s.push("MATEMATIKA");
        s.push("AGAMA");
        s.push("KEWARGANEGARAAN");
        System.out.println("List Data Pada Stack :");
        s.peek();
        s.pop();
        System.out.println("\nMengeluarkan Data Terakhir yg Masuk, stack menjadi :");
        s.peek();
        
        System.out.println("\n============================================");
    }
    
}
