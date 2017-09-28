/*
 * Important Tweet
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
 * Represents an Important Tweet.
 *
 * @author team x
 * @version 1.5
 * @see Tweet
 * @since 1.0
 */

public class ImportantTweet extends Tweet{

    /**
     * Constructs an Important Tweet object.
     *
     * @param message tweet message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs an Important Tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public ImportantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    /**
     * Returns a Boolean calling it True.
     *
     * @returns Boolean True
     */
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
