package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by wwong1 on 9/13/17.
 */

public abstract class ABC {
    private Date date;
    private String mood;

    public ABC(String mood) {
        date = new Date();
        this.mood = mood;
    }

    public ABC(String mood, Date date) {
        this.date = date;
        this.mood = mood;
    }

    public void setMood(String mood){
        this.mood = mood;
    }
    public Date getDate(){
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String CurrentMood();
}
