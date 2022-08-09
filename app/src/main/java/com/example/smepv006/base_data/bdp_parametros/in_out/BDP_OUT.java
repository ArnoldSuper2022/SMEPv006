package com.example.smepv006.base_data.bdp_parametros.in_out;

public class BDP_OUT {
    private Boolean IS_OK;
    private Boolean IS_DATA_IN_TABLE;
    private BDP_CARGA_OUT  BDP_CARGA_OUT;
    //TODO: CUANDO LA CONSULTA ES SOBRE SI EXISTE LA TABLA
    public BDP_OUT(Boolean IS_OK, Boolean IS_DATA_IN_TABLE) {
        this.IS_OK = IS_OK;
        this.IS_DATA_IN_TABLE = IS_DATA_IN_TABLE;
    }
    // TODO: CUANDO LA CONSULTA ES PARA AÑADIR DATOS Y BORRAR DATOS

    public BDP_OUT(Boolean IS_OK) {
        this.IS_OK = IS_OK;
    }
    //TODO: MOSTRAR DATOS DE TABLA

    public BDP_OUT(Boolean IS_OK,BDP_CARGA_OUT BDP_CARGA_OUT) {
        this.IS_OK = IS_OK;
        this.BDP_CARGA_OUT = BDP_CARGA_OUT;
    }

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

    public com.example.smepv006.base_data.bdp_parametros.in_out.BDP_CARGA_OUT getBDP_CARGA_OUT() {
        return BDP_CARGA_OUT;
    }

    public void setBDP_CARGA_OUT(com.example.smepv006.base_data.bdp_parametros.in_out.BDP_CARGA_OUT BDP_CARGA_OUT) {
        this.BDP_CARGA_OUT = BDP_CARGA_OUT;
    }
}
