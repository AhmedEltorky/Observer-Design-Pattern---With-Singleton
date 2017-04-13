/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observable;

import interfaces.IObservable;
import interfaces.IObserver;
import java.util.ArrayList;

/**
 *
 * @author eng-torky
 */
public class CurrencyRecord implements IObservable {

    private static CurrencyRecord currency = new CurrencyRecord();
    private double dollar;
    private double yen;
    private static int counter;
    private ArrayList<IObserver> arr;

    private CurrencyRecord() {
        arr = new ArrayList<IObserver>();
        this.dollar = 0;
        this.yen = 0;
        counter = 0;
    }

    public static CurrencyRecord getCurrency() {
        return currency;
    }

    public double getDollar() {
        return dollar;
    }

    public void setDollar(double dollar) {
        this.dollar = dollar;
        this.notifyObservers();
    }

    public double getYen() {
        return yen;
    }

    public void setYen(double yen) {
        this.yen = yen;
        this.notifyObservers();
    }

    @Override
    public void registerObserver(IObserver o) {
        arr.add(counter, o);
        counter++;
    }

    @Override
    public void removeObserver(IObserver o) {
        arr.remove(o);
        counter--;
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : arr) {
            observer.update();
        }
    }

}
