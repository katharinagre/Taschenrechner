package com.example.sepp.taschenrechner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Ergebnis, Ueberschrift;
    EditText Zahl1, Zahl2;
    Button berechnen;

    double ergebnisBerechnung;
    double zahlEins;
    double zahlZwei;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ergebnis = (TextView)findViewById(R.id.Ergebnis);

        Zahl1 = (EditText)findViewById(R.id.zahl1);
        Zahl2 = (EditText)findViewById(R.id.zahl2);

        berechnen = (Button)findViewById(R.id.berechnen);

        berechnen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                zahlEins = Double.parseDouble(Zahl1.getText().toString());
                zahlZwei = Double.parseDouble(Zahl2.getText().toString());
                ergebnisBerechnung = zahlEins / zahlZwei;
                Ergebnis.setText(String.valueOf(ergebnisBerechnung));

            }}

            );}
}
