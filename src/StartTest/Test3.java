/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartTest;

/**
 *
 * @author User
 */
public class Test3 {
    {
        System.out.println("We are in block");
    }
    
    static {
        System.out.println("We are STATIC in block1");
    }
    public Test3(){
        System.out.println("Constructor has worked");
    }
    {
        System.out.println("We are in block 2");
    }
    public static void main(String[] args) {
        
        Test3 test = new Test3();
        Test3 test2 = new Test3();
        
    }
    
}

