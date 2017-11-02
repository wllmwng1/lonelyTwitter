package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet2);
        Intent intent = getIntent();
        String message = intent.getStringExtra(LonelyTwitterActivity.EXTRA_MESSAGE);
        TextView text = (TextView)findViewById(R.id.TweetView);
        text.setText(message);
    }

}
