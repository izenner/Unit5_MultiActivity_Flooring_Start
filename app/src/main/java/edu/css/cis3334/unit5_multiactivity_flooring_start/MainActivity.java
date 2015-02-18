package edu.css.cis3334.unit5_multiactivity_flooring_start;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends ActionBarActivity {

    EditText etWidth;
    EditText etLength;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etWidth = (EditText) findViewById(R.id.etWidth);
        etLength = (EditText) findViewById(R.id.etLength);

    }


    public void onClick(View v) {
        // declare an intent for our new activity
        double width = Double.parseDouble(etWidth.getText().toString());
        double length = Double.parseDouble(etLength.getText().toString());
        double total = width * length;
        String width1 = String.valueOf(width);
        String length1 = String.valueOf(length);
        String total1  = String.valueOf(total);
        Intent i = new Intent(this, ResultsActivity2.class);
        i.putExtra("width", width1);
        i.putExtra("length", length1);
        i.putExtra("total1", total1);
        startActivity(i);
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
