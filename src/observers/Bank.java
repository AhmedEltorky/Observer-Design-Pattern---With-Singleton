package observers;

import interfaces.IObserver;
import observable.CurrencyRecord;

/**
 *
 * @author Ahmed El-Torky
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
