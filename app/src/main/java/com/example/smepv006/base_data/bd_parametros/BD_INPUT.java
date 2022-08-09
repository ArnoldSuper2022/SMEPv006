package com.example.smepv006.base_data.bd_parametros;

import android.content.ContentValues;

public class BD_INPUT {
    private int ID_OPERACION;
    //1 = AÑADIR DATOS A LA TABLA [WRITE]
    //2 = LEER DATOS DE TABLA [READ]
    //3 = VERIFICAR SI EXISTE LA TABLA [READ]
    //4 = BORRAR ELEMNTOS DE LA TABLA [WRITE]
    private int ID_TABLA;
    private ContentValues cvDATA;

    public BD_INPUT(int ID_OPERACION, int ID_TABLA) {
        this.ID_OPERACION = ID_OPERACION;
        this.ID_TABLA = ID_TABLA;
    }

    public BD_INPUT(int ID_OPERACION, int ID_TABLA, ContentValues cvDATA) {
        this.ID_OPERACION = ID_OPERACION;
        this.ID_TABLA = ID_TABLA;
        this.cvDATA = cvDATA;
    }

    public int getID_OPERACION() {
        return ID_OPERACION;
    }

    public void setID_OPERACION(int ID_OPERACION) {
        this.ID_OPERACION = ID_OPERACION;
    }

    public int getID_TABLA() {
        return ID_TABLA;
    }

    public void setID_TABLA(int ID_TABLA) {
        this.ID_TABLA = ID_TABLA;
    }

    public ContentValues getCvDATA() {
        return cvDATA;
    }

    public void setCvDATA(ContentValues cvDATA) {
        this.cvDATA = cvDATA;
    }
}
