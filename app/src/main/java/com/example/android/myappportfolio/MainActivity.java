package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the resource string for the toast notifications
        String launchSpotifyStreamer = getResources().getString(R.string.launch_spotify_streamer);
        String launchXYZReader =getResources().getString(R.string.launch_xyz_reader);
        String launchCapstone =getResources().getString(R.string.launch_capstone);
        String launchScoresApp =getResources().getString(R.string.launch_scores_app);
        String launchLibraryApp =getResources().getString(R.string.launch_library_app);
        String launchBuildItBigger =getResources().getString(R.string.launch_build_it_bigger);

        //Set toasts for each app button
        setToastForButton(R.id.spotify_streamer_button, launchSpotifyStreamer);
        setToastForButton(R.id.library_app_button, launchLibraryApp);
        setToastForButton(R.id.scores_app_button, launchScoresApp);
        setToastForButton(R.id.xyz_reader_button, launchXYZReader);
        setToastForButton(R.id.build_it_bigger_button, launchBuildItBigger);
        setToastForButton(R.id.capstone_button, launchCapstone);

    }

    //When a button is clicked on, a toast notification will apply
    void setToastForButton(int btnId, final CharSequence text)
    {
        Button appButton = (Button) findViewById(btnId);

        appButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
