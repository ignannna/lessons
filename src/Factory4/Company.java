/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory4;

import Factory.*;
import java.util.List;

/**
 *
 * @author User
 */
public abstract class Company {
    List getEmploees(){
        return null;
    };
    
    void startWorking(List<Employee> empoeers){
        for (Employee emp : empoeers) {
           emp.doWork();
        }
//        for (Employee empoeer : empoeers){
//            empoeer.doWork();
//        }
    };
    
}
