package observable;

import java.util.ArrayList;

public class EmailList extends ArrayList<EmailListObservableInterface> implements EmailListSubjectInterface {




    public void registerObserver(EmailListSubjectInterface observable) {
        add(observable);

    }

    public void unregisterObserver(EmailListSubjectInterface observable) {
        remove(observable);
    }

    public void notifyObservers(EmailListSubjectInterface observable) {
        for (EmailListObservableInterface item : this)
        {
            item.update(this)
        }
    }
}