/*
 * Normal Tweet
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
 * Represents a Normal Tweet
 *
 * @author team x
 * @version 1.5
 * @see Tweet
 * @since 1.0
 */

public class NormalTweet extends Tweet {

    /**
     * Constructs a Normal Tweet.
     *
     * @param message Tweet message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs a Normal Tweet.
     *
     * @param message
     * @param date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    /**
     * Returns that it is not Important.
     *
     * @returns Boolean False
     */
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
