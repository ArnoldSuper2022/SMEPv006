package com.example.smepv006.gestor_modulos.connection;

import com.example.smepv006.gestor_modulos.gm_modulo_presentacion.respuestas.GM_CARGA_MP;

public class GM_F_R {

    private GM_CARGA_MP gm_cargaMP;

    public GM_F_R(GM_CARGA_MP gm_cargaMP) {
        this.gm_cargaMP = gm_cargaMP;
    }

    public GM_CARGA_MP getGm_carga() {
        return gm_cargaMP;
    }

    public void setGm_carga(GM_CARGA_MP gm_cargaMP) {
        this.gm_cargaMP = gm_cargaMP;
    }
}
