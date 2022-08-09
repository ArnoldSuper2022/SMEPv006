package com.example.smepv006.base_data.bdp_parametros.tablas;

public class Tabla_Resultados_BDP {
    private Integer id;
    private String idProducto,descripcion;

    public Tabla_Resultados_BDP(Integer id, String idProducto, String descripcion) {
        this.id = id;
        this.idProducto = idProducto;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
