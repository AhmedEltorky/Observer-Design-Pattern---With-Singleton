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
public class CurrencyExchangeOffice implements IObserver {

    private double dollar;
    private double yen;

    public CurrencyExchangeOffice() {
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
        System.out.println("The &Dollar = " + this.dollar + " Pound, in currency exchange office");
    }

    public void printYen() {
        System.out.println("The ¥Yen = " + this.yen + " Pound, in currency exchange office");
    }

}
