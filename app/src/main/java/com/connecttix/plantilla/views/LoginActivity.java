package com.connecttix.plantilla.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.connecttix.plantilla.R;

public class LoginActivity extends AppCompatActivity {

    private  final int REQUEST_ACCESS_FINE = 0;
    TextView holamundo;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        holamundo = (TextView) findViewById(R.id.tv_holamundo);
        holamundo.setText("Texto de prueba");

        /** Permisos de la app **/
        int accessFinePermission = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);
        int accessCoarsePermission = ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_COARSE_LOCATION);
        if(accessFinePermission!= PackageManager.PERMISSION_GRANTED &&
                accessCoarsePermission!=PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION,
                            Manifest.permission.ACCESS_COARSE_LOCATION
                    }, REQUEST_ACCESS_FINE);
        }
        /**Fin Permisos de la app**/
    }
}
