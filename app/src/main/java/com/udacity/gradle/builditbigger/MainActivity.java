package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.admin.jokedisplay.JokeActivity;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void tellJoke(View view){
        //Joke joke = new Joke();
        //Toast.makeText(this, joke.getJoke(), Toast.LENGTH_SHORT).show();

        /*Intent intent = new Intent(this, JokeActivity.class);
        Joke joke = new Joke();
        String jokeString = joke.getJoke();
        intent.putExtra(JokeActivity.JOKE_KEY, jokeString);
        startActivity(intent);*/
        //new FetchJokeTask().execute(new Pair<Context, String>(this, ""));
      new FetchJokeTask(this).execute();
    }

    public void displayJoke(String joke) {

        Intent intent = new Intent(this, JokeActivity.class);
        intent.putExtra(JokeActivity.JOKE_KEY, joke);
        startActivity(intent);

    }


}
