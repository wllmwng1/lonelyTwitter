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

    @Override
    public String CurrentMood() {
        return "Sad";
    }
}
