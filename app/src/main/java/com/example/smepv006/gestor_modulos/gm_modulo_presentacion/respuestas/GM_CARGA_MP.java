package com.example.smepv006.gestor_modulos.gm_modulo_presentacion.respuestas;

import com.example.smepv006.gestor_modulos.gm_modulo_presentacion.respuestas.GM_MP_R1;
import com.example.smepv006.modulo_presentación.connection.CARGA_MP1;

public class GM_CARGA_MP {


    // TODO: RESPUESTA 1
    private GM_MP_R1 gm_mp_r1;

    public GM_CARGA_MP(GM_MP_R1 gm_mp_r1) {
        this.gm_mp_r1 = gm_mp_r1;
    }

    public GM_MP_R1 getGm_mp_r1() {
        return gm_mp_r1;
    }

    public void setGm_mp_r1(GM_MP_R1 gm_mp_r1) {
        this.gm_mp_r1 = gm_mp_r1;
    }

    //TODO: RESPUESTA 2
    private GM_MP_R2 gm_mp_r2;

    public GM_CARGA_MP(GM_MP_R2 gm_mp_r2) {
        this.gm_mp_r2 = gm_mp_r2;
    }

    public GM_MP_R2 getGm_mp_r2() {
        return gm_mp_r2;
    }

    public void setGm_mp_r2(GM_MP_R2 gm_mp_r2) {
        this.gm_mp_r2 = gm_mp_r2;
    }
}
