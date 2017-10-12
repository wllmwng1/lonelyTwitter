package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by wwong1 on 10/11/17.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){}

    public void addTweet(Tweet tweet){
        if (this.hasTweet(tweet) == Boolean.TRUE){
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }
    public void deleteTweet(Tweet tweet){
        tweets.remove(tweet);
    }
    public Tweet getTweet(int index){
        return tweets.get(index);
    }
    public ArrayList<Tweet> getTweets(){
       ArrayList<Tweet> sortedTweets =  (ArrayList<Tweet> )tweets.clone();
        Collections.sort(sortedTweets, new Comparator<Tweet>() {
            public int compare(Tweet lhs, Tweet rhs) {
                return lhs.getDate().compareTo(rhs.getDate());
//                Date left = lhs.getDate();
//                Date right = rhs.getDate();
//                if (left.after(right)) {
//                    return 1;
//                }
//                else if (left.before(right)) {
//                    return -1;
//                }
//                else {
//                    return 0;
//                }
            }
        });
        return sortedTweets;
    }
    public int getCount(){
        return tweets.size();
    }
}
