/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kollektsioon3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author User
 */
public class Massiv2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        
        measureTime(arrayList,"arrayList");
         
        List<Integer> linkedList = new LinkedList<>();
        
        measureTime(linkedList,"linkedList");
        
    }
    
    private static void measureTime(List<Integer> list,String desk){
        long start = System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++) {
           list.add (0,i);
                           
        }
        long end = System.currentTimeMillis();
        System.out.println(desk + " diff  " + (end - start));
        System.out.println("");
        
        for (int i = 0; i < 100000; i++) {
            list.get (i);
    }
    
}
}
