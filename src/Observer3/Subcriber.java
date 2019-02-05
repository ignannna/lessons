/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer3;

import java.util.List;

/**
 *
 * @author User
 */
public class Subcriber implements Observer{
    String name;
    
    public Subcriber(String name){
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancics) {
        System.out.println("Dear" + name + "\nWe have some changes in vacansics" + vacancics +
    "\n------------------------\n");
    }
    
}
