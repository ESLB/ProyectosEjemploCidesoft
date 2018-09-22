package fii.cidesoft.eduardo.DetailsAct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import fii.cidesoft.eduardo.R;

public class DetailsSreen extends AppCompatActivity {

    private ImageView Foto;
    private TextView Nombre;
    private List<String> fotos = new ArrayList<>();
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_sreen_act);

        Nombre = (TextView) findViewById(R.id.txt_nombre);
        Foto = (ImageView) findViewById(R.id.img_perfil);

        fotos.add(R.drawable.sherlock_holmes + "");
        fotos.add(R.drawable.sherlock_silhouette + "");
        fotos.add(R.drawable.sherlock_tres + "");

        Nombre.setText("Sherlock Holmes");
        Foto.setImageResource(R.drawable.sherlock_holmes);

        Nombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==3){
                    i = 0;
                }
                Foto.setImageResource( Integer.parseInt(fotos.get(i)));
                i++;
            }
        });

    }
}
