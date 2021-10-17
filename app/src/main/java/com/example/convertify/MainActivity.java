package com.example.convertify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView3;
    private EditText editText;
    private EditText editTextNumber2;
    private  TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView3 = findViewById(R.id.textView3);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextTextPersonName2);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.getText().clear();
                editTextNumber2.getText().clear();
                Toast.makeText(MainActivity.this, "Thanks For using Convertify", Toast.LENGTH_SHORT).show();
           }
        });

    }

        public void kgToPound(View v)
        {
            try {
                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
                float pound =  (float) (2.205 * kg);
                editTextNumber2.setText(" "+pound);
            } catch (Exception e)
            {
                Toast.makeText(MainActivity.this,"Invalid Action",Toast.LENGTH_SHORT).show();
            }


        }

        public void poundToKG(View v)
        {
            try {
                String s = editTextNumber2.getText().toString();
                int pound = Integer.parseInt(s);
                float kg = (float) (pound / 2.205) ;
                editText.setText(" "+ kg);
            } catch (Exception e)
            {
                Toast.makeText(MainActivity.this,"Invalid Action",Toast.LENGTH_SHORT).show();
            }


        }

}