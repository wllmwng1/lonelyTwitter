package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by wwong1 on 9/13/17.
 */

public class HappyMood extends ABC{
    private Date date;

    public HappyMood(String mood) {
        super(mood);
    }

    public HappyMood(String mood, Date date) {
        super(mood, date);
    }

    @Override
    public String CurrentMood() {
        return "Happy";
    }
}
