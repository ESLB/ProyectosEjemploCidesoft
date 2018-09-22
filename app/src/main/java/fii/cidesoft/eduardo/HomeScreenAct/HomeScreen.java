package fii.cidesoft.eduardo.HomeScreenAct;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import fii.cidesoft.eduardo.DetailsAct.DetailsSreen;
import fii.cidesoft.eduardo.R;

public class HomeScreen extends AppCompatActivity {

    private Button Aprietame;
    private Button QuienSoy;
    private TextView Mensaje;
    private int i = 1;
    private List<String> mensajes = new ArrayList<>();
    private Context primary = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen_act);

        Aprietame = (Button) findViewById(R.id.btn_aprietame);
        QuienSoy = (Button) findViewById(R.id.btn_quien);
        Mensaje = (TextView) findViewById(R.id.txt_mensaje);


        mensajes.add("CIDESOOOOOFT");
        mensajes.add("Ella no te ama");
        mensajes.add("Todo se puede con fe");
        mensajes.add("Eres gil y morirás gil!");


        Mensaje.setText(mensajes.get(0));

        Aprietame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==4){
                    i=0;
                }
                Mensaje.setText(mensajes.get(i));
                i++;
            }
        });

        QuienSoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cambio = new Intent(primary , DetailsSreen.class);
                startActivity(cambio);
            }
        });

    }
}


