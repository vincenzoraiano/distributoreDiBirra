package com.example.distributoredibirra;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    public void cercaLaBirra(View view){


        //creo una variabile di tipo testo
        TextView brands=(TextView) findViewById(R.id.brands);
        //usando la varaibile brands posso settare il nome restituito dal testo
        //modificando il testo
        brands.setText("Una Bottiglia di birra!");

        //creo una variabile di tipo spinner.
        Spinner colore=(Spinner) findViewById(R.id.spinnerId);
        //assegno al colore il valore selezionato dallo spinner.
        String.valueOf(colore.getSelectedItemId());
        //restituisce il valore in stringa nel log di sistema.
        Log.i("colore della birra",colore.getSelectedItem().toString());


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
