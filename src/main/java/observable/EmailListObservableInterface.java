package observable;

public interface EmailListObservableInterface {
    //informuje o zmianie; Subject - inna nazwa interfejsu


    public void  registerObserver(EmailListObservableInterface observable);
    public void unregisterObserver(EmailListObservableInterface observable);
    public void notifyObservers (EmailListObservableInterface observable );


}
