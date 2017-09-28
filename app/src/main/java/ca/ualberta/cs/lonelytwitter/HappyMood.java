/*
 * Happy Mood
 *
 * Version 1.5
 *
 * Copyright (c) 2017 Team X, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at Univeristy of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc..ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Happy Mood
 *
 * @author team x
 * @version 1.5
 * @see ABC
 * @since 1.0
 */

public class HappyMood extends ABC{
    private Date date;

    /**
     * Constructs a Happy Mood.
     *
     * @param mood ABC mood
     */
    public HappyMood(String mood) {
        super(mood);
    }

    /**
     * Constructs a Happy Mood.
     *
     * @param mood ABC mood
     * @param date ABC mood
     */
    public HappyMood(String mood, Date date) {
        super(mood, date);
    }

    @Override
    /**
     * Returns that it is a Happy mood.
     *
     * @return String "Happy"
     *
     */
    public String CurrentMood() {
        return "Happy";
    }
}
