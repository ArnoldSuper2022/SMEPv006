package com.example.smepv006.base_data.bdp_parametros.tablas;

public class Tabla_Indicadores_BDP {
    private Integer id;
    private String idProducto,codigoIndicador,tipoIndicador,idIndicador,indicador,meta,unidad;

    public Tabla_Indicadores_BDP(Integer id, String idProducto, String codigoIndicador, String tipoIndicador, String idIndicador, String indicador, String meta, String unidad) {
        this.id = id;
        this.idProducto = idProducto;
        this.codigoIndicador = codigoIndicador;
        this.tipoIndicador = tipoIndicador;
        this.idIndicador = idIndicador;
        this.indicador = indicador;
        this.meta = meta;
        this.unidad = unidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoIndicador() {
        return codigoIndicador;
    }

    public void setCodigoIndicador(String codigoIndicador) {
        this.codigoIndicador = codigoIndicador;
    }

    public String getTipoIndicador() {
        return tipoIndicador;
    }

    public void setTipoIndicador(String tipoIndicador) {
        this.tipoIndicador = tipoIndicador;
    }

    public String getIdIndicador() {
        return idIndicador;
    }

    public void setIdIndicador(String idIndicador) {
        this.idIndicador = idIndicador;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}
