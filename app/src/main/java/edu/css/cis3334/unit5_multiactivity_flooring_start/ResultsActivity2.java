package edu.css.cis3334.unit5_multiactivity_flooring_start;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class ResultsActivity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_activity2);


        Intent i = getIntent();
        String width = i.getStringExtra("width");
        String length = i.getStringExtra("length");
        width = Double.parseDouble(width.toString());
        length = Double.parseDouble(etLength.getText().toString());


    }



}
