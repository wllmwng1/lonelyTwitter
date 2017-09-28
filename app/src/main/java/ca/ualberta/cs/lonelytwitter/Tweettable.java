/*
 * Tweettable
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
 * Represents if it is Tweetable.
 *
 * @author team x
 * @version 1.5
 * @since 1.0
 */

public interface Tweettable {
    public String getMessage();
    public Date getDate();
}
