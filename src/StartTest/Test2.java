/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author User
 */
public class Test2 {
    public static void main(String[] args) {
//        List<Person> persons = new ArrayList<>();
//        persons.add(new Person("Sergei", "Petrov"));
//        persons.add(new Person("Aleksei", "Smirnov"));
//        persons.add(new Person("Petr", "Green"));
//        
//        for (Person person : persons) {
//            person.sayHello();
//        person.sayBye();

        System.out.println("-------------");
        Map<Integer, Person> person2 = new HashMap<>();
        person2.put(151516, new Person("Sergei", "Petrov"));
        person2.put(216849, new Person("Aleksei", "Smirnov"));
        person2.put(398481, new Person("Petr", "Green"));
            
           for (Map.Entry<Integer, Person> entry: person2.entrySet()){
           entry.getValue().sayHello();
           entry.getValue().sayBye();
           
        }
    
        
    }
    
    
}
