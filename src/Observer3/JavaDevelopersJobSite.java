/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class JavaDevelopersJobSite implements Observed {
    
    List<String> vacansics = new ArrayList<>();
    
    List<Observer> subscribers = new ArrayList<>();
    
    public void addVacancy(String vacancy) {
        this.vacansics.add(vacancy);
        notifyObservers();
    }
    
    public void removeVacancy(String vacancy) {
        this.vacansics.remove(vacancy);
        notifyObservers();
        
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }
    
    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }
    
    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.vacansics);
        }
        
    }
}
