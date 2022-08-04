package com.example.smepv006.gestor_modulos.gm_modulo_presentacion;

import com.example.smepv006.gestor_modulos.GM_Gestor_de_Modulos;
import com.example.smepv006.gestor_modulos.gm_modulo_presentacion.respuestas.GM_CARGA_MP;
import com.example.smepv006.gestor_modulos.connection.GM_F_R;
import com.example.smepv006.gestor_modulos.connection.GM_F_S;
import com.example.smepv006.gestor_modulos.gm_modulo_presentacion.respuestas.GM_MP_R1;
import com.example.smepv006.gestor_modulos.gm_modulo_presentacion.respuestas.GM_MP_R2;
import com.example.smepv006.modulo_presentación.connection.CARGA_MP1;
import com.example.smepv006.modulo_presentación.connection.CARGA_MP2;

public class GM_F1_GESTION_MP extends GM_Gestor_de_Modulos {

    private GM_F_S gm_F_s;

    public GM_F1_GESTION_MP(GM_F_S gm_F_s) {
        super(gm_F_s);
        this.gm_F_s = gm_F_s;
    }
    @Override
    public void GM_F_gestionDeSolicitudRespuesta(){
        switch (gm_F_s.getACTIVIDAD()){
            case 1:
               GM_F1_P1_A1_T1(gm_F_s.getCarga_mp().getCarga_mp1());
                break;
            case 2:
                GM_F1_P1_A2_T1(gm_F_s.getCarga_mp().getCarga_mp2());
                break;
            default:
        }

    }
    //TODO: INICIAR MODULO
    private void GM_F1_P1_A1_T1(CARGA_MP1 carga_mp1){
        //Obtenemos los datos de la solicitud
        String carga = carga_mp1.getCarga();
        GM_F1_P1_A1_T2(carga);

    }
    public void GM_F1_P1_A1_T2(String carga){
        GM_CARGA_MP gm_cargaMP = new GM_CARGA_MP(new GM_MP_R1(carga));
        setGm_f_r(new GM_F_R(gm_cargaMP));
    }
    //TODO: FINALIZAR MODULO
    private void GM_F1_P1_A2_T1(CARGA_MP2 carga_mp2){
        //Obtenemos la solicitud;
        String carga = carga_mp2.getCarga();
        GM_F1_P1_A2_T2(carga);
    }
    private void GM_F1_P1_A2_T2(String carga){
        GM_CARGA_MP gm_carga_mp = new GM_CARGA_MP(new GM_MP_R2(carga));
        setGm_f_r(new GM_F_R(gm_carga_mp));
    }



}
