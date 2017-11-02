package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.robotium.solo.Solo;

//removed junit.framework.TestCase, unused import

public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void setUp() throws Exception{
        solo = new Solo(getInstrumentation(), getActivity());
    }
    /**
    * Runs at the beginning of the tests
    * @throws Exception - if Solo is invalid throw exception
    */
    // added throws tag description, so developers understand why
    public void testStart() throws Exception {
        //Activity activity = getActivity();
        //Removed variable activity because it is never used
    }

    public void testTweet() {
        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
        solo.clickOnButton("Save");
        solo.enterText((EditText) solo.getView(R.id.body),"");

        assertTrue(solo.waitForText("Test Tweet!"));

        solo.clickOnButton("Clear");
    }

    public void testClickTweetList() {
        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
        solo.clickOnButton("Clear");

        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
        solo.clickOnButton("Save");
        solo.waitForText("Test Tweet!");

        solo.clickInList(0);
        solo.assertCurrentActivity("Wrong Activity", EditTweetActivity.class);
        assertTrue(solo.waitForText("Test Tweet!"));
    }
     /**
     * Runs at the end of tests
     * @throws Exception - if tests fail throw exception
     */
     //Added throw tag description, so developers understand why
    @Override
    public void tearDown() throws Exception{
        solo.finishOpenedActivities();
    }
}