package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.test.AndroidTestCase;

import com.example.admin.myapplication.backend.jokesApi.JokesApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;


public class FetchJokeTaskTest extends AndroidTestCase {

    private static JokesApi myApiService = null;
    private Context context;


    public void testAsyncJoke() throws Throwable {
        // create  a signal to let us know when our task is done.
        final CountDownLatch signal = new CountDownLatch(1);

        final AsyncTask<Context, Void, String> myTask = new AsyncTask<Context, Void, String>() {

            @Override
            protected String doInBackground(Context... params) {
                if (myApiService == null) {  // Only do this once
                    JokesApi.Builder builder = new JokesApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                            .setRootUrl("https://jokesendpoint.appspot.com/_ah/api/");
                    myApiService = builder.build();
                }

                try {
                    return myApiService.tellJoke().execute().getData();
                } catch (IOException e) {
                    return e.getMessage();
                }
            }

            @Override
            protected void onPostExecute(String result) {
                super.onPostExecute(result);
                signal.countDown();
            }
        };

    }

}
