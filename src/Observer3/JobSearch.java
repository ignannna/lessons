/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer3;

/**
 *
 * @author User
 */
public class JobSearch {
    public static void main(String[] args) {
        JavaDevelopersJobSite jobSite = new JavaDevelopersJobSite();
        
        Observer firstSubscriber =  new Subcriber("Jelena Petrova");
        Observer secondSubscriber =  new Subcriber("Tim Rex");
        Observer thirdSubscriber =  new Subcriber("Aaron Gimp");
        Observer fourSubscriber =  new Subcriber("Tom Klaas");
        
        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);
        jobSite.addObserver(thirdSubscriber);
        jobSite.addObserver(fourSubscriber);
        
        jobSite.addVacancy("Java developer in Tallinn");
        jobSite.addVacancy("Java developer in Berlin");
        jobSite.addVacancy("Java developer in Riga");
        
        jobSite.removeVacancy("Java developer in Tallinn");
        
    }
    
}
