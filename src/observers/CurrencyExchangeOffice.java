package observers;

import interfaces.IObserver;
import observable.CurrencyRecord;

/**
 *
 * @author Ahmed El-Torky
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
