package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    String string;
    EditText name;
    RadioGroup dept;
    RadioButton sel;
    CheckBox two,four,bus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submit);
        name = findViewById(R.id.name);
        dept = findViewById(R.id.Dept);
        two = findViewById(R.id.twoWheeler);
        four = findViewById(R.id.fourWheeler);
        bus = findViewById(R.id.bus);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder transport = new StringBuilder();
                if(two.isChecked()){
                    transport.append("Two Wheeler ");
                }
                if (four.isChecked()){
                    transport.append("Four Wheeler ");
                }
                if (bus.isChecked()){
                    transport.append("Bus ");
                }
                sel = findViewById(dept.getCheckedRadioButtonId());
                string = name.getText().toString() + " in " + sel.getText().toString() + " department and uses " + transport.toString() + "as transport";
                Toast.makeText(getApplicationContext(),string,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"Restarted",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Destroyed",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"Paused",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"Started",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"Stopped",Toast.LENGTH_SHORT).show();
    }


}