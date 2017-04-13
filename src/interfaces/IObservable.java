/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author eng-torky
 */
public interface IObservable {

    public void registerObserver(IObserver o);

    public void removeObserver(IObserver o);

    public void notifyObservers();

}
