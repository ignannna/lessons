/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletone;

/**
 *
 * @author User
 */
public class Singleton {
    public static Singleton uniqueInstance;
    
    private Singleton(){
        
    }
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
            System.out.println("The new instance of Singleton");
        }
        System.out.println("Returning instance...");
        return uniqueInstance;
        
    }
}
