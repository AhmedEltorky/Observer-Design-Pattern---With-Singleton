/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

import java.util.Scanner;
import observable.CurrencyRecord;
import observers.Bank;
import observers.CurrencyExchangeOffice;

/**
 *
 * @author eng-torky
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CurrencyRecord.getCurrency().setDollar(20.20);
        CurrencyRecord.getCurrency().setYen(13.45);
        Bank bank = new Bank();
        CurrencyExchangeOffice CEO = new CurrencyExchangeOffice();
        
        while (true) {
            bank.printDollar();
            bank.printYen();
            CEO.printDollar();
            CEO.printYen();
            System.out.println("Please enter Dollar value:");
            CurrencyRecord.getCurrency().setDollar(new Scanner(System.in).nextDouble());
            System.out.println("Please enter Yen value:");
            CurrencyRecord.getCurrency().setYen(new Scanner(System.in).nextDouble());
        }
    }

}
