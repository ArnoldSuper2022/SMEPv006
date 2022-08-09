package com.example.smepv006.base_data.bdp_parametros.tablas;

public class Tabla_Proyecto_BDP {
    private Integer id;
    private String idProyecto,descripcion,principalObjetivo,fechaInicioProyecto;

    public Tabla_Proyecto_BDP(Integer id, String idProyecto, String descripcion, String principalObjetivo, String fechaInicioProyecto) {
        this.id = id;
        this.idProyecto = idProyecto;
        this.descripcion = descripcion;
        this.principalObjetivo = principalObjetivo;
        this.fechaInicioProyecto = fechaInicioProyecto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrincipalObjetivo() {
        return principalObjetivo;
    }

    public void setPrincipalObjetivo(String principalObjetivo) {
        this.principalObjetivo = principalObjetivo;
    }

    public String getFechaInicioProyecto() {
        return fechaInicioProyecto;
    }

    public void setFechaInicioProyecto(String fechaInicioProyecto) {
        this.fechaInicioProyecto = fechaInicioProyecto;
    }
}
