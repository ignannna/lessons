/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author User
 */
public class Clearning extends Company{
    
     @Override
    Employee[] getEmploees(){
        System.out.println("");
        System.out.println("Starting company activity" +Clearning.class.getSimpleName() + "\n");
        Employee[] employee = new Employee[4];
        employee[0]= new Cleaner();
        employee[1]= new Cleaner();
        employee[2]= new Cleaner();
        employee[3]= new Manager();
      
        
       return employee;
    }
    
}
