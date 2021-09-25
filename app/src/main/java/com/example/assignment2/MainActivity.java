package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextName;
    Button clickHere;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName=(EditText) findViewById(R.id.editTextName);
        clickHere=(Button) findViewById(R.id.clickHere);
        display=(TextView) findViewById(R.id.display);

        clickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
 String name= editTextName.getText().toString();
 display.setText( "Hello" + name);
            }
        });
    }
}