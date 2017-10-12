package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import static java.util.jar.Pack200.Packer.ERROR;

/**
 * Created by wwong1 on 10/11/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
            super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }
    public void testAddTweet()
    {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));

        tweets = new TweetList();
        tweet = new NormalTweet("adding tweet");
        tweets.addTweet(tweet);
        Boolean test = Boolean.FALSE;
        try {tweets.addTweet(tweet);}
        catch (IllegalArgumentException e) {
            test = Boolean.TRUE;
        }
        assertTrue(test);
    }

    public void testDeleteTweet()
    {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.addTweet(tweet);
        tweets.deleteTweet(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testHasTweet()
    {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testGetTweet()
    {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        Tweet returnedTweet = list.getTweet(0);
        assertEquals(returnedTweet.getMessage(),tweet.getMessage());
    }

    public void testGetTweets()
    {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test", new Date(123) );
        Tweet tweet1 = new NormalTweet("last tweet", new Date(1000002432));
        list.addTweet(tweet1);
        list.addTweet(tweet);
        ArrayList<Tweet> returnedTweets = list.getTweets();
        ArrayList<Tweet> testcase = new ArrayList<Tweet>();
        testcase.add(tweet);
        testcase.add(tweet1);
        assertEquals(returnedTweets, testcase);
    }

    public void testGetCount()
    {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        int size = list.getCount();
        assertEquals(size, 1);

        list = new TweetList();
        size = list.getCount();
        assertEquals(size, 0);
    }
}
