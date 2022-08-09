package com.example.smepv006.base_data.bdp_parametros.tablas;

public class Tabla_DescripAct_BDP {
    private Integer id;
    private String idProducto,idIndicador,idActiviad,descripcion;

    public Tabla_DescripAct_BDP(Integer id, String idProducto, String idIndicador, String idActiviad, String descripcion) {
        this.id = id;
        this.idProducto = idProducto;
        this.idIndicador = idIndicador;
        this.idActiviad = idActiviad;
        this.descripcion = descripcion;
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

    public String getIdActiviad() {
        return idActiviad;
    }

    public void setIdActiviad(String idActiviad) {
        this.idActiviad = idActiviad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
