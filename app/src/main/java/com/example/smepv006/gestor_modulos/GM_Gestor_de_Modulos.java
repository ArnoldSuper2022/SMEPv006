package com.example.smepv006.gestor_modulos;

import com.example.smepv006.gestor_modulos.connection.GM_F_R;
import com.example.smepv006.gestor_modulos.connection.GM_F_S;

public class GM_Gestor_de_Modulos {

    private GM_F_S gm_F_s;
    private GM_F_R gm_f_r;


    public GM_Gestor_de_Modulos(GM_F_S gm_F_s) {
        this.gm_F_s = gm_F_s;
    }

    //TODO: GESTION DE SOLICITUD Y RESPUESTA
    public void GM_F_gestionDeSolicitudRespuesta(){

    }

    public GM_F_S getGm_F_s() {
        return gm_F_s;
    }

    public void setGm_F_s(GM_F_S gm_F_s) {
        this.gm_F_s = gm_F_s;
    }

    public GM_F_R getGm_f_r() {
        return gm_f_r;
    }

    public void setGm_f_r(GM_F_R gm_f_r) {
        this.gm_f_r = gm_f_r;
    }
}
