package com.example.smepv006.gestor_modulos.connection;

import com.example.smepv006.modulo_presentación.connection.CARGA_MP;

public class GM_F_S {

   private int ACTIVIDAD;
   private int TAREA;

    public int getACTIVIDAD() {
        return ACTIVIDAD;
    }

    public void setACTIVIDAD(int ACTIVIDAD) {
        this.ACTIVIDAD = ACTIVIDAD;
    }

    public int getTAREA() {
        return TAREA;
    }

    public void setTAREA(int TAREA) {
        this.TAREA = TAREA;
    }

    //TODO: MODULO DE PRESENTACIÓN
    private CARGA_MP carga_mp;

    public GM_F_S(int ACTIVIDAD, int TAREA, CARGA_MP carga_mp) {
        this.ACTIVIDAD = ACTIVIDAD;
        this.TAREA = TAREA;
        this.carga_mp = carga_mp;
    }

    public CARGA_MP getCarga_mp() {
        return carga_mp;
    }

    public void setCarga_mp(CARGA_MP carga_mp) {
        this.carga_mp = carga_mp;
    }
    //TODO: MODULO
}
