package com.example.smepv006.base_data.bd_parametros;

public class BD_OUTPUT {
    private Boolean IS_OK;
    private Boolean IS_DATA_IN_TABLE;
    private BD_CARGA_OUT BD_CARGA_OUT;

    public BD_OUTPUT() {
    }
    public BD_OUTPUT(Boolean IS_OK) {
        this.IS_OK = IS_OK;
    }

    public BD_OUTPUT(Boolean IS_OK, Boolean IS_DATA_IN_TABLE) {
        this.IS_OK = IS_OK;
        this.IS_DATA_IN_TABLE = IS_DATA_IN_TABLE;
    }


    public BD_OUTPUT(Boolean IS_OK, BD_CARGA_OUT BD_CARGA_OUT) {
        this.IS_OK = IS_OK;
        this.BD_CARGA_OUT = BD_CARGA_OUT;
    }
    //*************************************************
    public Boolean getIS_OK() {
        return IS_OK;
    }

    public void setIS_OK(Boolean IS_OK) {
        this.IS_OK = IS_OK;
    }

    public Boolean getIS_DATA_IN_TABLE() {
        return IS_DATA_IN_TABLE;
    }

    public void setIS_DATA_IN_TABLE(Boolean IS_DATA_IN_TABLE) {
        this.IS_DATA_IN_TABLE = IS_DATA_IN_TABLE;
    }

    public com.example.smepv006.base_data.bd_parametros.BD_CARGA_OUT getBD_CARGA_OUT() {
        return BD_CARGA_OUT;
    }

    public void setBD_CARGA_OUT(com.example.smepv006.base_data.bd_parametros.BD_CARGA_OUT BD_CARGA_OUT) {
        this.BD_CARGA_OUT = BD_CARGA_OUT;
    }
}
