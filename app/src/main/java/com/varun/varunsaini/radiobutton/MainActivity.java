package com.varun.varunsaini.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rd;
    RadioButton radio_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rd=(RadioGroup)findViewById(R.id.radiogroup);

    }

    public void submit(View view) {
        int select=rd.getCheckedRadioButtonId();
        radio_b=(RadioButton)findViewById(select);
        Toast.makeText(getApplicationContext(),radio_b.getText().toString(),Toast.LENGTH_LONG).show();

    }
}