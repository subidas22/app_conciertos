package com.example.prueba;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private FloatingActionButton boton_entrada_asiento_a;
    private TextView contador_entrada_asiento;
    private int numero_contador_entrada_asiento = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina1);

        boton_entrada_asiento_a=findViewById(R.id.boton_entrada_asiento_asignado);
        contador_entrada_asiento = findViewById(R.id.contador_entradas_asiento_asignado);

        boton_entrada_asiento_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero_contador_entrada_asiento++;
                contador_entrada_asiento.setText(String.valueOf(numero_contador_entrada_asiento));

            }
        });



    }
}