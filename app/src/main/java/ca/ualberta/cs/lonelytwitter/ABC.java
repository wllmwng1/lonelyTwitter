/*
 * Copyright (c) 2017 Team X, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at Univeristy of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc..ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents ABC(which is a abstract base class for Mood).
 *
 * @author team x
 * @version 1.5
 * @see SadMood
 * @see HappyMood
 * @since 1.0
 */

public abstract class ABC {
    private Date date;
    private String mood;

    /**
     * Constructs a Mood.
     *
     * @param mood ABC mood
     */
    public ABC(String mood) {
        date = new Date();
        this.mood = mood;
    }

    /**
     * Constructs a Mood.
     * @param mood ABC mood
     * @param date ABC date
     */
    public ABC(String mood, Date date) {
        this.date = date;
        this.mood = mood;
    }

    /**
     * Sets the mood.
     *
     * @param mood ABC mood
     */
    public void setMood(String mood){
        this.mood = mood;
    }

    /**
     * Returns the date.
     *
     * @return date ABC date
     */
    public Date getDate(){
        return date;
    }

    /**
     * Sets the date.
     *
     * @param date ABC date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Checks the current mood.
     *
     * @return String
     */
    public abstract String CurrentMood();
}
