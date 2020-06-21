package com.connecttix.plantilla.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.connecttix.plantilla.R;

public class LoginActivity extends AppCompatActivity {

    TextView holamundo;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        holamundo = (TextView) findViewById(R.id.tv_holamundo);

        holamundo.setText("Texto de prueba");

    }
}
