package observable;

public interface EmailListSubjectInterface {
    public void  registerObserver(EmailListSubjectInterface observable);
    public void unregisterObserver(EmailListSubjectInterface observable);
    public void notifyObservers (EmailListSubjectInterface observable );
}
