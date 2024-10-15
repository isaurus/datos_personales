package com.example.datospersonales;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Declaración de Array para almacenar los EditText
    EditText[] arrayEditText;

    // Declaración de los ImageButton
    private ImageButton imgbAbajo;
    private ImageButton imgbArriba;

    // Declaración de SwitchCompat
    private SwitchCompat swInformacionLog;
    private ArrayList<String> logs; // Array<String> para la cadena de logs

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instancia de Array de los EditText
        arrayEditText = new EditText[]{
                findViewById(R.id.edtNombre),
                findViewById(R.id.edtApellidos),
                findViewById(R.id.edtEmail),
                findViewById(R.id.edtTelefono),
        };

        arrayEditText[0].requestFocus(); // Seleccionamos el foco "por defecto"

        // Instancia de los ImageButton
        imgbAbajo = findViewById(R.id.imbAbajo);
        imgbArriba = findViewById(R.id.imbArriba);

        // Instancia de SwitchCompat
        swInformacionLog = findViewById(R.id.swInformacionLog);

        // Listener para ImageButton (flecha abajo)
        imgbAbajo.setOnClickListener(v -> focoAbajo());
        imgbArriba.setOnClickListener(v -> focoArriba());

        /*
        swInformacionLog.setOnCheckedChangeListener((compoundButton, checkedId) -> {
            activarLogs(checkedId, logs);
        });*/
    }

    protected void focoAbajo(){
        int pos = 0;    // Variable auxiliar para almacenar la posición actual del foco
        for (int i = 0; i < arrayEditText.length; i++){     // Recorre el array de EditText para "descubrir" el foco
            if (arrayEditText[i].hasFocus()){
                pos = i;
            }
        }
        if(pos == (arrayEditText.length - 1)){
            arrayEditText[0].requestFocus();
        }else{
            arrayEditText[++pos].requestFocus();
        }
    }

    protected void focoArriba(){
        int pos = 0;
        for (int i = 0; i < arrayEditText.length; i++){
            if (arrayEditText[i].hasFocus()){
                pos = i;
            }
        }

        if (pos == 0){
            arrayEditText[arrayEditText.length - 1].requestFocus();
        } else{
            arrayEditText[--pos].requestFocus();
        }
    }
    private void activarLogs(Boolean checkedId, ArrayList<String> logs) {
        if(checkedId){
            logs.add("----------------------------");
            for(String log : logs){
                Log.i("DAM", log);
            }
            logs.clear();
        }
    }
}