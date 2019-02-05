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
public abstract class Company {
    Employee[] getEmploees(){
        return null;
    };
    
    void startWorking(Employee[] emp){
        for (Employee empoeer : emp) {
           empoeer.doWork();
        }
//        for (Employee empoeer : empoeers){
//            empoeer.doWork();
//        }
    };
    
}
