package interfaces;

/**
 *
 * @author Ahmed El-Torky
 */
public interface IObservable {

    public void registerObserver(IObserver o);

    public void removeObserver(IObserver o);

    public void notifyObservers();

}
