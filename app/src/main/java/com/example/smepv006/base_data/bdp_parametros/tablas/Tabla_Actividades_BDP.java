package com.example.smepv006.base_data.bdp_parametros.tablas;

public class Tabla_Actividades_BDP {
    private Integer id;
    private String idProducto,idIndicador,idActividad,actividad,fechaStart,fechaEnd,idResponsables;

    public Tabla_Actividades_BDP(Integer id, String idProducto, String idIndicador, String idActividad, String actividad, String fechaStart, String fechaEnd, String idResponsables) {
        this.id = id;
        this.idProducto = idProducto;
        this.idIndicador = idIndicador;
        this.idActividad = idActividad;
        this.actividad = actividad;
        this.fechaStart = fechaStart;
        this.fechaEnd = fechaEnd;
        this.idResponsables = idResponsables;
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

    public String getIdIndicador() {
        return idIndicador;
    }

    public void setIdIndicador(String idIndicador) {
        this.idIndicador = idIndicador;
    }

    public String getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(String idActividad) {
        this.idActividad = idActividad;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getFechaStart() {
        return fechaStart;
    }

    public void setFechaStart(String fechaStart) {
        this.fechaStart = fechaStart;
    }

    public String getFechaEnd() {
        return fechaEnd;
    }

    public void setFechaEnd(String fechaEnd) {
        this.fechaEnd = fechaEnd;
    }

    public String getIdResponsables() {
        return idResponsables;
    }

    public void setIdResponsables(String idResponsables) {
        this.idResponsables = idResponsables;
    }
}
