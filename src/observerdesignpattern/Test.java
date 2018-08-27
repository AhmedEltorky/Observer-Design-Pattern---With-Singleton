package observerdesignpattern;

import java.util.Scanner;
import observable.CurrencyRecord;
import observers.Bank;
import observers.CurrencyExchangeOffice;

/**
 *
 * @author Ahmed El-Torky
 */
public class Test {

    public static void main(String[] args) {
        CurrencyRecord.getCurrency().setDollar(20.20);
        CurrencyRecord.getCurrency().setYen(13.45);
        Bank bank = new Bank();
        CurrencyExchangeOffice CEO = new CurrencyExchangeOffice();

        while (true) {
            System.out.println("------------------------------------------------------");
            bank.printDollar();
            bank.printYen();
            CEO.printDollar();
            CEO.printYen();
            System.out.println("******************************************************");
            System.out.println("Currency Record:");
            System.out.println("Please enter Dollar value:");
            CurrencyRecord.getCurrency().setDollar(new Scanner(System.in).nextDouble());
            System.out.println("Please enter Yen value:");
            CurrencyRecord.getCurrency().setYen(new Scanner(System.in).nextDouble());
        }
    }

}
