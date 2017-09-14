package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by wwong1 on 9/13/17.
 */

public class SadMood extends ABC {
    private Date date;

    public SadMood(String mood) {
        super(mood);
    }

    public SadMood(String mood, Date date) {
        super(mood, date);
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String CurrentMood() {
        return "Sad";
    }
}
