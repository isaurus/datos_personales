package com.example.datospersonales;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class MainActivity extends AppCompatActivity {

    /*
    // Declaración de los EditText
    private EditText edtNombre;
    private EditText edtApellidos;
    private EditText edtEmail;
    private EditText edtTelefono;
     */

    // Declaración de Array para almacenar los EditText
    EditText[] arrayEditText;

    // Declaración de los ImageButton
    private ImageButton imgbAbajo;
    private ImageButton imgbArriba;

    // Declaración de SwitchCompat
    private SwitchCompat swInformacionLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        // Instancia de los EditText
        edtNombre = findViewById(R.id.edtNombre);
        edtApellidos = findViewById(R.id.edtApellidos);
        edtEmail = findViewById(R.id.edtEmail);
        edtTelefono = findViewById(R.id.edtTelefono);
         */

        // Instancia de Array de los EditText
        arrayEditText = new EditText[]{
                findViewById(R.id.edtNombre),
                findViewById(R.id.edtApellidos),
                findViewById(R.id.edtEmail),
                findViewById(R.id.edtTelefono),
        };

        // Instancia de los ImageButton
        imgbAbajo = findViewById(R.id.imbAbajo);
        imgbArriba = findViewById(R.id.imbArriba);

        // Instancia de SwitchCompat
        swInformacionLog = findViewById(R.id.swInformacionLog);

        // Listener para ImageButton (flecha abajo)
        imgbAbajo.setOnClickListener(v -> focoAbajo());
        imgbArriba.setOnClickListener(v -> focoArriba());
    }

    protected void focoAbajo(){

    }
}