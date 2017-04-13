/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observers;

import interfaces.IObserver;
import observable.CurrencyRecord;

/**
 *
 * @author eng-torky
 */
public class Bank implements IObserver {

    private double dollar;
    private double yen;

    public Bank() {
        CurrencyRecord.getCurrency().registerObserver(this);
        this.dollar = CurrencyRecord.getCurrency().getDollar();
        this.yen = CurrencyRecord.getCurrency().getYen();
    }

    @Override
    public void update() {
        this.dollar = CurrencyRecord.getCurrency().getDollar();
        this.yen = CurrencyRecord.getCurrency().getYen();
    }

    public void printDollar() {
        System.out.println("The &Dollar = " + this.dollar + " Pound, in Bank");
    }

    public void printYen() {
        System.out.println("The ¥Yen = " + this.yen + " Pound, in Bank");
    }

}
