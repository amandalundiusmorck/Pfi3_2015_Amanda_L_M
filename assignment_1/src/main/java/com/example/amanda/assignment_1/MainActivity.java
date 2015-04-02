package com.example.amanda.assignment_1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Random;
import android.util.Log;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity {

//Used to write random quotes in the showQuotes fields

    Random rand1 = new Random();
    Random rand2 = new Random();
    int n1 = 0;
    boolean n2 = false;

    //When the button is pushed, a random quote from the list will be written to a random showQuotes
    public void buttonOnClick(View v) {
//Send to logcat
        Log.i("MyAPP", "Button Pressed");
        TextView t1 = (TextView) findViewById(R.id.showQuote);
        TextView t2 = (TextView) findViewById(R.id.showQuote);  

//First, clear the textViews
        t1.setText(null);
        t2.setText(null);

        String[] quotes = getResources().getStringArray(R.array.quotes);
        n1 = rand1.nextInt(quotes.length);
        n2 = rand2.nextBoolean();
        if (n2 == true) {
            t1.setText(quotes[n1]);
        }
        if (n2 == false) {
            t2.setText(quotes[n1]);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("onCreate", "executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart", "executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume", "executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause", "executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop", "executed");
    }

        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
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

