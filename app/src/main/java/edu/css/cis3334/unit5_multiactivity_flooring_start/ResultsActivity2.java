package edu.css.cis3334.unit5_multiactivity_flooring_start;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;


public class ResultsActivity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_activity2);
        TextView txtResults;

        Intent intent = getIntent();
        String total1 = intent.getExtras().getString("total1");
        String width = intent.getExtras().getString("width");
        String length = intent.getExtras().getString("length");
        txtResults = (TextView) findViewById(R.id.txtResult);
        txtResults.setText("Width is " + width + " and Length is " + length + " and flooring needed is " + total1);

    }



}
