/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collektsii;

import static java.awt.SystemColor.text;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.nio.file.Files.lines;
import static java.nio.file.Files.lines;
import static java.nio.file.Files.lines;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream stream = new FileInputStream("d:/moscow-buildings.csv");
        int length = stream.available();
        byte[] data = new byte[length];
        stream.read(data);
        String text = new String(data);
//        System.out.println(text);
            String[] lines = text.split("\n");

        List<String[]> lineWords = new ArrayList<>();
        for (String line : lines) {
            String[] words = line.split(",");
            lineWords.add(words);

//   for(String line: lines){
//       System.out.println(line);
//       System.out.println("-----------------------");
        }
        for (String[] words : lineWords) {
//            for (String word = words ) {
//                System.out.print(word);
//                System.out.print("|");
//            }
//            System.out.println("end of string");
            if (words[0].equals("2281097")) {
                for (String word : words) {
                    System.out.print(word);
                    System.out.print("|");
                }
                
                System.out.println("\n-----------------------");
            }

        }
    }
}
