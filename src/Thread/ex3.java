/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ex3 {
    static class Recipe implements Runnable {

        @Override
        public void run() {
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ex3.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            System.err.println("... ������� �� �������");

        }

    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Recipe());
        thread.start();

        thread.setName("Cook");
        System.err.println(thread.getName());
        System.err.println(Thread.currentThread().getName());
}
}