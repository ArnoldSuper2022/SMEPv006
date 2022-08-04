package com.example.smepv006;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.smepv006.gestor_modulos.GM_Gestor_de_Modulos;
import com.example.smepv006.gestor_modulos.connection.GM_F_S;
import com.example.smepv006.gestor_modulos.gm_modulo_presentacion.GM_F1_GESTION_MP;
import com.example.smepv006.modulo_presentación.connection.CARGA_MP;
import com.example.smepv006.modulo_presentación.connection.CARGA_MP1;
import com.example.smepv006.modulo_presentación.connection.CARGA_MP2;

public class MainActivity extends AppCompatActivity {
    //MODIFICAMOS EN EL SERVER ELIAS
    //BUENO AQUI TE RESPONDO ARNOLD
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // PROCESO 1: PROCESO DE BIENVENIDA
        setContentView(R.layout.activity_main);
        TextView tvMuestra = (TextView) findViewById(R.id.tvMuestra);
        Button btnCambiar = (Button) findViewById(R.id.btnCambiar);
        Button btnVolver = (Button) findViewById(R.id.btnVolver);
        EditText edtCarga = (EditText)findViewById(R.id.edtCarga);
        btnCambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO:SOLICITUD 1-INICIAR MODULO(GM-F1-S1)
                String carga = edtCarga.getText().toString();
                GM_Gestor_de_Modulos gm = new GM_F1_GESTION_MP(new GM_F_S(1,1,new CARGA_MP(new CARGA_MP1(carga))));
                gm.GM_F_gestionDeSolicitudRespuesta();
                tvMuestra.setText(gm.getGm_f_r().getGm_carga().getGm_mp_r1().getSaludo());

            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: SOLICITUD 2
                String carga = "Volver";
                GM_Gestor_de_Modulos gm = new GM_F1_GESTION_MP(new GM_F_S(2,1,new CARGA_MP(new CARGA_MP2(carga))));
                gm.GM_F_gestionDeSolicitudRespuesta();
                tvMuestra.setText(gm.getGm_f_r().getGm_carga().getGm_mp_r2().getCarga());
            }
        });
    }
}
