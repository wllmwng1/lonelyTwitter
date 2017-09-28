/*
 * Tweet
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
 * Represents a Tweet.
 *
 * @author team x
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweettable {

    private String message;
    private Date date;

    /**
     * Constructs a Tweet object.
     *
     * @param message
     */
    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    /**
     * Constructs a Tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

    /**
     * Gets the Tweet message.
     *
     * @return tweet message
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets the tweet message.
     *
     * @param message Tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();

        }
        else{
            this.message = message;
        }
    }

    /**
     * Sets the tweet message.
     *
     * @param date
     */
    public void setDate(Date date) {this.date = date; }

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
    public Date getDate() {
        return date;
    }

    /**
     * Checks if it is an important Tweet.
     *
     * @return Boolean true
     */
    public abstract Boolean isImportant();
}
