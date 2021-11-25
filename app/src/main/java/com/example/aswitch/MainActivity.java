package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch aSwitch,aSwitch2;
    Button b1;
    String state1="off",state2="off";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch=findViewById(R.id.s1);
        aSwitch2=findViewById(R.id.s2);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(view -> {
            if (aSwitch.isChecked()&&aSwitch2.isChecked()){
                state1=aSwitch.getTextOn().toString();
                state2=aSwitch2.getTextOn().toString();
                Toast.makeText(this , "switch 1 is "+state1+"\nswitch 2 is "+state2, Toast.LENGTH_SHORT).show();
            }
            else if (aSwitch.isChecked()&& !aSwitch2.isChecked()){
                state1=aSwitch.getTextOn().toString();
                state2=aSwitch.getTextOff().toString();
                Toast.makeText(this , "switch 1 is "+state1+"\nswitch 2 is "+state2, Toast.LENGTH_SHORT).show();
            }
            else if (aSwitch2.isChecked()&& !aSwitch.isChecked()){
                state1=aSwitch.getTextOff().toString();
                state2=aSwitch2.getTextOn().toString();
                Toast.makeText(this , "switch 1 is "+state1+"\nswitch 2 is "+state2, Toast.LENGTH_SHORT).show();
            }
            else {
                state1=aSwitch.getTextOff().toString();
                state2=aSwitch2.getTextOff().toString();
                Toast.makeText(this , "switch 1 is "+state1+"\nswitch 2 is "+state2, Toast.LENGTH_SHORT).show();
            }

        });

    }
}