/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sungleton1;

import Singletone.Singleton;

/**
 *
 * @author User
 */
public class Controller0 {
    public static void main(String[] args) {
//        Boiler0 boiler = new Boiler0();
        Boiler0 boiler = Boiler0.getInstance();
        Boiler0 boiler1 = Boiler0.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
        
    }
    
}
