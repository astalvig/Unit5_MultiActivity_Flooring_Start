package edu.css.cis3334.unit5_multiactivity_flooring_start;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "edu.css.cis3334.unit5_multiactivity_flooring_start.MESSAGE";

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

    public void onClick (View view){
        //do something when button clicked
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editTextW = (EditText) findViewById(R.id.etWidth);
        EditText editTextL = (EditText) findViewById(R.id.etLength);
        int width = Integer.parseInt(editTextW.getText().toString());
        int length = Integer.parseInt(editTextL.getText().toString());
        String message = "Flooring Needed: \n" + "The width = " + editTextW.getText().toString() +
                "\nThe length = " + editTextL.getText().toString() +
                "\nThe total flooring required = " + width * length;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
